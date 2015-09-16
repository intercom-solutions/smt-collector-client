package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextFaxNumber extends SmtVariantLongText<SmtVariantLongTextFaxNumber> {

	public static final int TYPE = 202;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextFaxNumber() {
		super();
	}

	public SmtVariantLongTextFaxNumber(String value) {
		super(TYPE, value);
	}

}
