package com.intercom.web.smtcollector.domain.variant.nutrition;

import java.util.List;

public class SmtVariantTextualNutrition extends SmtVariantNutrition<SmtVariantTextualNutrition, String> {

	public static final int HEADING_MAX_LENGTH = 200;
	public static final int NUTRIENT_MAX_LENGTH = 200;
	public static final int AMOUNT_MAX_LENGTH = 50;

	public SmtVariantTextualNutrition() {
		super();
	}

	public SmtVariantTextualNutrition(List<String> headings, List<String> nutrients, List<String> amounts) {
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
	public List<String> getAmounts() {
		return super.getAmounts();
	}

}
