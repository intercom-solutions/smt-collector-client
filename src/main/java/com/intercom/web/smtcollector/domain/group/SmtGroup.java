package com.intercom.web.smtcollector.domain.group;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtAuditableEntity;
import com.intercom.web.smtcollector.domain.SmtValueObject;
import com.intercom.web.smtcollector.domain.product.SmtProduct;
import java.util.Set;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "group")
@JsonPropertyOrder({
	"level",
	"code",
	"parentGroup",
	"childGroupsCount",
	"name",
	"creationDate",
	"creationUser",
	"lastModifiedDate",
	"lastModifiedUser",})
public class SmtGroup extends SmtAuditableEntity<SmtGroup> implements Comparable<SmtGroup> {

	public enum Level implements SmtValueObject<Level> {

		DEPARTMENT {
			@Override
			public boolean isDepartment() {
				return true;
			}

		}, SECTOR {
			@Override
			public boolean isSector() {
				return true;
			}

		}, GROUP {
			@Override
			public boolean isGroup() {
				return true;
			}

		}, FAMILY {
			@Override
			public boolean isFamily() {
				return true;
			}

		}, SUBFAMILY {
			@Override
			public boolean isSubfamily() {
				return true;
			}

		};

		public boolean isDepartment() {
			return false;
		}

		public boolean isSector() {
			return false;
		}

		public boolean isGroup() {
			return false;
		}

		public boolean isFamily() {
			return false;
		}

		public boolean isSubfamily() {
			return false;
		}

		@Override
		public boolean sameValueAs(Level other) {
			return ((other != null) && (this.equals(other)));
		}

	}
	private Level level;
	private SmtGroupCode code;
	private SmtGroup parentGroup;
	private int childGroupsCount;
	private String name;
	private Set<SmtProduct> products;

	protected SmtGroup() {
		super();
	}

	public SmtGroup(Level level, SmtGroupCode code, SmtGroup parentGroup, String name, String creationUser) {
		super(creationUser);
		Validate.notNull(level, "The \"level\" parameter can not be null");
		Validate.notNull(code, "The \"code\" parameter can not be null");
		Validate.isTrue((((level.ordinal() == 0) && (parentGroup == null)) || ((level.ordinal() > 0) && (parentGroup != null))), "The \"parentGroup\" must be null if level is 0, not null otherwise");
		Validate.isTrue(((parentGroup == null) || (parentGroup.getLevel().ordinal() == (level.ordinal() - 1))), "The \"parentGroup\" level is wrong");
		Validate.notNull(name, "The \"name\" parameter can not be null");
		this.code = code;
		this.level = level;
		this.parentGroup = parentGroup;
		this.name = name;
	}

	@JsonProperty(value = "level")
	public Level getLevel() {
		return level;
	}

	@JsonProperty(value = "code")
	public SmtGroupCode getCode() {
		return code;
	}

	@JsonProperty(value = "parentGroup")
	public SmtGroup getParentGroup() {
		return parentGroup;
	}

	public void setParentGroup(SmtGroup parentGroup) {
		this.parentGroup = parentGroup;
	}

	@JsonProperty(value = "childGroupsCount")
	public int getChildGroupsCount() {
		return childGroupsCount;
	}

	public void setChildGroupsCount(int childGroupsCount) {
		this.childGroupsCount = childGroupsCount;
	}

	@JsonProperty(value = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public Set<SmtProduct> getProducts() {
		return products;
	}

	public void setProducts(Set<SmtProduct> products) {
		this.products = products;
	}

	@Override
	public boolean sameIdentityAs(SmtGroup other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(level, other.level)
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
		final SmtGroup other = (SmtGroup) object;
		return sameIdentityAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(level)
		.append(code)
		.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
		.append("code", code)
		.toString();
	}

	@Override
	public int compareTo(SmtGroup other) {
		Validate.notNull(other, "The \"other\" parameter can not be null.");
		return new CompareToBuilder()
		.append(level, other.level)
		.append(name, other.name)
		.toComparison();
	}

}
