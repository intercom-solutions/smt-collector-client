package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupProductLanguage extends SmtVariantNameLookup<SmtVariantNameLookupProductLanguage> {

	public static final int TYPE = 65;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameLookupProductLanguage() {
		super();
	}

	public SmtVariantNameLookupProductLanguage(String name, String value) {
		super(TYPE, name, value);
	}

}
