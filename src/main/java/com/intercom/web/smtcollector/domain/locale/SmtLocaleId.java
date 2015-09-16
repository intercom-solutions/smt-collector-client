package com.intercom.web.smtcollector.domain.locale;

import com.intercom.web.smtcollector.domain.SmtEntityIdentifier;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class SmtLocaleId implements SmtEntityIdentifier<SmtLocaleId>, Comparable<SmtLocaleId> {

	private String value;

	protected SmtLocaleId() {
		super();
	}

	public SmtLocaleId(String value) {
		Validate.notNull(value, "The \"value\" parameter can not be null.");
		Validate.isTrue(isValid(value), "The \"%s\" value is not a valid locale id.", value);
		this.value = value;
	}

	public static SmtLocaleId valueOf(String value) {
		return new SmtLocaleId(value);
	}

	public static boolean isValid(String value) {
		try {
			LocaleUtils.toLocale(value);
			return true;
		} catch(IllegalArgumentException e) {
			return false;
		}
	}

	public String getValue() {
		return value;
	}

	@Override
	public boolean sameValueAs(SmtLocaleId other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(value, other.value)
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
		final SmtLocaleId other = (SmtLocaleId) object;
		return sameValueAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(value)
		.toHashCode();
	}

	@Override
	public String toString() {
		return getValue();
	}

	@Override
	public int compareTo(SmtLocaleId other) {
		Validate.notNull(other, "The \"other\" parameter can not be null.");
		return new CompareToBuilder()
		.append(value, other.value)
		.toComparison();
	}

}
