package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoReturnTo extends SmtVariantMemo<SmtVariantMemoReturnTo> {

	public static final int TYPE = 26;

	protected SmtVariantMemoReturnTo() {
		super();
	}

	public SmtVariantMemoReturnTo(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
