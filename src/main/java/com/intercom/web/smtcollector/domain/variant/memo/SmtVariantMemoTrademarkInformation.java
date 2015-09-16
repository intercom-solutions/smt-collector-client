package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoTrademarkInformation extends SmtVariantMemo<SmtVariantMemoTrademarkInformation> {

	public static final int TYPE = 196;

	protected SmtVariantMemoTrademarkInformation() {
		super();
	}

	public SmtVariantMemoTrademarkInformation(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
