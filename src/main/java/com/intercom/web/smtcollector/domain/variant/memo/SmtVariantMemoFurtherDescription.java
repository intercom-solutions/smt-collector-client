package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoFurtherDescription extends SmtVariantMemo<SmtVariantMemoFurtherDescription> {

	public static final int TYPE = 21;

	protected SmtVariantMemoFurtherDescription() {
		super();
	}

	public SmtVariantMemoFurtherDescription(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
