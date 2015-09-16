package com.intercom.web.smtcollector.domain.group;

import com.intercom.web.smtcollector.domain.SmtFilter;

public class SmtGroupFilter implements SmtFilter<SmtGroup> {

	private SmtGroup.Level level = null;
	private SmtGroupCode code = null;
	private SmtGroupCode parentGroupCode = null;
	private String codeStartsWith = null;
	private String codeLike = null;
	private String nameStartsWith = null;
	private String nameLike = null;

	public SmtGroupFilter() {
	}

	public SmtGroup.Level getLevel() {
		return level;
	}

	public void setLevel(SmtGroup.Level level) {
		this.level = level;
	}

	public SmtGroupCode getCode() {
		return code;
	}

	public void setCode(SmtGroupCode code) {
		this.code = code;
	}

	public SmtGroupCode getParentGroupCode() {
		return parentGroupCode;
	}

	public void setParentGroupCode(SmtGroupCode parentGroupCode) {
		this.parentGroupCode = parentGroupCode;
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
