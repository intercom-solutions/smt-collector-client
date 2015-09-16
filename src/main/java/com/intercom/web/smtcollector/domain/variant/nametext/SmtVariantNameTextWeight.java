package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextWeight extends SmtVariantNameText<SmtVariantNameTextWeight> {

	public static final int TYPE = 34;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameTextWeight() {
		super();
	}

	public SmtVariantNameTextWeight(String name, String value) {
		super(TYPE, name, value);
	}

}
