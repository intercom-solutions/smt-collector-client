package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoBrandMarketing extends SmtVariantMemo<SmtVariantMemoBrandMarketing> {

	public static final int TYPE = 36;

	protected SmtVariantMemoBrandMarketing() {
		super();
	}

	public SmtVariantMemoBrandMarketing(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
