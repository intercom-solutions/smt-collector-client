package com.intercom.web.smtcollector.domain.variant.statement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.intercom.web.smtcollector.domain.SmtValueObject;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonPropertyOrder({
	"type",
	"value"})
public class SmtVariantStatement<SmtVariantStatementT extends SmtVariantStatement> implements SmtValueObject<SmtVariantStatementT> {

	protected int type;
	protected String value;
	public static final int VALUE_MAX_LENGTH = 100;

	protected SmtVariantStatement() {
		super();
	}

	protected SmtVariantStatement(int type, String value) {
		Validate.notNull(value, "The \"value\" parameter can not be null");
		this.type = type;
		this.value = value;
	}

	@JsonProperty(value = "type")
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
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
		.append(type, other.type)
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
		.append(type)
		.append(value)
		.toHashCode();
	}

}
