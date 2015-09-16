package com.intercom.web.smtcollector.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SmtBrandTypesPagedResponse extends SmtPagedResponse {

	private Map<String, List<SmtBrandType>> embedded;
	private static final String CONTENT_KEY = "smtBrandTypeList";

	@JsonProperty(value = "_embedded")
	protected Map<String, List<SmtBrandType>> getEmbedded() {
		return embedded;
	}

	protected void setEmbedded(Map<String, List<SmtBrandType>> embedded) {
		this.embedded = embedded;
	}

	public List<SmtBrandType> getContent() {
		if((embedded != null) && embedded.containsKey(CONTENT_KEY)) {
			return embedded.get(CONTENT_KEY);
		}
		return Collections.<SmtBrandType>emptyList();
	}

}
