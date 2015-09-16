package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupStorageType extends SmtVariantNameLookup<SmtVariantNameLookupStorageType> {

	public static final int TYPE = 27;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupStorageType() {
		super();
	}

	public SmtVariantNameLookupStorageType(String name, String value) {
		super(TYPE, name, value);
	}

}
