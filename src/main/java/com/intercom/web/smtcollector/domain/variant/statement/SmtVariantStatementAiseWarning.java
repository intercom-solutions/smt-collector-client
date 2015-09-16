package com.intercom.web.smtcollector.domain.variant.statement;

public class SmtVariantStatementAiseWarning extends SmtVariantStatement<SmtVariantStatementAiseWarning> {

	public static final int TYPE = 201;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantStatementAiseWarning() {
		super();
	}

	public SmtVariantStatementAiseWarning(String value) {
		super(TYPE, value);
	}

}
