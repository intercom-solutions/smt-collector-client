package com.intercom.web.smtcollector.domain.event;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtEntity;
import com.intercom.web.smtcollector.domain.user.SmtUser;
import java.util.Date;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "event")
@JsonPropertyOrder({
	"id",
	"user",
	"date",
	"ip",
	"description"})
public class SmtEvent implements SmtEntity<SmtEvent> {

	private Long id;
	private SmtUser user;
	private Date date;
	private String ip;
	private String description;

	protected SmtEvent() {
		super();
	}

	public SmtEvent(SmtUser user, String ip, String description, Object... arguments) {
		Validate.notNull(user, "The \"user\" parameter can not be null");
		Validate.notNull(description, "The \"description\" parameter can not be null");
		this.user = user;
		this.date = new Date();
		this.ip = ip;
		this.description = String.format(description, arguments);
	}

	@JsonProperty(value = "id")
	public Long getId() {
		return id;
	}

	@JsonProperty(value = "user")
	public SmtUser getUser() {
		return user;
	}

	@JsonProperty(value = "date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getDate() {
		return date;
	}

	@JsonProperty(value = "ip")
	public String getIp() {
		return ip;
	}

	@JsonProperty(value = "description")
	public String getDescription() {
		return description;
	}

	@Override
	public boolean sameIdentityAs(SmtEvent other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(id, other.id)
		.isEquals();
	}

	@Override
	public boolean equals(Object object) {
		if(this == object) {
			return true;
		}
		if((object == null) || (getClass() != object.getClass())) {
			return false;
		}
		final SmtEvent other = (SmtEvent) object;
		return sameIdentityAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(id)
		.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
		.append("id", id)
		.toString();
	}

}
