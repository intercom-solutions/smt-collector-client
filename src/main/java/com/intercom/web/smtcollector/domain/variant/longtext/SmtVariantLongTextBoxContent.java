package com.intercom.web.smtcollector.domain.variant.longtext;

public class SmtVariantLongTextBoxContent extends SmtVariantLongText<SmtVariantLongTextBoxContent> {

	public static final int TYPE = 40;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantLongTextBoxContent() {
		super();
	}

	public SmtVariantLongTextBoxContent(String value) {
		super(TYPE, value);
	}

}
