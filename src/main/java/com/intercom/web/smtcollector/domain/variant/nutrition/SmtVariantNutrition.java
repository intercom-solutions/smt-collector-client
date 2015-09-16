package com.intercom.web.smtcollector.domain.variant.nutrition;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.intercom.web.smtcollector.domain.SmtValueObject;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonPropertyOrder({
	"headings",
	"nutrients",
	"amounts"})
public abstract class SmtVariantNutrition<SmtVariantNutritionT extends SmtVariantNutrition, AmountT> implements SmtValueObject<SmtVariantNutritionT> {

	List<String> headings = new ArrayList<String>();
	List<String> nutrients = new ArrayList<String>();
	List<AmountT> amounts = new ArrayList<AmountT>();

	protected SmtVariantNutrition() {
		super();
	}

	public SmtVariantNutrition(List<String> headings, List<String> nutrients, List<AmountT> amounts) {
		this.headings = headings;
		this.nutrients = nutrients;
		this.amounts = amounts;
	}

	@JacksonXmlElementWrapper(localName = "headings")
	@JacksonXmlProperty(localName = "heading")
	public List<String> getHeadings() {
		return headings;
	}

	public void setHeadings(List<String> headings) {
		this.headings = headings;
	}

	@JacksonXmlElementWrapper(localName = "nutrients")
	@JacksonXmlProperty(localName = "nutrient")
	public List<String> getNutrients() {
		return nutrients;
	}

	public void setNutrients(List<String> nutrients) {
		this.nutrients = nutrients;
	}

	@JacksonXmlElementWrapper(localName = "amounts")
	@JacksonXmlProperty(localName = "amount")
	public List<AmountT> getAmounts() {
		return amounts;
	}

	public void setAmounts(List<AmountT> amounts) {
		this.amounts = amounts;
	}

	@Override
	public boolean sameValueAs(SmtVariantNutritionT other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(headings, other.headings)
		.append(nutrients, other.nutrients)
		.append(amounts, other.amounts)
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
		final SmtVariantNutritionT other = (SmtVariantNutritionT) object;
		return sameValueAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(headings)
		.append(nutrients)
		.append(amounts)
		.toHashCode();
	}

}
