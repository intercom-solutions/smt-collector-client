package com.intercom.web.smtcollector.domain.brandtype;

import com.intercom.web.smtcollector.domain.SmtFilter;

public class SmtBrandTypeFilter implements SmtFilter<SmtBrandType> {

	private SmtBrandTypeCode code = null;
	private String codeStartsWith = null;
	private String codeLike = null;
	private String nameStartsWith = null;
	private String nameLike = null;

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

	public String getCodeLike() {
		return codeLike;
	}

	public void setCodeLike(String codeLike) {
		this.codeLike = codeLike;
	}

	public String getNameStartsWith() {
		return nameStartsWith;
	}

	public void setNameStartsWith(String nameStartsWith) {
		this.nameStartsWith = nameStartsWith;
	}

	public String getNameLike() {
		return nameLike;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

}
