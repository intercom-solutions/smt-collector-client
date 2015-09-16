package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupPackType extends SmtVariantNameLookup<SmtVariantNameLookupPackType> {

	public static final int TYPE = 29;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupPackType() {
		super();
	}

	public SmtVariantNameLookupPackType(String name, String value) {
		super(TYPE, name, value);
	}

}
