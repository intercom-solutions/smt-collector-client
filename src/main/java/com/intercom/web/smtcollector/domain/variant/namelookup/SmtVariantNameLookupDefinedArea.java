package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupDefinedArea extends SmtVariantNameLookup<SmtVariantNameLookupDefinedArea> {

	public static final int TYPE = 79;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupDefinedArea() {
		super();
	}

	public SmtVariantNameLookupDefinedArea(String name, String value) {
		super(TYPE, name, value);
	}

}
