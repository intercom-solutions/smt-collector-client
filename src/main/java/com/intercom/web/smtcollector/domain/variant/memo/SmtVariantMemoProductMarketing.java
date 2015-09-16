package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoProductMarketing extends SmtVariantMemo<SmtVariantMemoProductMarketing> {

	public static final int TYPE = 35;

	protected SmtVariantMemoProductMarketing() {
		super();
	}

	public SmtVariantMemoProductMarketing(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
