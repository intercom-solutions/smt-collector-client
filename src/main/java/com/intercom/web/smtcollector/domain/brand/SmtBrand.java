package com.intercom.web.smtcollector.domain.brand;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtAuditableEntity;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandType;
import com.intercom.web.smtcollector.domain.product.SmtProduct;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "brand")
@JsonPropertyOrder({
	"code",
	"brandType",
	"name",
	"creationDate",
	"creationUser",
	"lastModifiedDate",
	"lastModifiedUser",})
public class SmtBrand extends SmtAuditableEntity<SmtBrand> implements Comparable<SmtBrand> {

	private SmtBrandCode code;
	private SmtBrandType brandType;
	private String name;
	private Set<SmtProduct> products;

	protected SmtBrand() {
		super();
	}

	public SmtBrand(SmtBrandCode code, SmtBrandType brandType, String name, String creationUser) {
		super(creationUser);
		Validate.notNull(code, "The \"code\" parameter can not be null");
		Validate.notNull(brandType, "The \"brandType\" parameter can not be null");
		Validate.notNull(name, "The \"name\" parameter can not be null");
		this.code = code;
		this.brandType = brandType;
		this.name = name;
	}

	@JsonProperty(value = "code")
	public SmtBrandCode getCode() {
		return code;
	}

	@JsonProperty(value = "brandType")
	public SmtBrandType getBrandType() {
		return brandType;
	}

	public void setBrandType(SmtBrandType brandType) {
		this.brandType = brandType;
	}

	@JsonProperty(value = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public Set<SmtProduct> getProducts() {
		return products;
	}

	public void setProducts(Set<SmtProduct> products) {
		this.products = products;
	}

	@Override
	public boolean sameIdentityAs(SmtBrand other) {
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
		final SmtBrand other = (SmtBrand) object;
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
	public int compareTo(SmtBrand other) {
		Validate.notNull(other, "The \"other\" parameter can not be null.");
		return new CompareToBuilder()
		.append(brandType, other.brandType)
		.append(name, other.name)
		.toComparison();
	}

}
