package com.intercom.web.smtcollector.domain.locale;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtEntity;
import java.util.Locale;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "locale")
@JsonPropertyOrder({
	"id",
	"position",
	"language",
	"displayLanguage",
	"country",
	"displayCountry"})
public class SmtLocale implements SmtEntity<SmtLocale> {

	private SmtLocaleId id;
	private Integer position;

	protected SmtLocale() {
		super();
	}

	@JsonProperty(value = "id")
	public SmtLocaleId getId() {
		return id;
	}

	@JsonProperty(value = "position")
	public Integer getPosition() {
		return position;
	}

	@JsonIgnore
	public Locale getLocale() {
		return LocaleUtils.toLocale(id.getValue());
	}

	@JsonProperty(value = "language")
	public String getLanguage() {
		return getLocale().getLanguage();
	}

	@JsonProperty(value = "displayLanguage")
	public String getDisplayLanguage() {
		return getLocale().getDisplayLanguage();
	}

	@JsonProperty(value = "country")
	public String getCountry() {
		return StringUtils.stripToNull(getLocale().getCountry());
	}

	@JsonProperty(value = "displayCountry")
	public String getDisplayCountry() {
		return getLocale().getDisplayCountry();
	}

	@Override
	public boolean sameIdentityAs(SmtLocale other) {
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
		final SmtLocale other = (SmtLocale) object;
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
