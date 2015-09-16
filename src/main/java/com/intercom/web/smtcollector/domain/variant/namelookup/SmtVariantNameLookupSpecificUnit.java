package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupSpecificUnit extends SmtVariantNameLookup<SmtVariantNameLookupSpecificUnit> {

	public static final int TYPE = 69;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupSpecificUnit() {
		super();
	}

	public SmtVariantNameLookupSpecificUnit(String name, String value) {
		super(TYPE, name, value);
	}

}
