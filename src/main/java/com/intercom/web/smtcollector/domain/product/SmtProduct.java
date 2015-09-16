package com.intercom.web.smtcollector.domain.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtAuditableEntity;
import com.intercom.web.smtcollector.domain.brand.SmtBrand;
import com.intercom.web.smtcollector.domain.group.SmtGroup;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "product")
@JsonPropertyOrder({
	"code",
	"group",
	"brand",
	"technicalDescription",
	"compactDescription",
	"clickAndCollect",
	"creationDate",
	"creationUser",
	"lastModifiedDate",
	"lastModifiedUser",})
public class SmtProduct extends SmtAuditableEntity<SmtProduct> {

	private SmtProductCode code;
	private SmtGroup group;
	private SmtBrand brand;
	private String technicalDescription;
	private String compactDescription;
	private boolean clickAndCollect;

	protected SmtProduct() {
		super();
	}

	public SmtProduct(SmtProductCode code, SmtGroup group, SmtBrand brand, String technicalDescription, String compactDescription, boolean clickAndCollect, String creationUser) {
		super(creationUser);
		Validate.notNull(code, "The \"code\" parameter can not be null");
		Validate.notNull(group, "The \"group\" parameter can not be null");
		Validate.notNull(technicalDescription, "The \"technicalDescription\" parameter can not be null");
		Validate.notNull(compactDescription, "The \"compactDescription\" parameter can not be null");
		this.code = code;
		this.group = group;
		this.brand = brand;
		this.technicalDescription = technicalDescription;
		this.compactDescription = compactDescription;
		this.clickAndCollect = clickAndCollect;
	}

	@JsonProperty(value = "code")
	public SmtProductCode getCode() {
		return code;
	}

	@JsonProperty(value = "group")
	public SmtGroup getGroup() {
		return group;
	}

	public void setGroup(SmtGroup group) {
		this.group = group;
	}

	@JsonProperty(value = "brand")
	public SmtBrand getBrand() {
		return brand;
	}

	public void setBrand(SmtBrand brand) {
		this.brand = brand;
	}

	@JsonProperty(value = "technicalDescription")
	public String getTechnicalDescription() {
		return technicalDescription;
	}

	public void setTechnicalDescription(String technicalDescription) {
		this.technicalDescription = technicalDescription;
	}

	@JsonProperty(value = "compactDescription")
	public String getCompactDescription() {
		return compactDescription;
	}

	public void setCompactDescription(String compactDescription) {
		this.compactDescription = compactDescription;
	}

	@JsonProperty(value = "clickAndCollect")
	public boolean isClickAndCollect() {
		return clickAndCollect;
	}

	public void setClickAndCollect(boolean clickAndCollect) {
		this.clickAndCollect = clickAndCollect;
	}

	@Override
	public boolean sameIdentityAs(SmtProduct other) {
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
		final SmtProduct other = (SmtProduct) object;
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

}
