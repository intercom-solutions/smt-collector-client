package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextPackSize extends SmtVariantLongText<SmtVariantLongTextPackSize> {

	public static final int TYPE = 70;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantLongTextPackSize() {
		super();
	}

	public SmtVariantLongTextPackSize(String value) {
		super(TYPE, value);
	}

}
