package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupRecommendedStorage extends SmtVariantNameLookup<SmtVariantNameLookupRecommendedStorage> {

	public static final int TYPE = 81;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupRecommendedStorage() {
		super();
	}

	public SmtVariantNameLookupRecommendedStorage(String name, String value) {
		super(TYPE, name, value);
	}

}
