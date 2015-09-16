package com.intercom.web.smtcollector.domain.product;

import com.intercom.web.smtcollector.domain.SmtFilter;

public class SmtProductFilter implements SmtFilter<SmtProduct> {

	private String codeLike;
	private String technicalDescriptionLike;
	private String compactDescriptionLike;

	public SmtProductFilter() {
		this.codeLike = null;
		this.technicalDescriptionLike = null;
	}

	public String getCodeLike() {
		return codeLike;
	}

	public void setCodeLike(String codeLike) {
		this.codeLike = codeLike;
	}

	public String getTechnicalDescriptionLike() {
		return technicalDescriptionLike;
	}

	public void setTechnicalDescriptionLike(String technicalDescriptionLike) {
		this.technicalDescriptionLike = technicalDescriptionLike;
	}

	public String getCompactDescriptionLike() {
		return compactDescriptionLike;
	}

	public void setCompactDescriptionLike(String compactDescriptionLike) {
		this.compactDescriptionLike = compactDescriptionLike;
	}

}
