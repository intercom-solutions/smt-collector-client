package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextUnitType extends SmtVariantLongText<SmtVariantLongTextUnitType> {

	public static final int TYPE = 67;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantLongTextUnitType() {
		super();
	}

	public SmtVariantLongTextUnitType(String value) {
		super(TYPE, value);
	}

}
