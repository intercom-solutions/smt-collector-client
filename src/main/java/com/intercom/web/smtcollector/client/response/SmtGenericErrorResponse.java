package com.intercom.web.smtcollector.client.response;

import javax.ws.rs.core.Response;
import org.apache.commons.lang3.Validate;

public class SmtGenericErrorResponse extends RuntimeException implements SmtResponse {

	private final Response.StatusType status;

	public SmtGenericErrorResponse(Response.StatusType status) {
		Validate.notNull(status, "The \"status\" parameter can not be null");
		this.status = status;
	}

	public int getStatus() {
		return status.getStatusCode();
	}

	@Override
	public String getMessage() {
		return status.getReasonPhrase();
	}
	
	@Override
	public String toString() {
		return ("Error " + status.getStatusCode() + " (" + status.getReasonPhrase() + ")");
	}

}
