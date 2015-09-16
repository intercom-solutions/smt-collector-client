package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextHealthClaim extends SmtVariantLongText<SmtVariantLongTextHealthClaim> {

	public static final int TYPE = 157;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextHealthClaim() {
		super();
	}

	public SmtVariantLongTextHealthClaim(String value) {
		super(TYPE, value);
	}

}
