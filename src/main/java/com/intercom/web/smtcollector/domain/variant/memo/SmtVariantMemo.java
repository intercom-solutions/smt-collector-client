package com.intercom.web.smtcollector.domain.variant.memo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.intercom.web.smtcollector.domain.SmtValueObject;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonPropertyOrder({
	"value"})
public abstract class SmtVariantMemo<SmtVariantStatementT extends SmtVariantMemo> implements SmtValueObject<SmtVariantStatementT> {

	protected String value;

	protected SmtVariantMemo() {
		super();
	}

	protected SmtVariantMemo(String value) {
		this.value = value;
	}

	@JsonProperty(value = "value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean sameValueAs(SmtVariantStatementT other) {
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
		final SmtVariantStatementT other = (SmtVariantStatementT) object;
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

}
