package com.intercom.web.smtcollector.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.intercom.web.smtcollector.domain.variant.SmtVariant;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SmtVariantsPagedResponse extends SmtPagedResponse {

	private Map<String, List<SmtVariant>> embedded;
	private static final String CONTENT_KEY = "smtVariantList";

	@JsonProperty(value = "_embedded")
	protected Map<String, List<SmtVariant>> getEmbedded() {
		return embedded;
	}

	protected void setEmbedded(Map<String, List<SmtVariant>> embedded) {
		this.embedded = embedded;
	}

	public List<SmtVariant> getContent() {
		if((embedded != null) && embedded.containsKey(CONTENT_KEY)) {
			return embedded.get(CONTENT_KEY);
		}
		return Collections.<SmtVariant>emptyList();
	}

}
