package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextCase extends SmtVariantNameText<SmtVariantNameTextCase> {

	public static final int TYPE = 121;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameTextCase() {
		super();
	}

	public SmtVariantNameTextCase(String name, String value) {
		super(TYPE, name, value);
	}

}
