package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoOtherInformation extends SmtVariantMemo<SmtVariantMemoOtherInformation> {

	public static final int TYPE = 3;

	protected SmtVariantMemoOtherInformation() {
		super();
	}

	public SmtVariantMemoOtherInformation(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
