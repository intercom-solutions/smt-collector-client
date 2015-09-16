package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextNumericSize extends SmtVariantNameText<SmtVariantNameTextNumericSize> {

	public static final int TYPE = 68;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameTextNumericSize() {
		super();
	}

	public SmtVariantNameTextNumericSize(String name, String value) {
		super(TYPE, name, value);
	}

}
