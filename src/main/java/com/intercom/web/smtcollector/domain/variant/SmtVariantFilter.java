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
	private Set<SmtVariantGtinPrefix> gtinPrefixes = new LinkedHashSet<SmtVariantGtinPrefix>();
	private String gtinStartsWith = null;
	private String gtinContains = null;
	private SmtProductCode productCode = null;
	private Set<SmtProductCode> productCodes = new LinkedHashSet<SmtProductCode>();
	private String productCodeStartsWith = null;
	private String productCodeContains = null;
	private String productTechnicalDescriptionStartsWith = null;
	private String productTechnicalDescriptionContains = null;
	private String productCompactDescriptionStartsWith = null;
	private String productCompactDescriptionContains = null;
	private Boolean productClickAndCollect = null;
	private Boolean web = null;
	private String descriptionStartsWith = null;
	private String descriptionContains = null;
	private Set<SmtGroupCode> subfamilyGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtGroupCode> familyGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtGroupCode> groupGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtGroupCode> sectorGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtGroupCode> departmentGroupCodes = new LinkedHashSet<SmtGroupCode>();
	private Set<SmtBrandTypeCode> brandTypeCodes = new LinkedHashSet<SmtBrandTypeCode>();
	private Set<SmtBrandCode> brandCodes = new LinkedHashSet<SmtBrandCode>();
	private String longTextBrandStartsWith = null;
	private String longTextBrandContains = null;
	private Date lastModifiedDateGreaterThanOrEqualTo = null;

	public SmtVariantFilter() {
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

	public Set<SmtVariantGtinPrefix> getGtinPrefixes() {
		return gtinPrefixes;
	}

	public void setGtinPrefixes(Set<SmtVariantGtinPrefix> gtinPrefixes) {
		this.gtinPrefixes = gtinPrefixes;
	}

	public String getGtinStartsWith() {
		return gtinStartsWith;
	}

	public void setGtinStartsWith(String gtinStartsWith) {
		this.gtinStartsWith = gtinStartsWith;
	}

	public String getGtinContains() {
		return gtinContains;
	}

	public void setGtinContains(String gtinContains) {
		this.gtinContains = gtinContains;
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

	public String getProductCodeStartsWith() {
		return productCodeStartsWith;
	}

	public void setProductCodeStartsWith(String productCodeStartsWith) {
		this.productCodeStartsWith = productCodeStartsWith;
	}

	public String getProductCodeContains() {
		return productCodeContains;
	}

	public void setProductCodeContains(String productCodeContains) {
		this.productCodeContains = productCodeContains;
	}

	public String getProductTechnicalDescriptionStartsWith() {
		return productTechnicalDescriptionStartsWith;
	}

	public void setProductTechnicalDescriptionStartsWith(String productTechnicalDescriptionStartsWith) {
		this.productTechnicalDescriptionStartsWith = productTechnicalDescriptionStartsWith;
	}

	public String getProductTechnicalDescriptionContains() {
		return productTechnicalDescriptionContains;
	}

	public void setProductTechnicalDescriptionContains(String productTechnicalDescriptionContains) {
		this.productTechnicalDescriptionContains = productTechnicalDescriptionContains;
	}

	public String getProductCompactDescriptionStartsWith() {
		return productCompactDescriptionStartsWith;
	}

	public void setProductCompactDescriptionStartsWith(String productCompactDescriptionStartsWith) {
		this.productCompactDescriptionStartsWith = productCompactDescriptionStartsWith;
	}

	public String getProductCompactDescriptionContains() {
		return productCompactDescriptionContains;
	}

	public void setProductCompactDescriptionContains(String productCompactDescriptionContains) {
		this.productCompactDescriptionContains = productCompactDescriptionContains;
	}

	public Boolean getProductClickAndCollect() {
		return productClickAndCollect;
	}

	public void setProductClickAndCollect(Boolean productClickAndCollect) {
		this.productClickAndCollect = productClickAndCollect;
	}

	public Boolean getWeb() {
		return web;
	}

	public void setWeb(Boolean web) {
		this.web = web;
	}

	public String getDescriptionStartsWith() {
		return descriptionStartsWith;
	}

	public void setDescriptionStartsWith(String descriptionStartsWith) {
		this.descriptionStartsWith = descriptionStartsWith;
	}

	public String getDescriptionContains() {
		return descriptionContains;
	}

	public void setDescriptionContains(String descriptionContains) {
		this.descriptionContains = descriptionContains;
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

	public String getLongTextBrandStartsWith() {
		return longTextBrandStartsWith;
	}

	public void setLongTextBrandStartsWith(String longTextBrandStartsWith) {
		this.longTextBrandStartsWith = longTextBrandStartsWith;
	}

	public String getLongTextBrandContains() {
		return longTextBrandContains;
	}

	public void setLongTextBrandContains(String longTextBrandContains) {
		this.longTextBrandContains = longTextBrandContains;
	}

	public Date getLastModifiedDateGreaterThanOrEqualTo() {
		return lastModifiedDateGreaterThanOrEqualTo;
	}

	public void setLastModifiedDateGreaterThanOrEqualTo(Date lastModifiedDateGreaterThanOrEqualTo) {
		this.lastModifiedDateGreaterThanOrEqualTo = lastModifiedDateGreaterThanOrEqualTo;
	}

}
