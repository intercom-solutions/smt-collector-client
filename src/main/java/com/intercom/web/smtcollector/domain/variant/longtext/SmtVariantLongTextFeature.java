package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextFeature extends SmtVariantLongText<SmtVariantLongTextFeature> {

	public static final int TYPE = 32;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextFeature() {
		super();
	}

	public SmtVariantLongTextFeature(String value) {
		super(TYPE, value);
	}

}
