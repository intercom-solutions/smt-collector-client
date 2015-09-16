package com.intercom.web.smtcollector.domain.event;

import com.intercom.web.smtcollector.domain.user.SmtUser;
import com.intercom.web.smtcollector.domain.SmtFilter;
import java.util.Date;

public class SmtEventFilter implements SmtFilter<SmtEvent> {

	private SmtUser user;
	private Date fromDate;
	private Date toDate;
	private String ip;
	private String description;

	public SmtEventFilter() {
		this.user = null;
		this.fromDate = null;
		this.toDate = null;
		this.ip = null;
		this.description = null;
	}

	public SmtUser getUser() {
		return user;
	}

	public void setUser(SmtUser user) {
		this.user = user;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
