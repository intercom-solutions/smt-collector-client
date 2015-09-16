package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextPlaceOfBirth extends SmtVariantLongText<SmtVariantLongTextPlaceOfBirth> {

	public static final int TYPE = 144;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextPlaceOfBirth() {
		super();
	}

	public SmtVariantLongTextPlaceOfBirth(String value) {
		super(TYPE, value);
	}

}
