package com.intercom.web.smtcollector.domain.event;

import com.intercom.web.smtcollector.domain.user.SmtUser;
import com.intercom.web.smtcollector.domain.SmtFilter;
import com.intercom.web.smtcollector.domain.user.SmtUserUsername;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public class SmtEventFilter implements SmtFilter<SmtEvent> {

	private SmtUser user = null;
	private SmtUserUsername userUsername = null;
	private Date fromDate = null;
	private Date toDate = null;
	private String ipStartsWith = null;
	private String ipContains = null;
	private String descriptionStartsWith = null;
	private String descriptionContains = null;

	public SmtEventFilter() {
	}

	public SmtUser getUser() {
		return user;
	}

	public void setUser(SmtUser user) {
		this.user = user;
	}

	public SmtUserUsername getUserUsername() {
		return userUsername;
	}

	public void setUserUsername(SmtUserUsername userUsername) {
		this.userUsername = userUsername;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = ((fromDate != null) ? DateUtils.truncate(fromDate, Calendar.DATE) : null);
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = ((toDate != null) ? DateUtils.addDays(DateUtils.truncate(toDate, Calendar.DATE), 1) : null);
	}

	public String getIpStartsWith() {
		return ipStartsWith;
	}

	public void setIpStartsWith(String ipStartsWith) {
		this.ipStartsWith = ipStartsWith;
	}

	public String getIpContains() {
		return ipContains;
	}

	public void setIpContains(String ipContains) {
		this.ipContains = ipContains;
	}

	public String getDescriptionStartsWith() {
		return descriptionStartsWith;
	}

	public void setDescriptionStartsWith(String descriptionStartsWith) {
		this.descriptionStartsWith = descriptionStartsWith;
	}

	public String getDescriptionContains() {
		return descriptionContains;
	}

	public void setDescriptionContains(String descriptionContains) {
		this.descriptionContains = descriptionContains;
	}

}
