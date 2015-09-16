package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupTypeOfClosure extends SmtVariantNameLookup<SmtVariantNameLookupTypeOfClosure> {

	public static final int TYPE = 80;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupTypeOfClosure() {
		super();
	}

	public SmtVariantNameLookupTypeOfClosure(String name, String value) {
		super(TYPE, name, value);
	}

}
