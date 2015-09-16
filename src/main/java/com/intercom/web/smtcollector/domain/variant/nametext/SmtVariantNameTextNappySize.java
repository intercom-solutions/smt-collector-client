package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextNappySize extends SmtVariantNameText<SmtVariantNameTextNappySize> {

	public static final int TYPE = 6;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 2;

	protected SmtVariantNameTextNappySize() {
		super();
	}

	public SmtVariantNameTextNappySize(String name, String value) {
		super(TYPE, name, value);
	}

}
