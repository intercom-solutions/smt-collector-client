package com.intercom.web.smtcollector.client.serialization.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.intercom.web.smtcollector.client.serialization.json.JsonSerializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.lang3.Validate;

public class JsonSerializerJackson<T> implements JsonSerializer<T> {

	private final ObjectMapper mapper;

	public JsonSerializerJackson() {
		mapper = new JsonObjectMapperJackson();
	}

	@Override
	public String serialize(T object) {
		Validate.notNull(object, "The \"object\" parameter can not be null.");
		try {
			return mapper.writeValueAsString(object);
		} catch(IOException e) {
			throw new RuntimeException("Can't serialize object of class \"" + object.getClass().getName() + "\" to JSON.", e);
		}
	}

	@Override
	public void serialize(OutputStream output, T object) {
		Validate.notNull(output, "The \"output\" parameter can not be null.");
		Validate.notNull(object, "The \"object\" parameter can not be null.");
		try {
			mapper.writeValue(output, object);
		} catch(IOException e) {
			throw new RuntimeException("Can't serialize object of class \"" + object.getClass().getName() + "\" to JSON.", e);
		}
	}

	@Override
	public T deserialize(String value, final Class<T> type) {
		Validate.notNull(value, "The \"value\" parameter can not be null.");
		Validate.notNull(type, "The \"type\" parameter can not be null.");
		try {
			return mapper.readValue(value, type);
		} catch(IOException e) {
			throw new RuntimeException("Can't deserialize object of class \"" + type.getName() + "\" from JSON.", e);
		}
	}

	@Override
	public T deserialize(InputStream input, Class<T> type) {
		Validate.notNull(input, "The \"input\" parameter can not be null.");
		Validate.notNull(type, "The \"type\" parameter can not be null.");
		try {
			return mapper.readValue(input, type);
		} catch(IOException e) {
			throw new RuntimeException("Can't deserialize object of class \"" + type.getName() + "\" from JSON.", e);
		}
	}

}
