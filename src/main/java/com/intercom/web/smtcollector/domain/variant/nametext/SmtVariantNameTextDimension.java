package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextDimension extends SmtVariantNameText<SmtVariantNameTextDimension> {

	public static final int TYPE = 16;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameTextDimension() {
		super();
	}

	public SmtVariantNameTextDimension(String name, String value) {
		super(TYPE, name, value);
	}

}
