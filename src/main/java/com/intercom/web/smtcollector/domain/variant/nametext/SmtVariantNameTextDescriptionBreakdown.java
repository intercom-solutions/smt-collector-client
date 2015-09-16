package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextDescriptionBreakdown extends SmtVariantNameText<SmtVariantNameTextDescriptionBreakdown> {

	public static final int TYPE = 184;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 2;

	protected SmtVariantNameTextDescriptionBreakdown() {
		super();
	}

	public SmtVariantNameTextDescriptionBreakdown(String name, String value) {
		super(TYPE, name, value);
	}

}
