package com.intercom.web.smtcollector.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.intercom.web.smtcollector.domain.brand.SmtBrand;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SmtBrandsPagedResponse extends SmtPagedResponse {

	private Map<String, List<SmtBrand>> embedded;
	private static final String CONTENT_KEY = "smtBrandList";

	@JsonProperty(value = "_embedded")
	protected Map<String, List<SmtBrand>> getEmbedded() {
		return embedded;
	}

	protected void setEmbedded(Map<String, List<SmtBrand>> embedded) {
		this.embedded = embedded;
	}

	public List<SmtBrand> getContent() {
		if((embedded != null) && embedded.containsKey(CONTENT_KEY)) {
			return embedded.get(CONTENT_KEY);
		}
		return Collections.<SmtBrand>emptyList();
	}

}
