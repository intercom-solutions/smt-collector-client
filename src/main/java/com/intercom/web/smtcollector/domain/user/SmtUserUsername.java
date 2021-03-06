package com.intercom.web.smtcollector.domain.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtEntityIdentifier;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.validator.GenericValidator;

@JacksonXmlRootElement(localName = "username")
@JsonPropertyOrder({
	"value"})
public class SmtUserUsername implements SmtEntityIdentifier<SmtUserUsername>, Comparable<SmtUserUsername> {

	private String value;
	public static final String VALUE_PATTERN = "^[A-Za-z0-9]+(?:\\.[A-Za-z0-9]+)*$";
	public static final int VALUE_MIN_LENGTH = 4;
	public static final int VALUE_MAX_LENGTH = 20;
	public static final boolean CASE_SENSITIVE = false;

	protected SmtUserUsername() {
		super();
	}

	public SmtUserUsername(String value) {
		Validate.notNull(value, "The \"value\" parameter can not be null.");
		Validate.matchesPattern(value, VALUE_PATTERN, "The \"value\" parameter must match the \"%s\" pattern.", VALUE_PATTERN);
		Validate.inclusiveBetween(VALUE_MIN_LENGTH, VALUE_MAX_LENGTH, value.length(), "The \"value\" parameter must be between %d and %d characters in length.", VALUE_MIN_LENGTH, VALUE_MAX_LENGTH);
		this.value = value;
	}

	public static SmtUserUsername valueOf(String value) {
		return new SmtUserUsername(value);
	}

	public static boolean isValid(String value) {
		return ((value != null) && GenericValidator.matchRegexp(value, VALUE_PATTERN) && GenericValidator.isInRange(value.length(), VALUE_MIN_LENGTH, VALUE_MAX_LENGTH));
	}

	@JsonProperty(value = "value")
	public String getValue() {
		return value;
	}

	@Override
	public boolean sameValueAs(SmtUserUsername other) {
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
		final SmtUserUsername other = (SmtUserUsername) object;
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
		return value;
	}

	@Override
	public int compareTo(SmtUserUsername other) {
		Validate.notNull(other, "The \"other\" parameter can not be null.");
		return new CompareToBuilder()
		.append(value, other.value)
		.toComparison();
	}

}
