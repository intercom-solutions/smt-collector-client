package com.intercom.web.smtcollector.domain.variant.statement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "lifestyle")
public class SmtVariantStatementLifestyle extends SmtVariantStatement<SmtVariantStatementLifestyle> {

	public static final int TYPE = 2;
	public static final Integer MIN_OCCURRENCE = null;
	public static final Integer MAX_OCCURRENCE = null;

	protected SmtVariantStatementLifestyle() {
		super();
	}

	public SmtVariantStatementLifestyle(String value) {
		super(TYPE, value);
	}

}
