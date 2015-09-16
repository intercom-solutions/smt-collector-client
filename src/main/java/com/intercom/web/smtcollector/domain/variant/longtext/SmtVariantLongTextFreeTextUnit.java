package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextFreeTextUnit extends SmtVariantLongText<SmtVariantLongTextFreeTextUnit> {

	public static final int TYPE = 71;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantLongTextFreeTextUnit() {
		super();
	}

	public SmtVariantLongTextFreeTextUnit(String value) {
		super(TYPE, value);
	}

}
