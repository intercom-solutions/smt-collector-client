package com.intercom.web.smtcollector.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import org.apache.commons.lang3.Validate;

public abstract class SmtAuditableEntity<DomainAuditableEntityT extends SmtAuditableEntity<DomainAuditableEntityT>> implements SmtEntity<DomainAuditableEntityT> {

	protected Date creationDate;
	protected String creationUser;
	protected Date lastModifiedDate = null;
	protected String lastModifiedUser = null;

	protected SmtAuditableEntity() {
		super();
	}

	protected SmtAuditableEntity(Date creationDate, String creationUser) {
		Validate.notNull(creationDate, "The \"creationDate\" parameter can not be null");
		Validate.notNull(creationUser, "The \"creationUser\" parameter can not be null");
		this.creationDate = creationDate;
		this.creationUser = creationUser;
	}

	protected SmtAuditableEntity(String creationUser) {
		this(new Date(), creationUser);
	}

	@JsonProperty(value = "creationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getCreationDate() {
		return creationDate;
	}

	@JsonProperty(value = "creationUser")
	public String getCreationUser() {
		return creationUser;
	}

	@JsonProperty(value = "lastModifiedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	@JsonProperty(value = "lastModifiedUser")
	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setCreationInfo(Date creationDate, String creationUser) {
		this.creationDate = creationDate;
		this.creationUser = creationUser;
	}

	public void setCreationInfo(String creationUser) {
		setCreationInfo(new Date(), creationUser);
	}

	public void setLastModifiedInfo(Date lastModifiedDate, String lastModifiedUser) {
		this.lastModifiedDate = lastModifiedDate;
		this.lastModifiedUser = lastModifiedUser;
	}

	public void setLastModifiedInfo(String lastModifiedUser) {
		setLastModifiedInfo(new Date(), lastModifiedUser);
	}

}
