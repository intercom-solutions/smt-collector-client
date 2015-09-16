package com.intercom.web.smtcollector.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public abstract class SmtPagedResponse implements SmtResponse {

	private Map<String, SmtLink> links;
	private SmtPage page;

	@JsonProperty(value = "_links")
	public Map<String, SmtLink> getLinks() {
		return links;
	}

	public void setLinks(Map<String, SmtLink> links) {
		this.links = links;
	}

	@JsonProperty(value = "page")
	public SmtPage getPage() {
		return page;
	}

	public void setPage(SmtPage page) {
		this.page = page;
	}

}
