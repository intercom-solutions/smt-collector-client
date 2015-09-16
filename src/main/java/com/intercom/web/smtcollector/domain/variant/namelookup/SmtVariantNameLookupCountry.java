package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupCountry extends SmtVariantNameLookup<SmtVariantNameLookupCountry> {

	public static final int TYPE = 23;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 2;

	protected SmtVariantNameLookupCountry() {
		super();
	}

	public SmtVariantNameLookupCountry(String name, String value) {
		super(TYPE, name, value);
	}

}
