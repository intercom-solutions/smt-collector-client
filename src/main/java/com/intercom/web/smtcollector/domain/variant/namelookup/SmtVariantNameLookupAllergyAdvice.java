package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupAllergyAdvice extends SmtVariantNameLookup<SmtVariantNameLookupAllergyAdvice> {

	public static final int TYPE = 4;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameLookupAllergyAdvice() {
		super();
	}

	public SmtVariantNameLookupAllergyAdvice(String name, String value) {
		super(TYPE, name, value);
	}

}
