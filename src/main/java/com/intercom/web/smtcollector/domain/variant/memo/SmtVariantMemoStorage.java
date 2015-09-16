package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoStorage extends SmtVariantMemo<SmtVariantMemoStorage> {

	public static final int TYPE = 20;

	protected SmtVariantMemoStorage() {
		super();
	}

	public SmtVariantMemoStorage(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
