package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextBreakPack extends SmtVariantNameText<SmtVariantNameTextBreakPack> {

	public static final int TYPE = 120;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameTextBreakPack() {
		super();
	}

	public SmtVariantNameTextBreakPack(String name, String value) {
		super(TYPE, name, value);
	}

}
