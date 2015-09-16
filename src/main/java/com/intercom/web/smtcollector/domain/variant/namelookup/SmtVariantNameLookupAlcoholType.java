package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupAlcoholType extends SmtVariantNameLookup<SmtVariantNameLookupAlcoholType> {

	public static final int TYPE = 73;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupAlcoholType() {
		super();
	}

	public SmtVariantNameLookupAlcoholType(String name, String value) {
		super(TYPE, name, value);
	}

}
