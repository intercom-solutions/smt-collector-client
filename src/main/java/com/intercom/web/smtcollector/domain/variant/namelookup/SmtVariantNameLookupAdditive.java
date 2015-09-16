package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupAdditive extends SmtVariantNameLookup<SmtVariantNameLookupAdditive> {

	public static final int TYPE = 5;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameLookupAdditive() {
		super();
	}

	public SmtVariantNameLookupAdditive(String name, String value) {
		super(TYPE, name, value);
	}

}
