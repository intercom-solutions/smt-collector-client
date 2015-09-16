package com.intercom.web.smtcollector.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.intercom.web.smtcollector.domain.group.SmtGroup;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SmtGroupsPagedResponse extends SmtPagedResponse {

	private Map<String, List<SmtGroup>> embedded;
	private static final String CONTENT_KEY = "smtGroupList";

	@JsonProperty(value = "_embedded")
	protected Map<String, List<SmtGroup>> getEmbedded() {
		return embedded;
	}

	protected void setEmbedded(Map<String, List<SmtGroup>> embedded) {
		this.embedded = embedded;
	}

	public List<SmtGroup> getContent() {
		if((embedded != null) && embedded.containsKey(CONTENT_KEY)) {
			return embedded.get(CONTENT_KEY);
		}
		return Collections.<SmtGroup>emptyList();
	}

}
