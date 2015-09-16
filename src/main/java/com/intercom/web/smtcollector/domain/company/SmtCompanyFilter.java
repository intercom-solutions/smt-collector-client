package com.intercom.web.smtcollector.domain.company;

import com.intercom.web.smtcollector.domain.company.SmtCompany.Status;
import com.intercom.web.smtcollector.domain.SmtFilter;

public class SmtCompanyFilter implements SmtFilter<SmtCompany> {

	private String codeLike;
	private String nameLike;
	private Status status;
	private String vatNumber;
	private String vatNumberLike;
	private String taxCode;
	private String taxCodeLike;

	public SmtCompanyFilter() {
		this.nameLike = null;
		this.status = null;
	}

	public String getCodeLike() {
		return codeLike;
	}

	public void setCodeLike(String codeLike) {
		this.codeLike = codeLike;
	}

	public String getNameLike() {
		return nameLike;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	public String getVatNumberLike() {
		return vatNumberLike;
	}

	public void setVatNumberLike(String vatNumberLike) {
		this.vatNumberLike = vatNumberLike;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxCodeLike() {
		return taxCodeLike;
	}

	public void setTaxCodeLike(String taxCodeLike) {
		this.taxCodeLike = taxCodeLike;
	}

}
