package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextPharmacy extends SmtVariantNameText<SmtVariantNameTextPharmacy> {

	public static final int TYPE = 31;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 5;

	protected SmtVariantNameTextPharmacy() {
		super();
	}

	public SmtVariantNameTextPharmacy(String name, String value) {
		super(TYPE, name, value);
	}

}
