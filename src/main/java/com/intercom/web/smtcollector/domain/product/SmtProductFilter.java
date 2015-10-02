package com.intercom.web.smtcollector.domain.product;

import com.intercom.web.smtcollector.domain.SmtFilter;

public class SmtProductFilter implements SmtFilter<SmtProduct> {

	private String codeStartsWith = null;
	private String codeContains = null;
	private String technicalDescriptionStartsWith = null;
	private String technicalDescriptionContains = null;
	private String compactDescriptionStartsWith = null;
	private String compactDescriptionContains = null;
	private Boolean clickAndCollect = null;

	public SmtProductFilter() {
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

	public String getTechnicalDescriptionStartsWith() {
		return technicalDescriptionStartsWith;
	}

	public void setTechnicalDescriptionStartsWith(String technicalDescriptionStartsWith) {
		this.technicalDescriptionStartsWith = technicalDescriptionStartsWith;
	}

	public String getTechnicalDescriptionContains() {
		return technicalDescriptionContains;
	}

	public void setTechnicalDescriptionContains(String technicalDescriptionContains) {
		this.technicalDescriptionContains = technicalDescriptionContains;
	}

	public String getCompactDescriptionStartsWith() {
		return compactDescriptionStartsWith;
	}

	public void setCompactDescriptionStartsWith(String compactDescriptionStartsWith) {
		this.compactDescriptionStartsWith = compactDescriptionStartsWith;
	}

	public String getCompactDescriptionContains() {
		return compactDescriptionContains;
	}

	public void setCompactDescriptionContains(String compactDescriptionContains) {
		this.compactDescriptionContains = compactDescriptionContains;
	}

	public Boolean getClickAndCollect() {
		return clickAndCollect;
	}

	public void setClickAndCollect(Boolean clickAndCollect) {
		this.clickAndCollect = clickAndCollect;
	}

}
