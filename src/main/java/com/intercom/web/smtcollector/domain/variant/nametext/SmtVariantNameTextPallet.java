package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextPallet extends SmtVariantNameText<SmtVariantNameTextPallet> {

	public static final int TYPE = 135;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameTextPallet() {
		super();
	}

	public SmtVariantNameTextPallet(String name, String value) {
		super(TYPE, name, value);
	}

}
