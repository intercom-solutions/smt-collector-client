package com.intercom.web.smtcollector.domain.company;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtAuditableEntity;
import com.intercom.web.smtcollector.domain.SmtValueObject;
import com.intercom.web.smtcollector.domain.user.SmtUser;
import java.util.Date;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "company")
@JsonPropertyOrder({
	"code",
	"name",
	"status",
	"vatNumber",
	"taxCode",
	"country",
	"province",
	"city",
	"postalCode",
	"address",
	"phone",
	"fax",
	"email",
	"web",
	"contact",
	"notes",
	"creationDate",
	"creationUser",
	"lastModifiedDate",
	"lastModifiedUser",
	"dismissDate",
	"dismissUser"})
public class SmtCompany extends SmtAuditableEntity<SmtCompany> {

	public enum Status implements SmtValueObject<Status> {

		ACTIVE {
			@Override
			public boolean isActive() {
				return true;
			}

		},
		DISMISSED {
			@Override
			public boolean isDismissed() {
				return true;
			}

		};

		public boolean isActive() {
			return false;
		}

		public boolean isDismissed() {
			return false;
		}

		@Override
		public boolean sameValueAs(Status other) {
			return ((other != null) && (this.equals(other)));
		}

	}

	private SmtCompanyCode code;
	private String name;
	private Status status = Status.ACTIVE;
	private String vatNumber = null;
	private String taxCode = null;
	private String country = null;
	private String province = null;
	private String city = null;
	private String postalCode = null;
	private String address = null;
	private String phone = null;
	private String fax = null;
	private String email = null;
	private String web = null;
	private String contact = null;
	private String notes = null;
	private Date dismissDate = null;
	private String dismissUser = null;
	private Set<SmtUser> users;

	protected SmtCompany() {
		super();
	}

	public SmtCompany(SmtCompanyCode code, String name, String creationUser) {
		super(creationUser);
		Validate.notNull(code, "The \"code\" parameter can not be null");
		Validate.notNull(name, "The \"name\" parameter can not be null");
		this.code = code;
		this.name = name;
	}

	@JsonProperty(value = "code")
	public SmtCompanyCode getCode() {
		return code;
	}

	public void setCode(SmtCompanyCode code) {
		this.code = code;
	}

	@JsonProperty(value = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty(value = "status")
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@JsonProperty(value = "vatNumber")
	public String getVatNumber() {
		return vatNumber;
	}

	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	@JsonProperty(value = "taxCode")
	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	@JsonProperty(value = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@JsonProperty(value = "province")
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@JsonProperty(value = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@JsonProperty(value = "postalCode")
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@JsonProperty(value = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty(value = "phone")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty(value = "fax")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@JsonProperty(value = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty(value = "web")
	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	@JsonProperty(value = "contact")
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@JsonProperty(value = "notes")
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@JsonProperty(value = "dismissDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getDismissDate() {
		return dismissDate;
	}

	public void setDismissDate(Date dismissDate) {
		this.dismissDate = dismissDate;
	}

	@JsonProperty(value = "dismissUser")
	public String getDismissUser() {
		return dismissUser;
	}

	public void setDismissUser(String dismissUser) {
		this.dismissUser = dismissUser;
	}

	@JsonIgnore
	public void setDismissInfo(Date dismissDate, String dismissUser) {
		this.dismissDate = dismissDate;
		this.dismissUser = dismissUser;
	}

	public void setDismissInfo(String dismissUser) {
		setDismissInfo(new Date(), dismissUser);
	}

	public void removeDismissInfo() {
		this.dismissDate = null;
		this.dismissUser = null;
	}

	@JsonIgnore
	public Set<SmtUser> getUsers() {
		return users;
	}

	public void setUsers(Set<SmtUser> users) {
		this.users = users;
	}

	@Override
	public boolean sameIdentityAs(SmtCompany other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(code, other.code)
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
		final SmtCompany other = (SmtCompany) object;
		return sameIdentityAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(code)
		.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
		.append("code", code)
		.toString();
	}

}
