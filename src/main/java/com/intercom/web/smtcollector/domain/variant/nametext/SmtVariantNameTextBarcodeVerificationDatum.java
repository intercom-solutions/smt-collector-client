package com.intercom.web.smtcollector.domain.variant.nametext;

public class SmtVariantNameTextBarcodeVerificationDatum extends SmtVariantNameText<SmtVariantNameTextBarcodeVerificationDatum> {

	public static final int TYPE = 87;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameTextBarcodeVerificationDatum() {
		super();
	}

	public SmtVariantNameTextBarcodeVerificationDatum(String name, String value) {
		super(TYPE, name, value);
	}

}
