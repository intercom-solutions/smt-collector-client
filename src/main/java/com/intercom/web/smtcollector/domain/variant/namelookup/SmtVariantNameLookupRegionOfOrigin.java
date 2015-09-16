package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupRegionOfOrigin extends SmtVariantNameLookup<SmtVariantNameLookupRegionOfOrigin> {

	public static final int TYPE = 75;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupRegionOfOrigin() {
		super();
	}

	public SmtVariantNameLookupRegionOfOrigin(String name, String value) {
		super(TYPE, name, value);
	}

}
