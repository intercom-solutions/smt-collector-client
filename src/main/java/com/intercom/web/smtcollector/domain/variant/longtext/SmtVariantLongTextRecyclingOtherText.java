package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextRecyclingOtherText extends SmtVariantLongText<SmtVariantLongTextRecyclingOtherText> {

	public static final int TYPE = 150;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextRecyclingOtherText() {
		super();
	}

	public SmtVariantLongTextRecyclingOtherText(String value) {
		super(TYPE, value);
	}

}
