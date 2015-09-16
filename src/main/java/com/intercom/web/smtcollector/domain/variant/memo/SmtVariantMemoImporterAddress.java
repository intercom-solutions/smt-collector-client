package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoImporterAddress extends SmtVariantMemo<SmtVariantMemoImporterAddress> {

	public static final int TYPE = 151;

	protected SmtVariantMemoImporterAddress() {
		super();
	}

	public SmtVariantMemoImporterAddress(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
