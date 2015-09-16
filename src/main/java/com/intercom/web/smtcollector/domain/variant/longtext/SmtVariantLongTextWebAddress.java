package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextWebAddress extends SmtVariantLongText<SmtVariantLongTextWebAddress> {

	public static final int TYPE = 155;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextWebAddress() {
		super();
	}

	public SmtVariantLongTextWebAddress(String value) {
		super(TYPE, value);
	}

}
