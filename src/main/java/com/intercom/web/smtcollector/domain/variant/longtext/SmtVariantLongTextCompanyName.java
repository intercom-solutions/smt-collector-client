package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextCompanyName extends SmtVariantLongText<SmtVariantLongTextCompanyName> {

	public static final int TYPE = 192;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantLongTextCompanyName() {
		super();
	}

	public SmtVariantLongTextCompanyName(String value) {
		super(TYPE, value);
	}

}
