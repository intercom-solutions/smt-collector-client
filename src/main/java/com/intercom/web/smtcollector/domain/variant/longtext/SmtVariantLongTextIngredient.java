package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextIngredient extends SmtVariantLongText<SmtVariantLongTextIngredient> {

	public static final int TYPE = 84;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextIngredient() {
		super();
	}

	public SmtVariantLongTextIngredient(String value) {
		super(TYPE, value);
	}

}
