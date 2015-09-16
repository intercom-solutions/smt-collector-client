package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupManufacturerBrand extends SmtVariantNameLookup<SmtVariantNameLookupManufacturerBrand> {

	public static final int TYPE = 97;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupManufacturerBrand() {
		super();
	}

	public SmtVariantNameLookupManufacturerBrand(String name, String value) {
		super(TYPE, name, value);
	}

}
