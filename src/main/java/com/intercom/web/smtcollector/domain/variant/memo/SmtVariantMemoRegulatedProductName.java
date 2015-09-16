package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoRegulatedProductName extends SmtVariantMemo<SmtVariantMemoRegulatedProductName> {

	public static final int TYPE = 159;

	protected SmtVariantMemoRegulatedProductName() {
		super();
	}

	public SmtVariantMemoRegulatedProductName(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
