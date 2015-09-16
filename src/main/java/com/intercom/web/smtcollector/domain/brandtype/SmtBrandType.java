package com.intercom.web.smtcollector.domain.brandtype;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtAuditableEntity;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "brandType")
@JsonPropertyOrder({
	"code",
	"name",
	"brandsCount",
	"creationDate",
	"creationUser",
	"lastModifiedDate",
	"lastModifiedUser",})
public class SmtBrandType extends SmtAuditableEntity<SmtBrandType> implements Comparable<SmtBrandType> {

	private SmtBrandTypeCode code;
	private String name;
	private int brandsCount;

	protected SmtBrandType() {
		super();
	}

	public SmtBrandType(SmtBrandTypeCode code, String name, String creationUser) {
		super(creationUser);
		Validate.notNull(code, "The \"code\" parameter can not be null");
		Validate.notNull(name, "The \"name\" parameter can not be null");
		this.code = code;
		this.name = name;
	}

	@JsonProperty(value = "code")
	public SmtBrandTypeCode getCode() {
		return code;
	}

	@JsonProperty(value = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty(value = "brandsCount")
	public int getBrandsCount() {
		return brandsCount;
	}

	public void setBrandsCount(int brandsCount) {
		this.brandsCount = brandsCount;
	}

	@Override
	public boolean sameIdentityAs(SmtBrandType other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(code, other.code)
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
		final SmtBrandType other = (SmtBrandType) object;
		return sameIdentityAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(code)
		.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
		.append("code", code)
		.toString();
	}

	@Override
	public int compareTo(SmtBrandType other) {
		Validate.notNull(other, "The \"other\" parameter can not be null.");
		return new CompareToBuilder()
		.append(name, other.name)
		.toComparison();
	}

}
