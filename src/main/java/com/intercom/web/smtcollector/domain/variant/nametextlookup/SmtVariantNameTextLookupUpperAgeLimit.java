package com.intercom.web.smtcollector.domain.variant.nametextlookup;

public class SmtVariantNameTextLookupUpperAgeLimit extends SmtVariantNameTextLookup<SmtVariantNameTextLookupUpperAgeLimit> {

	public static final int TYPE = 131;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameTextLookupUpperAgeLimit() {
		super();
	}

	public SmtVariantNameTextLookupUpperAgeLimit(String name, String value, String text) {
		super(TYPE, name, value, text);
	}

}
