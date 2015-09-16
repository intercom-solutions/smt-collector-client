package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupClpRegulation extends SmtVariantNameLookup<SmtVariantNameLookupClpRegulation> {

	public static final int TYPE = 200;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantNameLookupClpRegulation() {
		super();
	}

	public SmtVariantNameLookupClpRegulation(String name, String value) {
		super(TYPE, name, value);
	}

}
