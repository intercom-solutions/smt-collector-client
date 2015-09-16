package com.intercom.web.smtcollector.domain.user;

import com.intercom.web.smtcollector.domain.company.SmtCompanyCode;
import com.intercom.web.smtcollector.domain.user.SmtUser.AccountStatus;
import com.intercom.web.smtcollector.domain.SmtFilter;

public class SmtUserFilter implements SmtFilter<SmtUser> {

	private String nameLike = null;
	private AccountStatus accountStatus = null;
	private Boolean online = null;
	private SmtCompanyCode companyCode = null;
	private String email = null;
	private String taxCode = null;

	public SmtUserFilter() {
		this.nameLike = null;
		this.accountStatus = null;
	}

	public String getNameLike() {
		return nameLike;
	}

	public void setNameLike(String nameLike) {
		this.nameLike = nameLike;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public Boolean getOnline() {
		return online;
	}

	public void setOnline(Boolean online) {
		this.online = online;
	}

	public SmtCompanyCode getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(SmtCompanyCode companyCode) {
		this.companyCode = companyCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

}
