package com.intercom.web.smtcollector.client.serialization.json.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonObjectMapperJackson extends ObjectMapper {

	public JsonObjectMapperJackson() {
		super();
		init();
	}

	private void init() {
		enable(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME);
		enable(SerializationFeature.INDENT_OUTPUT);
		disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	}

}
