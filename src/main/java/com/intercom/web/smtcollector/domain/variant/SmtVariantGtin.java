package com.intercom.web.smtcollector.domain.variant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtEntityIdentifier;
import java.util.Collection;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.validator.GenericValidator;

@JacksonXmlRootElement(localName = "gtin")
@JsonPropertyOrder({
	"value"})
public class SmtVariantGtin implements SmtEntityIdentifier<SmtVariantGtin>, Comparable<SmtVariantGtin> {

	private String value;
	public static final String VALUE_PATTERN = "^[0-9]+$";
	public static final int EAN8_VALUE_LENGTH = 8;
	public static final int EAN13_VALUE_LENGTH = 13;
	public static final boolean CASE_SENSITIVE = false;

	protected SmtVariantGtin() {
		super();
	}

	public SmtVariantGtin(String value) {
		Validate.notNull(value, "The \"value\" parameter can not be null.");
		Validate.matchesPattern(value, VALUE_PATTERN, "The \"value\" parameter must match the \"%s\" pattern.", VALUE_PATTERN);
		Validate.isTrue(((value.length() == EAN8_VALUE_LENGTH) || (value.length() == EAN13_VALUE_LENGTH)), "The \"value\" parameter must be %d or %d characters in length.", EAN8_VALUE_LENGTH, EAN13_VALUE_LENGTH);
		this.value = value;
	}

	public static SmtVariantGtin valueOf(String value) {
		return new SmtVariantGtin(value);
	}

	public static boolean isValid(String value) {
		return ((value != null) && GenericValidator.matchRegexp(value, VALUE_PATTERN) && ((value.length() == EAN8_VALUE_LENGTH) || (value.length() == EAN13_VALUE_LENGTH)));
	}

	@JsonProperty(value = "value")
	public String getValue() {
		return value;
	}

	@JsonIgnore
	public boolean isEan8() {
		return (value.length() == EAN8_VALUE_LENGTH);
	}

	@JsonIgnore
	public boolean isEan13() {
		return (value.length() == EAN13_VALUE_LENGTH);
	}

	public boolean startsWith(Collection<SmtVariantGtinPrefix> gtinPrefixes) {
		if(gtinPrefixes != null) {
			for(SmtVariantGtinPrefix gtinPrefix : gtinPrefixes) {
				if(gtinPrefix.isPrefixOf(this)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean sameValueAs(SmtVariantGtin other) {
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
		final SmtVariantGtin other = (SmtVariantGtin) object;
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
	public int compareTo(SmtVariantGtin other) {
		Validate.notNull(other, "The \"other\" parameter can not be null.");
		return new CompareToBuilder()
		.append(value, other.value)
		.toComparison();
	}

}
