package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupProductComposition extends SmtVariantNameLookup<SmtVariantNameLookupProductComposition> {

	public static final int TYPE = 180;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameLookupProductComposition() {
		super();
	}

	public SmtVariantNameLookupProductComposition(String name, String value) {
		super(TYPE, name, value);
	}

}
