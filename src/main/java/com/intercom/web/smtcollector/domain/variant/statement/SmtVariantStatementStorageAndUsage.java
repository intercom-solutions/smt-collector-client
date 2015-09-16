package com.intercom.web.smtcollector.domain.variant.statement;

public class SmtVariantStatementStorageAndUsage extends SmtVariantStatement<SmtVariantStatementStorageAndUsage> {

	public static final int TYPE = 10;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantStatementStorageAndUsage() {
		super();
	}

	public SmtVariantStatementStorageAndUsage(String value) {
		super(TYPE, value);
	}

}
