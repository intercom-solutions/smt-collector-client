package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupStandardisedBrand extends SmtVariantNameLookup<SmtVariantNameLookupStandardisedBrand> {

	public static final int TYPE = 33;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupStandardisedBrand() {
		super();
	}

	public SmtVariantNameLookupStandardisedBrand(String name, String value) {
		super(TYPE, name, value);
	}

}
