package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextUsageOtherText extends SmtVariantLongText<SmtVariantLongTextUsageOtherText> {

	public static final int TYPE = 194;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantLongTextUsageOtherText() {
		super();
	}

	public SmtVariantLongTextUsageOtherText(String value) {
		super(TYPE, value);
	}

}
