package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextMultilingualDescription extends SmtVariantNameText<SmtVariantNameTextMultilingualDescription> {

	public static final int TYPE = 64;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameTextMultilingualDescription() {
		super();
	}

	public SmtVariantNameTextMultilingualDescription(String name, String value) {
		super(TYPE, name, value);
	}

}
