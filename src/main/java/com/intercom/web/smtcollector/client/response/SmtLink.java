package com.intercom.web.smtcollector.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmtLink {

	private String href;
	private boolean templated;

	@JsonProperty(value = "href")
	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	@JsonProperty(value = "templated")
	public boolean isTemplated() {
		return templated;
	}

	public void setTemplated(boolean templated) {
		this.templated = templated;
	}

}
