package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoManufacturersAddress extends SmtVariantMemo<SmtVariantMemoManufacturersAddress> {

	public static final int TYPE = 15;

	protected SmtVariantMemoManufacturersAddress() {
		super();
	}

	public SmtVariantMemoManufacturersAddress(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
