package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoCompanyAddress extends SmtVariantMemo<SmtVariantMemoCompanyAddress> {

	public static final int TYPE = 193;

	protected SmtVariantMemoCompanyAddress() {
		super();
	}

	public SmtVariantMemoCompanyAddress(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
