package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoPreparationAndUsage extends SmtVariantMemo<SmtVariantMemoPreparationAndUsage> {

	public static final int TYPE = 19;

	protected SmtVariantMemoPreparationAndUsage() {
		super();
	}

	public SmtVariantMemoPreparationAndUsage(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
