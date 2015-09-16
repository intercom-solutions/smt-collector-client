package com.intercom.web.smtcollector.domain.variant.namelookup;

public class SmtVariantNameLookupWineColour extends SmtVariantNameLookup<SmtVariantNameLookupWineColour> {

	public static final int TYPE = 77;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantNameLookupWineColour() {
		super();
	}

	public SmtVariantNameLookupWineColour(String name, String value) {
		super(TYPE, name, value);
	}

}
