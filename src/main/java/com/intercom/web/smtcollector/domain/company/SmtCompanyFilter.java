package com.intercom.web.smtcollector.domain.company;

import com.intercom.web.smtcollector.domain.company.SmtCompany.Status;
import com.intercom.web.smtcollector.domain.SmtFilter;

public class SmtCompanyFilter implements SmtFilter<SmtCompany> {

	private String codeStartsWith = null;
	private String codeContains = null;
	private String nameStartsWith = null;
	private String nameContains = null;
	private Status status = null;
	private String vatNumber = null;
	private String vatNumberStartsWith = null;
	private String vatNumberContains = null;
	private String taxCode = null;
	private String taxCodeStartsWith = null;
	private String taxCodeContains = null;

	public SmtCompanyFilter() {
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

	public String getVatNumberStartsWith() {
		return vatNumberStartsWith;
	}

	public void setVatNumberStartsWith(String vatNumberStartsWith) {
		this.vatNumberStartsWith = vatNumberStartsWith;
	}

	public String getVatNumberContains() {
		return vatNumberContains;
	}

	public void setVatNumberContains(String vatNumberContains) {
		this.vatNumberContains = vatNumberContains;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxCodeStartsWith() {
		return taxCodeStartsWith;
	}

	public void setTaxCodeStartsWith(String taxCodeStartsWith) {
		this.taxCodeStartsWith = taxCodeStartsWith;
	}

	public String getTaxCodeContains() {
		return taxCodeContains;
	}

	public void setTaxCodeContains(String taxCodeContains) {
		this.taxCodeContains = taxCodeContains;
	}

}
