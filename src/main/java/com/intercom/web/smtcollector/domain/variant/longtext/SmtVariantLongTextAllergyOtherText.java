package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextAllergyOtherText extends SmtVariantLongText<SmtVariantLongTextAllergyOtherText> {

	public static final int TYPE = 12;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextAllergyOtherText() {
		super();
	}

	public SmtVariantLongTextAllergyOtherText(String value) {
		super(TYPE, value);
	}

}
