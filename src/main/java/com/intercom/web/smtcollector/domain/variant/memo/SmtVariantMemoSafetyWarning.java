package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoSafetyWarning extends SmtVariantMemo<SmtVariantMemoSafetyWarning> {

	public static final int TYPE = 52;

	protected SmtVariantMemoSafetyWarning() {
		super();
	}

	public SmtVariantMemoSafetyWarning(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
