package com.intercom.web.smtcollector.domain.variant.memo;

public class SmtVariantMemoRecipes extends SmtVariantMemo<SmtVariantMemoRecipes> {

	public static final int TYPE = 142;

	protected SmtVariantMemoRecipes() {
		super();
	}

	public SmtVariantMemoRecipes(String value) {
		super(value);
	}

	@Override

	public String getValue() {
		return value;
	}

}
