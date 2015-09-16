package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoNappySizeOtherText extends SmtVariantMemo<SmtVariantMemoNappySizeOtherText> {

	public static final int TYPE = 166;

	protected SmtVariantMemoNappySizeOtherText() {
		super();
	}

	public SmtVariantMemoNappySizeOtherText(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
