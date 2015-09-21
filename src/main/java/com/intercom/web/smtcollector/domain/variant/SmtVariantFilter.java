package com.intercom.web.smtcollector.domain.variant;

import com.intercom.web.smtcollector.domain.SmtFilter;
import com.intercom.web.smtcollector.domain.brand.SmtBrandCode;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandTypeCode;
import com.intercom.web.smtcollector.domain.group.SmtGroupCode;
import com.intercom.web.smtcollector.domain.product.SmtProductCode;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class SmtVariantFilter implements SmtFilter<SmtVariant> {

	private SmtVariantGtin gtin = null;
	private Set<SmtVariantGtin> gtins = new LinkedHashSet<SmtVariantGtin>();
	private String gtinLike = null;
	private Date lastModifiedDateGreaterThanOrEqualTo = null;
	private SmtProductCode productCode = null;
	private Set<SmtProductCode> productCodes = new LinkedHashSet<SmtProductCode>();
	private String productCodeLike = null;
	private String productTechnicalDescriptionLike = null;
	private String productCompactDescriptionLike = null;
	private Boolean productClickAndCollect = null;
	private String descriptionLike = null;
	private Set<SmtGroupCode> subfamilyGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtGroupCode> familyGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtGroupCode> groupGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtGroupCode> sectorGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtGroupCode> departmentGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtBrandTypeCode> brandTypeCodes = new LinkedHashSet<SmtBrandTypeCode>();
	private Set<SmtBrandCode> brandCodes = new LinkedHashSet<SmtBrandCode>();
	private String longTextBrandLike = null;
	private String longTextBrandStartsWith = null;

	public SmtVariantFilter() {
		this.gtinLike = null;
		this.productCodeLike = null;
	}

	public SmtVariantGtin getGtin() {
		return gtin;
	}

	public void setGtin(SmtVariantGtin gtin) {
		this.gtin = gtin;
	}

	public Set<SmtVariantGtin> getGtins() {
		return gtins;
	}

	public void setGtins(Set<SmtVariantGtin> gtins) {
		this.gtins = gtins;
	}

	public String getGtinLike() {
		return gtinLike;
	}

	public void setGtinLike(String gtinLike) {
		this.gtinLike = gtinLike;
	}

	public Date getLastModifiedDateGreaterThanOrEqualTo() {
		return lastModifiedDateGreaterThanOrEqualTo;
	}

	public void setLastModifiedDateGreaterThanOrEqualTo(Date lastModifiedDateGreaterThanOrEqualTo) {
		this.lastModifiedDateGreaterThanOrEqualTo = lastModifiedDateGreaterThanOrEqualTo;
	}

	public SmtProductCode getProductCode() {
		return productCode;
	}

	public void setProductCode(SmtProductCode productCode) {
		this.productCode = productCode;
	}

	public Set<SmtProductCode> getProductCodes() {
		return productCodes;
	}

	public void setProductCodes(Set<SmtProductCode> productCodes) {
		this.productCodes = productCodes;
	}

	public String getProductCodeLike() {
		return productCodeLike;
	}

	public void setProductCodeLike(String productCodeLike) {
		this.productCodeLike = productCodeLike;
	}

	public String getProductTechnicalDescriptionLike() {
		return productTechnicalDescriptionLike;
	}

	public void setProductTechnicalDescriptionLike(String productTechnicalDescriptionLike) {
		this.productTechnicalDescriptionLike = productTechnicalDescriptionLike;
	}

	public String getProductCompactDescriptionLike() {
		return productCompactDescriptionLike;
	}

	public void setProductCompactDescriptionLike(String productCompactDescriptionLike) {
		this.productCompactDescriptionLike = productCompactDescriptionLike;
	}

	public Boolean getProductClickAndCollect() {
		return productClickAndCollect;
	}

	public void setProductClickAndCollect(Boolean productClickAndCollect) {
		this.productClickAndCollect = productClickAndCollect;
	}

	public String getDescriptionLike() {
		return descriptionLike;
	}

	public void setDescriptionLike(String descriptionLike) {
		this.descriptionLike = descriptionLike;
	}

	public Set<SmtGroupCode> getSubfamilyGroupCodes() {
		return subfamilyGroupCodes;
	}

	public void setSubfamilyGroupCodes(Set<SmtGroupCode> subfamilyGroupCodes) {
		this.subfamilyGroupCodes = subfamilyGroupCodes;
	}

	public Set<SmtGroupCode> getFamilyGroupCodes() {
		return familyGroupCodes;
	}

	public void setFamilyGroupCodes(Set<SmtGroupCode> familyGroupCodes) {
		this.familyGroupCodes = familyGroupCodes;
	}

	public Set<SmtGroupCode> getGroupGroupCodes() {
		return groupGroupCodes;
	}

	public void setGroupGroupCodes(Set<SmtGroupCode> groupGroupCodes) {
		this.groupGroupCodes = groupGroupCodes;
	}

	public Set<SmtGroupCode> getSectorGroupCodes() {
		return sectorGroupCodes;
	}

	public void setSectorGroupCodes(Set<SmtGroupCode> sectorGroupCodes) {
		this.sectorGroupCodes = sectorGroupCodes;
	}

	public Set<SmtGroupCode> getDepartmentGroupCodes() {
		return departmentGroupCodes;
	}

	public void setDepartmentGroupCodes(Set<SmtGroupCode> departmentGroupCodes) {
		this.departmentGroupCodes = departmentGroupCodes;
	}

	public Set<SmtBrandTypeCode> getBrandTypeCodes() {
		return brandTypeCodes;
	}

	public void setBrandTypeCodes(Set<SmtBrandTypeCode> brandTypeCodes) {
		this.brandTypeCodes = brandTypeCodes;
	}

	public Set<SmtBrandCode> getBrandCodes() {
		return brandCodes;
	}

	public void setBrandCodes(Set<SmtBrandCode> brandCodes) {
		this.brandCodes = brandCodes;
	}

	public String getLongTextBrandLike() {
		return longTextBrandLike;
	}

	public void setLongTextBrandLike(String longTextBrandLike) {
		this.longTextBrandLike = longTextBrandLike;
	}

	public String getLongTextBrandStartsWith() {
		return longTextBrandStartsWith;
	}

	public void setLongTextBrandStartsWith(String longTextBrandStartsWith) {
		this.longTextBrandStartsWith = longTextBrandStartsWith;
	}

}
