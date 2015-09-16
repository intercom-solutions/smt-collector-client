package com.intercom.web.smtcollector.domain.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.role.SmtRole;
import com.intercom.web.smtcollector.domain.SmtAuditableEntity;
import com.intercom.web.smtcollector.domain.SmtValueObject;
import com.intercom.web.smtcollector.domain.company.SmtCompany;
import com.intercom.web.smtcollector.domain.locale.SmtLocale;
import com.intercom.web.smtcollector.domain.role.SmtRoleId;
import com.intercom.web.smtcollector.domain.variant.SmtVariantGtinPrefix;
import java.util.Calendar;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.text.StrBuilder;
import org.apache.commons.lang3.time.DateUtils;

@JacksonXmlRootElement(localName = "user")
@JsonPropertyOrder({
	"username",
	"firstName",
	"lastName",
	"name",
	"accountStatus",
	"company",
	"email",
	"locale",
	"passwordLastModifiedDate",
	"passwordExpirationInterval",
	"passwordExpirationDate",
	"passwordExpired",
	"accountExpirationDate",
	"accountExpired",
	"accessCounter",
	"lastAccessDate",
	"lastAccessIp",
	"online",
	"lastRequestDate",
	"birthDate",
	"taxCode",
	"gender",
	"country",
	"province",
	"city",
	"postalCode",
	"address",
	"mobile",
	"phone",
	"fax",
	"notes",
	"accountActivationDate",
	"accountActivationUser",
	"accountLockDate",
	"accountLockUser",
	"roles",
	"variantGtinPrefixes",
	"creationDate",
	"creationUser",
	"lastModifiedDate",
	"lastModifiedUser"})
public class SmtUser extends SmtAuditableEntity<SmtUser> {

	public enum AccountStatus implements SmtValueObject<AccountStatus> {

		PENDING {
			@Override
			public boolean isPending() {
				return true;
			}

		}, ACTIVE {
			@Override
			public boolean isActive() {
				return true;
			}

		}, LOCKED {
			@Override
			public boolean isLocked() {
				return true;
			}

		};

		public boolean isPending() {
			return false;
		}

		public boolean isActive() {
			return false;
		}

		public boolean isLocked() {
			return false;
		}

		@Override
		public boolean sameValueAs(AccountStatus other) {
			return ((other != null) && (this.equals(other)));
		}

	}

	public enum Gender implements SmtValueObject<Gender> {

		MALE {
			@Override
			public boolean isMale() {
				return true;
			}

		}, FEMALE {
			@Override
			public boolean isFemale() {
				return true;
			}

		};

		public boolean isMale() {
			return false;
		}

		public boolean isFemale() {
			return false;
		}

		@Override
		public boolean sameValueAs(Gender other) {
			return ((other != null) && (this.equals(other)));
		}

	}

	private SmtUserUsername username;
	private String firstName;
	private String lastName;
	private AccountStatus accountStatus = AccountStatus.PENDING;
	private SmtCompany company = null;
	private String email;
	private SmtLocale locale;
	private String password = null;
	private Date passwordLastModifiedDate = null;
	private Integer passwordExpirationInterval = null;
	private Date accountExpirationDate = null;
	private Integer accessCounter = 0;
	private Date lastAccessDate = null;
	private String lastAccessIp = null;
	private boolean online = false;
	private Date lastRequestDate = null;
	private Date birthDate = null;
	private String taxCode = null;
	private Gender gender = null;
	private String country = null;
	private String province = null;
	private String city = null;
	private String postalCode = null;
	private String address = null;
	private String mobile = null;
	private String phone = null;
	private String fax = null;
	private String notes = null;
	private Date accountActivationDate = null;
	private String accountActivationUser = null;
	private Date accountLockDate = null;
	private String accountLockUser = null;
	private SortedSet<SmtRole> roles = new TreeSet<SmtRole>();
	private SortedSet<SmtVariantGtinPrefix> variantGtinPrefixes = new TreeSet<SmtVariantGtinPrefix>();

	protected SmtUser() {
		super();
	}

	public SmtUser(SmtUserUsername username, String firstName, String lastName, String email, SmtLocale locale, String creationUser) {
		super(creationUser);
		Validate.notNull(username, "The \"username\" parameter can not be null");
		Validate.notNull(firstName, "The \"firstName\" parameter can not be null");
		Validate.notNull(lastName, "The \"lastName\" parameter can not be null");
		Validate.notNull(email, "The \"email\" parameter can not be null");
		Validate.notNull(locale, "The \"locale\" parameter can not be null");
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.locale = locale;
	}

	@JsonProperty(value = "username")
	public SmtUserUsername getUsername() {
		return username;
	}

	public void setUsername(SmtUserUsername username) {
		this.username = username;
	}

	@JsonProperty(value = "firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty(value = "lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName(boolean firstNameBefore, String separator) {
		StrBuilder builder = new StrBuilder();
		builder.append(firstNameBefore ? firstName : lastName);
		builder.append((separator != null) ? separator : " ");
		builder.append(firstNameBefore ? lastName : firstName);
		return builder.toString();
	}

	@JsonProperty(value = "name")
	public String getName() {
		return getName(true, null);
	}

	@JsonProperty(value = "accountStatus")
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	@JsonProperty(value = "company")
	public SmtCompany getCompany() {
		return company;
	}

	public void setCompany(SmtCompany company) {
		this.company = company;
	}

	@JsonProperty(value = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty(value = "locale")
	public SmtLocale getLocale() {
		return locale;
	}

	public void setLocale(SmtLocale locale) {
		this.locale = locale;
	}

	@JsonIgnore
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonProperty(value = "passwordLastModifiedDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getPasswordLastModifiedDate() {
		return passwordLastModifiedDate;
	}

	public void setPasswordLastModifiedDate(Date passwordLastModifiedDate) {
		this.passwordLastModifiedDate = passwordLastModifiedDate;
	}

	public void setPasswordLastModifiedDate() {
		this.passwordLastModifiedDate = new Date();
	}

	@JsonProperty(value = "passwordExpirationInterval")
	public Integer getPasswordExpirationInterval() {
		return passwordExpirationInterval;
	}

	public void setPasswordExpirationInterval(Integer passwordExpirationInterval) {
		this.passwordExpirationInterval = passwordExpirationInterval;
	}

	@JsonProperty(value = "passwordExpirationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getPasswordExpirationDate() {
		if(!accountStatus.isPending() && (getPasswordLastModifiedDate() != null) && (getPasswordExpirationInterval() != null)) {
			return DateUtils.addDays(DateUtils.truncate(getPasswordLastModifiedDate(), Calendar.DATE), getPasswordExpirationInterval());
		}
		return null;
	}

	@JsonProperty(value = "passwordExpired")
	public boolean isPasswordExpired() {
		Date passwordEpirationDate = getPasswordExpirationDate();
		if(passwordEpirationDate != null) {
			Date today = DateUtils.truncate(new Date(), Calendar.DATE);
			return !today.before(passwordEpirationDate);
		}
		return false;
	}

	@JsonProperty(value = "accountExpirationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getAccountExpirationDate() {
		return accountExpirationDate;
	}

	public void setAccountExpirationDate(Date accountExpirationDate) {
		this.accountExpirationDate = accountExpirationDate;
	}

	@JsonProperty(value = "accountExpired")
	public boolean isAccountExpired() {
		if(!accountStatus.isPending()) {
			Date today = DateUtils.truncate(new Date(), Calendar.DATE);
			return ((getAccountExpirationDate() != null) && !today.before(getAccountExpirationDate()));
		}
		return false;
	}

	@JsonProperty(value = "accessCounter")
	public Integer getAccessCounter() {
		return accessCounter;
	}

	public void setAccessCounter(Integer accessCounter) {
		this.accessCounter = accessCounter;
	}

	@JsonProperty(value = "lastAccessDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getLastAccessDate() {
		return lastAccessDate;
	}

	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}

	@JsonProperty(value = "lastAccessIp")
	public String getLastAccessIp() {
		return lastAccessIp;
	}

	public void setLastAccessIp(String lastAccessIp) {
		this.lastAccessIp = lastAccessIp;
	}

	@JsonProperty(value = "online")
	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	@JsonProperty(value = "lastRequestDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getLastRequestDate() {
		return lastRequestDate;
	}

	public void setLastRequestDate(Date lastRequestDate) {
		this.lastRequestDate = lastRequestDate;
	}

	public void setLastRequestDate() {
		this.lastRequestDate = new Date();
	}

	@JsonProperty(value = "birthDate")
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@JsonProperty(value = "taxCode")
	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	@JsonProperty(value = "gender")
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	@JsonProperty(value = "mobile")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	@JsonProperty(value = "notes")
	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@JsonProperty(value = "accountActivationDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getAccountActivationDate() {
		return accountActivationDate;
	}

	public void setAccountActivationDate(Date accountActivationDate) {
		this.accountActivationDate = accountActivationDate;
	}

	@JsonProperty(value = "accountActivationUser")
	public String getAccountActivationUser() {
		return accountActivationUser;
	}

	public void setAccountActivationUser(String accountActivationUser) {
		this.accountActivationUser = accountActivationUser;
	}

	public void setAccountActivationInfo(Date accountActivationDate, String accountActivationUser) {
		this.accountActivationDate = accountActivationDate;
		this.accountActivationUser = accountActivationUser;
	}

	public void setAccountActivationInfo(String accountActivationUser) {
		setAccountActivationInfo(new Date(), accountActivationUser);
	}

	public void removeAccountActivationInfo() {
		this.accountActivationDate = null;
		this.accountActivationUser = null;
	}

	@JsonProperty(value = "accountLockDate")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMddHHmmss")
	public Date getAccountLockDate() {
		return accountLockDate;
	}

	public void setAccountLockDate(Date accountLockDate) {
		this.accountLockDate = accountLockDate;
	}

	@JsonProperty(value = "accountLockUser")
	public String getAccountLockUser() {
		return accountLockUser;
	}

	public void setAccountLockUser(String accountLockUser) {
		this.accountLockUser = accountLockUser;
	}

	public void setAccountLockInfo(Date accountLockDate, String accountLockUser) {
		this.accountLockDate = accountLockDate;
		this.accountLockUser = accountLockUser;
	}

	public void setAccountLockInfo(String accountLockUser) {
		setAccountLockInfo(new Date(), accountLockUser);
	}

	public void removeAccountLockInfo() {
		this.accountLockDate = null;
		this.accountLockUser = null;
	}

	@JsonProperty(value = "roles")
	public SortedSet<SmtRole> getRoles() {
		return roles;
	}

	public void setRoles(SortedSet<SmtRole> roles) {
		this.roles = roles;
	}

	public boolean hasRole(SmtRoleId roleId) {
		if(roleId != null) {
			for(SmtRole role : roles) {
				if(role.getId().equals(roleId)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean hasRole(String roleIdValue) {
		if(SmtRoleId.isValid(roleIdValue)) {
			return hasRole(SmtRoleId.valueOf(roleIdValue));
		}
		return false;
	}

	@JsonProperty(value = "variantGtinPrefixes")
	public SortedSet<SmtVariantGtinPrefix> getVariantGtinPrefixes() {
		return variantGtinPrefixes;
	}

	public void setVariantGtinPrefixes(SortedSet<SmtVariantGtinPrefix> variantGtinPrefixes) {
		this.variantGtinPrefixes = variantGtinPrefixes;
	}

	@Override
	public boolean sameIdentityAs(SmtUser other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(username, other.username)
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
		final SmtUser other = (SmtUser) object;
		return sameIdentityAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(username)
		.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
		.append("username", username)
		.toString();
	}

}
