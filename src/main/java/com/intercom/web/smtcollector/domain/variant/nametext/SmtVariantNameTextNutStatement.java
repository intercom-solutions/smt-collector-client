package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextNutStatement extends SmtVariantNameText<SmtVariantNameTextNutStatement> {

	public static final int TYPE = 8;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 3;

	protected SmtVariantNameTextNutStatement() {
		super();
	}

	public SmtVariantNameTextNutStatement(String name, String value) {
		super(TYPE, name, value);
	}

}
