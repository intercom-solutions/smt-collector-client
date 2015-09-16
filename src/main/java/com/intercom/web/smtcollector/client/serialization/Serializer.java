package com.intercom.web.smtcollector.client.serialization;

import java.io.InputStream;
import java.io.OutputStream;

public interface Serializer<T> {

	public String serialize(T object);

	public void serialize(OutputStream output, T object);

	public T deserialize(String value, final Class<T> type);

	public T deserialize(InputStream input, final Class<T> type);

}
