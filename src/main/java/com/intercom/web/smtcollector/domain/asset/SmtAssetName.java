package com.intercom.web.smtcollector.domain.asset;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtEntityIdentifier;
import com.intercom.web.smtcollector.domain.SmtValueObject;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.validator.GenericValidator;

@JacksonXmlRootElement(localName = "name")
@JsonPropertyOrder({
	"value",
	"baseName",
	"extension"})
public class SmtAssetName implements SmtEntityIdentifier<SmtAssetName>, Comparable<SmtAssetName> {

	public enum TemporaryAction implements SmtValueObject<TemporaryAction> {

		CREATE {
			@Override
			public boolean isCreate() {
				return true;
			}

		}, UPDATE {
			@Override
			public boolean isUpdate() {
				return true;
			}

		};

		public boolean isCreate() {
			return false;
		}

		public boolean isUpdate() {
			return false;
		}

		@Override
		public boolean sameValueAs(TemporaryAction other) {
			return ((other != null) && (this.equals(other)));
		}

	}
	private String value;
	public static final String BASE_NAME_PATTERN = "^[^\\\\/:\\*\\?<>\\|]+$";
	public static final String EXTENSION_PATTERN = "^[a-zA-Z0-9]+$";
	public static final String ACTION_PATTERN = ("^" + StringUtils.join(TemporaryAction.values(), "|") + "$");
	public static final String UUID_PATTERN = "^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$";
	public static final String VALUE_PATTERN = ("^" + StringUtils.substringBetween(BASE_NAME_PATTERN, "^", "$") + "\\." + StringUtils.substringBetween(EXTENSION_PATTERN, "^", "$") + "$");
	public static final String TEMPORARY_VALUE_PATTERN = ("^(" + StringUtils.substringBetween(VALUE_PATTERN, "^", "$") + ")" + "_(" + StringUtils.substringBetween(ACTION_PATTERN, "^", "$") + ")_" + StringUtils.substringBetween(UUID_PATTERN, "^", "$") + "\\." + StringUtils.substringBetween(EXTENSION_PATTERN, "^", "$") + "$");
	public static final int VALUE_MIN_LENGTH = 1;
	public static final int VALUE_MAX_LENGTH = 255;
	public static final boolean CASE_SENSITIVE = false;

	protected SmtAssetName() {
		super();
	}

	public SmtAssetName(String value) {
		Validate.notNull(value, "The \"value\" parameter can not be null.");
		Validate.matchesPattern(value, VALUE_PATTERN, "The \"value\" parameter must match the \"%s\" pattern.", VALUE_PATTERN);
		Validate.inclusiveBetween(VALUE_MIN_LENGTH, VALUE_MAX_LENGTH, value.length(), "The \"value\" parameter must be between %d and %d characters in length.", VALUE_MIN_LENGTH, VALUE_MAX_LENGTH);
		this.value = value;
	}

	public static SmtAssetName valueOf(String value) {
		return new SmtAssetName(value);
	}

	public static boolean isValid(String value) {
		return ((value != null) && GenericValidator.matchRegexp(value, VALUE_PATTERN) && GenericValidator.isInRange(value.length(), VALUE_MIN_LENGTH, VALUE_MAX_LENGTH));
	}

	@JsonProperty(value = "value")
	public String getValue() {
		return value;
	}

	@JsonIgnore
	public String getBaseName() {
		return FilenameUtils.getBaseName(value);
	}

	@JsonIgnore
	public String getExtension() {
		return FilenameUtils.getExtension(value);
	}

	@JsonIgnore
	public Boolean isTemporary() {
		return Pattern.compile(TEMPORARY_VALUE_PATTERN).matcher(value).matches();
	}

	@JsonIgnore
	public SmtAssetName getTemporary(String extension, TemporaryAction action) {
		Validate.isTrue(!isTemporary(), "The name is already temporary");
		Validate.notNull(extension, "The \"extension\" parameter can not be null.");
		Validate.matchesPattern(extension, EXTENSION_PATTERN, "The \"extension\" parameter must match the \"%s\" pattern.", EXTENSION_PATTERN);
		Validate.notNull(action, "The \"action\" parameter can not be null.");
		return valueOf(value + "_" + action + "_" + UUID.randomUUID() + "." + extension);
	}

	@JsonIgnore
	public TemporaryAction getTemporaryAction() {
		Validate.isTrue(isTemporary(), "The name is not temporary");
		Matcher temporaryMatcher = Pattern.compile(TEMPORARY_VALUE_PATTERN).matcher(value);
		temporaryMatcher.find();
		return TemporaryAction.valueOf(temporaryMatcher.group(2));
	}

	@JsonIgnore
	public SmtAssetName getOriginal() {
		Validate.isTrue(isTemporary(), "The name is not temporary");
		Matcher temporaryMatcher = Pattern.compile(TEMPORARY_VALUE_PATTERN).matcher(value);
		temporaryMatcher.find();
		return valueOf(temporaryMatcher.group(1));
	}

	@Override
	public boolean sameValueAs(SmtAssetName other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append((CASE_SENSITIVE ? value : value.toLowerCase()), (CASE_SENSITIVE ? other.value : other.value.toLowerCase()))
		.isEquals();
	}

	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if((object == null) || (getClass() != object.getClass())) {
			return false;
		}
		final SmtAssetName other = (SmtAssetName) object;
		return sameValueAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append((CASE_SENSITIVE ? value : value.toLowerCase()))
		.toHashCode();
	}

	@Override
	public String toString() {
		return getValue();
	}

	@Override
	public int compareTo(SmtAssetName other) {
		Validate.notNull(other, "The \"other\" parameter can not be null.");
		return new CompareToBuilder()
		.append(value, other.value)
		.toComparison();
	}

}
