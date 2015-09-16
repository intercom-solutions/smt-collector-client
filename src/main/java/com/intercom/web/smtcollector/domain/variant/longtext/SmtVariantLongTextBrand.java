package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextBrand extends SmtVariantLongText<SmtVariantLongTextBrand> {

	public static final int TYPE = 25;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantLongTextBrand() {
		super();
	}

	public SmtVariantLongTextBrand(String value) {
		super(TYPE, value);
	}

}
