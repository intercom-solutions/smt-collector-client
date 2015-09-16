package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoManufacturerMarketing extends SmtVariantMemo<SmtVariantMemoManufacturerMarketing> {

	public static final int TYPE = 37;

	protected SmtVariantMemoManufacturerMarketing() {
		super();
	}

	public SmtVariantMemoManufacturerMarketing(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
