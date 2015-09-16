package com.intercom.web.smtcollector.domain.variant.nametextlookup;

public class SmtVariantNameTextLookupLowerAgeLimit extends SmtVariantNameTextLookup<SmtVariantNameTextLookupLowerAgeLimit> {

	public static final int TYPE = 24;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameTextLookupLowerAgeLimit() {
		super();
	}

	public SmtVariantNameTextLookupLowerAgeLimit(String name, String value, String text) {
		super(TYPE, name, value, text);
	}

}
