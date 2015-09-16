package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupRecyclingInfo extends SmtVariantNameLookup<SmtVariantNameLookupRecyclingInfo> {

	public static final int TYPE = 11;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameLookupRecyclingInfo() {
		super();
	}

	public SmtVariantNameLookupRecyclingInfo(String name, String value) {
		super(TYPE, name, value);
	}

}
