package com.intercom.web.smtcollector.domain.role;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtEntity;
import com.intercom.web.smtcollector.domain.user.SmtUser;
import java.util.Collections;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "role")
@JsonPropertyOrder({
	"id",
	"name"})
public class SmtRole implements SmtEntity<SmtRole>, Comparable<SmtRole> {

	private SmtRoleId id;
	private String name;
	private Set<SmtUser> users;

	protected SmtRole() {
		super();
	}

	@JsonProperty(value = "id")
	public SmtRoleId getId() {
		return id;
	}

	@JsonProperty(value = "name")
	public String getName() {
		return name;
	}

	@JsonIgnore
	public Set<SmtUser> getUsers() {
		return Collections.unmodifiableSet(users);
	}

	@Override
	public boolean sameIdentityAs(SmtRole other) {
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
		final SmtRole other = (SmtRole) object;
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

	@Override
	public int compareTo(SmtRole other) {
		Validate.notNull(other, "The \"other\" parameter can not be null.");
		return new CompareToBuilder()
		.append(id, other.id)
		.toComparison();
	}

}
