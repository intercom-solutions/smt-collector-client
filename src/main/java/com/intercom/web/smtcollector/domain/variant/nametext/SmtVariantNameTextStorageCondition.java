package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextStorageCondition extends SmtVariantNameText<SmtVariantNameTextStorageCondition> {

	public static final int TYPE = 28;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 4;

	protected SmtVariantNameTextStorageCondition() {
		super();
	}

	public SmtVariantNameTextStorageCondition(String name, String value) {
		super(TYPE, name, value);
	}

}
