package com.intercom.web.smtcollector.domain.brandtype;

import com.intercom.web.smtcollector.domain.SmtFilter;

public class SmtBrandTypeFilter implements SmtFilter<SmtBrandType> {

	private SmtBrandTypeCode code = null;
	private String codeStartsWith = null;
	private String codeContains = null;
	private String nameStartsWith = null;
	private String nameContains = null;

	public SmtBrandTypeFilter() {
	}

	public SmtBrandTypeCode getCode() {
		return code;
	}

	public void setCode(SmtBrandTypeCode code) {
		this.code = code;
	}

	public String getCodeStartsWith() {
		return codeStartsWith;
	}

	public void setCodeStartsWith(String codeStartsWith) {
		this.codeStartsWith = codeStartsWith;
	}

	public String getCodeContains() {
		return codeContains;
	}

	public void setCodeContains(String codeContains) {
		this.codeContains = codeContains;
	}

	public String getNameStartsWith() {
		return nameStartsWith;
	}

	public void setNameStartsWith(String nameStartsWith) {
		this.nameStartsWith = nameStartsWith;
	}

	public String getNameContains() {
		return nameContains;
	}

	public void setNameContains(String nameContains) {
		this.nameContains = nameContains;
	}

}
