package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoDistributorAddress extends SmtVariantMemo<SmtVariantMemoDistributorAddress> {

	public static final int TYPE = 152;

	protected SmtVariantMemoDistributorAddress() {
		super();
	}

	public SmtVariantMemoDistributorAddress(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
