package com.intercom.web.smtcollector.client;

import com.intercom.web.smtcollector.client.response.SmtBrandTypesPagedResponse;
import com.intercom.web.smtcollector.client.response.SmtBrandsPagedResponse;
import com.intercom.web.smtcollector.client.response.SmtDetailedErrorResponse;
import com.intercom.web.smtcollector.client.response.SmtGroupsPagedResponse;
import com.intercom.web.smtcollector.client.response.SmtLink;
import com.intercom.web.smtcollector.client.response.SmtPage;
import com.intercom.web.smtcollector.client.response.SmtPageable;
import com.intercom.web.smtcollector.client.response.SmtVariantsPagedResponse;
import com.intercom.web.smtcollector.domain.asset.SmtVariantGenericImageAsset;
import com.intercom.web.smtcollector.domain.brand.SmtBrand;
import com.intercom.web.smtcollector.domain.brand.SmtBrandFilter;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandType;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandTypeCode;
import com.intercom.web.smtcollector.domain.brandtype.SmtBrandTypeFilter;
import com.intercom.web.smtcollector.domain.group.SmtGroup;
import com.intercom.web.smtcollector.domain.group.SmtGroupFilter;
import com.intercom.web.smtcollector.domain.variant.SmtVariant;
import com.intercom.web.smtcollector.domain.variant.SmtVariantFilter;
import com.intercom.web.smtcollector.domain.variant.SmtVariantGtin;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextIngredient;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmtCollectorClientTest {

	private SmtCollectorClient client;
	private static final String URL = "http://smtcollector.interlaced.it/api";
	private static final String USERNAME = "SMT-USERNAME";
	private static final String PASSWORD = "SMT-PASSWORD";
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public SmtCollectorClientTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
		client = new SmtCollectorClient(URL, USERNAME, PASSWORD);
	}

	@After
	public void tearDown() {
	}

	@Test
	public void testGetGroups() throws SmtDetailedErrorResponse {
		SmtPageable pageable = new SmtPageable(0, 50, "name,desc");
		SmtGroupFilter filter = new SmtGroupFilter();
		SmtGroupsPagedResponse groupsPagedResponse;
		groupsPagedResponse = client.getGroups(pageable, filter);
		for(Map.Entry<String, SmtLink> linkEntry : groupsPagedResponse.getLinks().entrySet()) {
			String key = linkEntry.getKey();
			SmtLink link = linkEntry.getValue();
			logger.info(key + ": " + link.getHref() + " (" + link.isTemplated() + ")");
		}
		for(SmtGroup group : groupsPagedResponse.getContent()) {
			logger.info(group.getCode().toString() + ": " + group.getName());
		}
		SmtPage page = groupsPagedResponse.getPage();
		logger.info("size: " + page.getSize() + ", totalElements: " + page.getTotalElements() + ", totalPages: " + page.getTotalPages() + ", number: " + page.getNumber());
	}

	@Test
	public void testGetBrandTypes() throws SmtDetailedErrorResponse {
		SmtPageable pageable = new SmtPageable(0, 50, "name,desc");
		SmtBrandTypeFilter filter = new SmtBrandTypeFilter();
		filter.setCode(SmtBrandTypeCode.valueOf("2P"));
		SmtBrandTypesPagedResponse brandTypesPagedResponse = client.getBrandTypes(pageable, filter);
		for(Map.Entry<String, SmtLink> linkEntry : brandTypesPagedResponse.getLinks().entrySet()) {
			String key = linkEntry.getKey();
			SmtLink link = linkEntry.getValue();
			logger.info(key + ": " + link.getHref() + " (" + link.isTemplated() + ")");
		}
		for(SmtBrandType brandType : brandTypesPagedResponse.getContent()) {
			logger.info(brandType.getCode().toString() + ": " + brandType.getName());
		}
		SmtPage page = brandTypesPagedResponse.getPage();
		logger.info("size: " + page.getSize() + ", totalElements: " + page.getTotalElements() + ", totalPages: " + page.getTotalPages() + ", number: " + page.getNumber());
	}

	@Test
	public void testGetBrands() throws SmtDetailedErrorResponse {
		SmtPageable pageable = new SmtPageable(0, 50, "name,desc");
		SmtBrandFilter filter = new SmtBrandFilter();
		SmtBrandsPagedResponse brandsPagedResponse = client.getBrands(pageable, filter);
		for(Map.Entry<String, SmtLink> linkEntry : brandsPagedResponse.getLinks().entrySet()) {
			String key = linkEntry.getKey();
			SmtLink link = linkEntry.getValue();
			logger.info(key + ": " + link.getHref() + " (" + link.isTemplated() + ")");
		}
		for(SmtBrand brand : brandsPagedResponse.getContent()) {
			logger.info(brand.getCode().toString() + ": " + brand.getName());
		}
		SmtPage page = brandsPagedResponse.getPage();
		logger.info("size: " + page.getSize() + ", totalElements: " + page.getTotalElements() + ", totalPages: " + page.getTotalPages() + ", number: " + page.getNumber());
	}

	@Test
	public void testGetVariants() throws SmtDetailedErrorResponse {
		SmtPageable pageable = new SmtPageable();
		SmtVariantFilter filter = new SmtVariantFilter();
		Set<SmtVariantGtin> gtins = new LinkedHashSet<SmtVariantGtin>();
		gtins.add(SmtVariantGtin.valueOf("0000000000110"));
		filter.setGtins(gtins);
		filter.setLastModifiedDateGreaterThanOrEqualTo(DateUtils.addDays(DateUtils.truncate(new Date(), Calendar.DATE), -7));
		SmtVariantsPagedResponse variantsPagedResponse = client.getVariants(pageable, filter);
		for(Map.Entry<String, SmtLink> linkEntry : variantsPagedResponse.getLinks().entrySet()) {
			String key = linkEntry.getKey();
			SmtLink link = linkEntry.getValue();
			logger.info(key + ": " + link.getHref() + " (" + link.isTemplated() + ")");
		}
		for(SmtVariant variant : variantsPagedResponse.getContent()) {
			logger.info(variant.getGtin().toString() + ": " + variant.getDescription());
			logger.info(variant.getProduct().getCode() + ": " + variant.getProduct().getCompactDescription());
			List<SmtVariantLongTextIngredient> ingredients = variant.getIngredients();
			logger.info("Total ingredients: " + ingredients.size());
			for(SmtVariantLongTextIngredient ingredient : ingredients) {
				logger.info("Ingredient: " + ingredient.getValue());
			}
			List<SmtVariantGenericImageAsset> genericImageAssets = variant.getGenericImageAssets();
			logger.info("Total generic image assets: " + genericImageAssets.size());
			for(SmtVariantGenericImageAsset genericImageAsset : genericImageAssets) {
				logger.info("Generic image asset custom URL: " + genericImageAsset.getPreviewUrl(100, 100));
			}
		}
		SmtPage page = variantsPagedResponse.getPage();
		logger.info("size: " + page.getSize() + ", totalElements: " + page.getTotalElements() + ", totalPages: " + page.getTotalPages() + ", number: " + page.getNumber());
	}

}
