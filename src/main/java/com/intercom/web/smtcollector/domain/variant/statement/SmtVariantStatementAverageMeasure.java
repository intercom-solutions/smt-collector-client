package com.intercom.web.smtcollector.domain.variant.statement;

public class SmtVariantStatementAverageMeasure extends SmtVariantStatement<SmtVariantStatementAverageMeasure> {

	public static final int TYPE = 72;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = 1;

	protected SmtVariantStatementAverageMeasure() {
		super();
	}

	public SmtVariantStatementAverageMeasure(String value) {
		super(TYPE, value);
	}

}
