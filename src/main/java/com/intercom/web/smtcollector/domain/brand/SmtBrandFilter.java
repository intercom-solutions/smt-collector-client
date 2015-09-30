package com.intercom.web.smtcollector.domain.brand;

import com.intercom.web.smtcollector.domain.SmtFilter;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandTypeCode;

public class SmtBrandFilter implements SmtFilter<SmtBrand> {

	private SmtBrandCode code = null;
	private SmtBrandTypeCode brandTypeCode = null;
	private String codeStartsWith = null;
	private String codeContains = null;
	private String nameStartsWith = null;
	private String nameContains = null;

	public SmtBrandFilter() {
	}

	public SmtBrandCode getCode() {
		return code;
	}

	public void setCode(SmtBrandCode code) {
		this.code = code;
	}

	public SmtBrandTypeCode getBrandTypeCode() {
		return brandTypeCode;
	}

	public void setBrandTypeCode(SmtBrandTypeCode brandTypeCode) {
		this.brandTypeCode = brandTypeCode;
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
