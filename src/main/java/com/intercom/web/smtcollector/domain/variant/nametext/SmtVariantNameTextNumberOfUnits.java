package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextNumberOfUnits extends SmtVariantNameText<SmtVariantNameTextNumberOfUnits> {

	public static final int TYPE = 66;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameTextNumberOfUnits() {
		super();
	}

	public SmtVariantNameTextNumberOfUnits(String name, String value) {
		super(TYPE, name, value);
	}

}
