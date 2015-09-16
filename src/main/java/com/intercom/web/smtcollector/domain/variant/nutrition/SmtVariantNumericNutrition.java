package com.intercom.web.smtcollector.domain.variant.nutrition;

import java.math.BigDecimal;
import java.util.List;

public class SmtVariantNumericNutrition extends SmtVariantNutrition<SmtVariantNumericNutrition, BigDecimal> {

	public static final int HEADING_MAX_LENGTH = 200;
	public static final int NUTRIENT_MAX_LENGTH = 200;

	public SmtVariantNumericNutrition() {
		super();
	}

	public SmtVariantNumericNutrition(List<String> headings, List<String> nutrients, List<BigDecimal> amounts) {
		super(headings, nutrients, amounts);
	}

	@Override
	public List<String> getHeadings() {
		return super.getHeadings();
	}

	@Override
	public List<String> getNutrients() {
		return super.getNutrients();
	}

	@Override
	public List<BigDecimal> getAmounts() {
		return super.getAmounts();
	}

}
