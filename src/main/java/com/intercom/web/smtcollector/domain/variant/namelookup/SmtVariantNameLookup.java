package com.intercom.web.smtcollector.domain.variant.namelookup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.intercom.web.smtcollector.domain.SmtValueObject;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonPropertyOrder({
	"type",
	"name",
	"value"})
public class SmtVariantNameLookup<SmtVariantNameLookupT extends SmtVariantNameLookup> implements SmtValueObject<SmtVariantNameLookupT> {

	protected int type;
	protected String name;
	protected String value;
	public static final int NAME_MAX_LENGTH = 100;
	public static final int VALUE_MAX_LENGTH = 1000;

	protected SmtVariantNameLookup() {
		super();
	}

	protected SmtVariantNameLookup(int type, String name, String value) {
		Validate.notNull(name, "The \"name\" parameter can not be null");
		Validate.notNull(value, "The \"value\" parameter can not be null");
		this.type = type;
		this.name = name;
		this.value = value;
	}

	@JsonProperty(value = "type")
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@JsonProperty(value = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty(value = "value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean sameValueAs(SmtVariantNameLookupT other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(type, other.type)
		.append(name, other.name)
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
		final SmtVariantNameLookupT other = (SmtVariantNameLookupT) object;
		return sameValueAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(type)
		.append(name)
		.append(value)
		.toHashCode();
	}

}
