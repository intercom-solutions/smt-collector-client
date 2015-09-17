package com.intercom.web.smtcollector.domain.variant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.intercom.web.smtcollector.domain.SmtAuditableEntity;
import com.intercom.web.smtcollector.domain.asset.SmtAssetName;
import com.intercom.web.smtcollector.domain.asset.SmtVariantGenericImageAsset;
import com.intercom.web.smtcollector.domain.asset.SmtVariantThirdPartyLogoImageAsset;
import com.intercom.web.smtcollector.domain.product.SmtProduct;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextAdditivesOtherText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextAlcoholByVolumeOtherText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextAlcoholUnitsOtherText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextAllergyOtherText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextBoxContent;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextBrand;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextCompanyName;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextEmailHelpline;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextFaxNumber;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextFeature;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextFreeTextUnit;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextHealthClaim;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextIngredient;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextLatinNameOfFish;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextLifestyleOtherText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextNutritionalClaim;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextPackSize;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextPlaceOfBirth;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextPlaceOfRearing;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextPlaceOfSlaughter;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextRecyclingOtherText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextTelephoneHelpline;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextThirdPartyLogoOtherText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextUnitType;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextUsageOtherText;
import com.intercom.web.smtcollector.domain.variant.longtext.SmtVariantLongTextWebAddress;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoBrandMarketing;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoCompanyAddress;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoDistributorAddress;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoFurtherDescription;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoImporterAddress;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoManufacturerMarketing;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoManufacturersAddress;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoNappySizeOtherText;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoOtherInformation;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoPreparationAndUsage;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoProductMarketing;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoRecipes;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoRegulatedProductName;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoReturnTo;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoSafetyWarning;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoStorage;
import com.intercom.web.smtcollector.domain.variant.memo.SmtVariantMemoTrademarkInformation;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookup;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupAdditionalCategory;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupAdditive;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupAlcoholType;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupAllergyAdvice;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupBulbSpecifications;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupCalculatedNutritionOrdering;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupClpRegulation;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupCountry;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupDefinedArea;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupEggSize;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupManufacturerBrand;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupNappyIndexedSize;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupNewProductDevelopment;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupPackType;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupPetType;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupProductComposition;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupProductLanguage;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupRecommendedStorage;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupRecommendedStorageEndText;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupRecyclingInfo;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupRegionOfOrigin;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupSpecificUnit;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupStandardisedBrand;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupStorageType;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupTypeOfClosure;
import com.intercom.web.smtcollector.domain.variant.namelookup.SmtVariantNameLookupWineColour;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameText;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextBarcodeVerificationDatum;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextBreakPack;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextCase;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextDescriptionBreakdown;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextDimension;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextGeneralAlcoholDatum;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextLampAndBulbSpecification;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextMultilingualDescription;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextNappySize;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextNumberOfUnits;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextNumericSize;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextNutStatement;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextOrigin;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextPallet;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextPharmacy;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextShelfReadyPack;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextStorageCondition;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextSubBrand;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextUnitMerchandising;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextWeight;
import com.intercom.web.smtcollector.domain.variant.nametext.SmtVariantNameTextWineAlcoholDatum;
import com.intercom.web.smtcollector.domain.variant.nametextlookup.SmtVariantNameTextLookup;
import com.intercom.web.smtcollector.domain.variant.nametextlookup.SmtVariantNameTextLookupCookingGuideline;
import com.intercom.web.smtcollector.domain.variant.nametextlookup.SmtVariantNameTextLookupDurabiltyAfterOpening;
import com.intercom.web.smtcollector.domain.variant.nametextlookup.SmtVariantNameTextLookupLowerAgeLimit;
import com.intercom.web.smtcollector.domain.variant.nametextlookup.SmtVariantNameTextLookupUpperAgeLimit;
import com.intercom.web.smtcollector.domain.variant.nametextlookup.SmtVariantNameTextLookupUsageCount;
import com.intercom.web.smtcollector.domain.variant.nutrition.SmtVariantNumericNutrition;
import com.intercom.web.smtcollector.domain.variant.nutrition.SmtVariantTextualNutrition;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatement;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementAiseWarning;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementAllergenTagFormat;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementAverageMeasure;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementLanguageOnPack;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementLifestyle;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementPromotionalPackType;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementRecyclingScheme;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementStorageAndUsage;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementThirdPartyLogo;
import com.intercom.web.smtcollector.domain.variant.statement.SmtVariantStatementWineEffervescence;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.Validate;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JacksonXmlRootElement(localName = "variant")
@JsonPropertyOrder({
	"gtin",
	"product",
	"description",
	"thirdPartyLogos",
	"lifestyles",
	"storageAndUsages",
	"promotionalPackTypes",
	"averageMeasures",
	"wineEffervescences",
	"languagesOnPack",
	"recyclingSchemes",
	"allergenTagFormats",
	"aiseWarnings",
	"allergyAdvices",
	"additives",
	"recyclingInfos",
	"countries",
	"storageTypes",
	"packTypes",
	"standardisedBrands",
	"productLanguages",
	"specificUnits",
	"alcoholTypes",
	"regionsOfOrigin",
	"wineColours",
	"definedAreas",
	"typesOfClosure",
	"recommendedStorages",
	"recommendedStorageEndTexts",
	"manufacturerBrands",
	"nappyIndexedSizes",
	"newProductDevelopments",
	"calculatedNutritionOrderings",
	"productCompositions",
	"petTypes",
	"additionalCategories",
	"bulbsSpecifications",
	"clpRegulations",
	"eggSizes",
	"nappySizes",
	"nutStatements",
	"dimensions",
	"storageConditions",
	"pharmacies",
	"weights",
	"multilingualDescriptions",
	"numbersOfUnits",
	"numericSizes",
	"generalAlcoholData",
	"wineAlcoholData",
	"barcodeVerificationData",
	"shelfReadyPacks",
	"breakPacks",
	"cases",
	"unitMerchandisings",
	"pallets",
	"lampAndBulbSpecifications",
	"origins",
	"subBrands",
	"descriptionBreakdowns",
	"otherInformation",
	"manufacturersAddress",
	"preparationAndUsage",
	"storage",
	"furtherDescription",
	"returnTo",
	"productMarketing",
	"brandMarketing",
	"manufacturerMarketing",
	"safetyWarning",
	"recipes",
	"importerAddress",
	"distributorAddress",
	"regulatedProductName",
	"nappySizeOtherText",
	"companyAddress",
	"trademarkInformation",
	"allergyOtherTexts",
	"additivesOtherTexts",
	"lifestyleOtherTexts",
	"brands",
	"features",
	"boxContents",
	"unitTypes",
	"packSizes",
	"freeTextUnits",
	"alcoholByVolumeOtherTexts",
	"alcoholUnitsOtherTexts",
	"placesOfBirth",
	"placesOfRearing",
	"placesOfSlaughter",
	"thirdPartyLogoOtherTexts",
	"recyclingOtherTexts",
	"telephoneHelplines",
	"emailHelplines",
	"webAddresses",
	"nutritionalClaims",
	"healthClaims",
	"latinNamesOfFish",
	"companyNames",
	"usageOtherTexts",
	"faxNumbers",
	"ingredients",
	"cookingGuidelines",
	"lowerAgeLimits",
	"upperAgeLimits",
	"usageCounts",
	"durabiltyAfterOpenings",
	"textualNutrition",
	"numericNutrition",
	"genericImageAssets",
	"thirdPartyLogoImageAssets",
	"creationDate",
	"creationUser",
	"lastModifiedDate",
	"lastModifiedUser"})
public class SmtVariant extends SmtAuditableEntity<SmtVariant> {

	private SmtVariantGtin gtin;
	private SmtProduct product;
	private String description;
	private final List<SmtVariantStatement> statements = new ArrayList<SmtVariantStatement>();
	private final List<SmtVariantNameLookup> nameLookups = new ArrayList<SmtVariantNameLookup>();
	private final List<SmtVariantNameText> nameTexts = new ArrayList<SmtVariantNameText>();
	private SmtVariantMemoOtherInformation otherInformation = null;
	private SmtVariantMemoManufacturersAddress manufacturersAddress = null;
	private SmtVariantMemoPreparationAndUsage preparationAndUsage = null;
	private SmtVariantMemoStorage storage = null;
	private SmtVariantMemoFurtherDescription furtherDescription = null;
	private SmtVariantMemoReturnTo returnTo = null;
	private SmtVariantMemoProductMarketing productMarketing = null;
	private SmtVariantMemoBrandMarketing brandMarketing = null;
	private SmtVariantMemoManufacturerMarketing manufacturerMarketing = null;
	private SmtVariantMemoSafetyWarning safetyWarning = null;
	private SmtVariantMemoRecipes recipes = null;
	private SmtVariantMemoImporterAddress importerAddress = null;
	private SmtVariantMemoDistributorAddress distributorAddress = null;
	private SmtVariantMemoRegulatedProductName regulatedProductName = null;
	private SmtVariantMemoNappySizeOtherText nappySizeOtherText = null;
	private SmtVariantMemoCompanyAddress companyAddress = null;
	private SmtVariantMemoTrademarkInformation trademarkInformation = null;
	private final List<SmtVariantLongText> longTexts = new ArrayList<SmtVariantLongText>();
	private final List<SmtVariantNameTextLookup> nameTextLookups = new ArrayList<SmtVariantNameTextLookup>();
	private SmtVariantTextualNutrition textualNutrition;
	private SmtVariantNumericNutrition numericNutrition;
	private List<SmtVariantGenericImageAsset> genericImageAssets = new ArrayList<SmtVariantGenericImageAsset>();
	private List<SmtVariantThirdPartyLogoImageAsset> thirdPartyLogoImageAssets = new ArrayList<SmtVariantThirdPartyLogoImageAsset>();

	protected SmtVariant() {
		super();
	}

	public SmtVariant(SmtVariantGtin gtin, SmtProduct product, String creationUser) {
		super(creationUser);
		Validate.notNull(gtin, "The \"gtin\" parameter can not be null");
		Validate.notNull(product, "The \"product\" parameter can not be null");
		this.gtin = gtin;
		this.product = product;
	}

	public SmtVariantGtin getGtin() {
		return gtin;
	}

	public SmtProduct getProduct() {
		return product;
	}

	public void setProduct(SmtProduct product) {
		this.product = product;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private <SmtVariantStatementT extends SmtVariantStatement> void setStatementsOfClass(List<SmtVariantStatementT> statements, int type) {
		Iterator<SmtVariantStatement> iterator = this.statements.iterator();
		while(iterator.hasNext()) {
			SmtVariantStatement statement = iterator.next();
			if(statement.getType() == type) {
				iterator.remove();
			}
		}
		this.statements.addAll(statements);
	}

	@JacksonXmlElementWrapper(localName = "thirdPartyLogos")
	@JacksonXmlProperty(localName = "thirdPartyLogo")
	public List<SmtVariantStatementThirdPartyLogo> getThirdPartyLogos() {
		List<SmtVariantStatementThirdPartyLogo> results = new ArrayList<SmtVariantStatementThirdPartyLogo>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementThirdPartyLogo.TYPE) {
				results.add(new SmtVariantStatementThirdPartyLogo(statement.getValue()));
			}
		}
		return results;
	}

	public void setThirdPartyLogos(List<SmtVariantStatementThirdPartyLogo> thirdPartyLogos) {
		setStatementsOfClass(thirdPartyLogos, SmtVariantStatementThirdPartyLogo.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "lifestyles")
	@JacksonXmlProperty(localName = "lifestyle")
	public List<SmtVariantStatementLifestyle> getLifestyles() {
		List<SmtVariantStatementLifestyle> results = new ArrayList<SmtVariantStatementLifestyle>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementLifestyle.TYPE) {
				results.add(new SmtVariantStatementLifestyle(statement.getValue()));
			}
		}
		return results;
	}

	public void setLifestyles(List<SmtVariantStatementLifestyle> lifestyles) {
		setStatementsOfClass(lifestyles, SmtVariantStatementLifestyle.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "storageAndUsages")
	@JacksonXmlProperty(localName = "storageAndUsage")
	public List<SmtVariantStatementStorageAndUsage> getStorageAndUsages() {
		List<SmtVariantStatementStorageAndUsage> results = new ArrayList<SmtVariantStatementStorageAndUsage>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementStorageAndUsage.TYPE) {
				results.add(new SmtVariantStatementStorageAndUsage(statement.getValue()));
			}
		}
		return results;
	}

	public void setStorageAndUsages(List<SmtVariantStatementStorageAndUsage> storageAndUsages) {
		setStatementsOfClass(storageAndUsages, SmtVariantStatementStorageAndUsage.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "promotionalPackTypes")
	@JacksonXmlProperty(localName = "promotionalPackType")
	public List<SmtVariantStatementPromotionalPackType> getPromotionalPackTypes() {
		List<SmtVariantStatementPromotionalPackType> results = new ArrayList<SmtVariantStatementPromotionalPackType>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementPromotionalPackType.TYPE) {
				results.add(new SmtVariantStatementPromotionalPackType(statement.getValue()));
			}
		}
		return results;
	}

	public void setPromotionalPackTypes(List<SmtVariantStatementPromotionalPackType> promotionalPackTypes) {
		setStatementsOfClass(promotionalPackTypes, SmtVariantStatementPromotionalPackType.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "averageMeasures")
	@JacksonXmlProperty(localName = "averageMeasure")
	public List<SmtVariantStatementAverageMeasure> getAverageMeasures() {
		List<SmtVariantStatementAverageMeasure> results = new ArrayList<SmtVariantStatementAverageMeasure>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementAverageMeasure.TYPE) {
				results.add(new SmtVariantStatementAverageMeasure(statement.getValue()));
			}
		}
		return results;
	}

	public void setAverageMeasures(List<SmtVariantStatementAverageMeasure> averageMeasures) {
		setStatementsOfClass(averageMeasures, SmtVariantStatementAverageMeasure.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "wineEffervescences")
	@JacksonXmlProperty(localName = "wineEffervescence")
	public List<SmtVariantStatementWineEffervescence> getWineEffervescences() {
		List<SmtVariantStatementWineEffervescence> results = new ArrayList<SmtVariantStatementWineEffervescence>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementWineEffervescence.TYPE) {
				results.add(new SmtVariantStatementWineEffervescence(statement.getValue()));
			}
		}
		return results;
	}

	public void setWineEffervescences(List<SmtVariantStatementWineEffervescence> wineEffervescences) {
		setStatementsOfClass(wineEffervescences, SmtVariantStatementWineEffervescence.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "languagesOnPack")
	@JacksonXmlProperty(localName = "languageOnPack")
	public List<SmtVariantStatementLanguageOnPack> getLanguagesOnPack() {
		List<SmtVariantStatementLanguageOnPack> results = new ArrayList<SmtVariantStatementLanguageOnPack>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementLanguageOnPack.TYPE) {
				results.add(new SmtVariantStatementLanguageOnPack(statement.getValue()));
			}
		}
		return results;
	}

	public void setLanguagesOnPack(List<SmtVariantStatementLanguageOnPack> languagesOnPack) {
		setStatementsOfClass(languagesOnPack, SmtVariantStatementLanguageOnPack.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "recyclingSchemes")
	@JacksonXmlProperty(localName = "recyclingScheme")
	public List<SmtVariantStatementRecyclingScheme> getRecyclingSchemes() {
		List<SmtVariantStatementRecyclingScheme> results = new ArrayList<SmtVariantStatementRecyclingScheme>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementRecyclingScheme.TYPE) {
				results.add(new SmtVariantStatementRecyclingScheme(statement.getValue()));
			}
		}
		return results;
	}

	public void setRecyclingSchemes(List<SmtVariantStatementRecyclingScheme> recyclingSchemes) {
		setStatementsOfClass(recyclingSchemes, SmtVariantStatementRecyclingScheme.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "allergenTagFormats")
	@JacksonXmlProperty(localName = "allergenTagFormat")
	public List<SmtVariantStatementAllergenTagFormat> getAllergenTagFormats() {
		List<SmtVariantStatementAllergenTagFormat> results = new ArrayList<SmtVariantStatementAllergenTagFormat>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementAllergenTagFormat.TYPE) {
				results.add(new SmtVariantStatementAllergenTagFormat(statement.getValue()));
			}
		}
		return results;
	}

	public void setAllergenTagFormats(List<SmtVariantStatementAllergenTagFormat> allergenTagFormats) {
		setStatementsOfClass(allergenTagFormats, SmtVariantStatementAllergenTagFormat.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "aiseWarnings")
	@JacksonXmlProperty(localName = "aiseWarning")
	public List<SmtVariantStatementAiseWarning> getAiseWarnings() {
		List<SmtVariantStatementAiseWarning> results = new ArrayList<SmtVariantStatementAiseWarning>();
		for(SmtVariantStatement statement : statements) {
			if(statement.getType() == SmtVariantStatementAiseWarning.TYPE) {
				results.add(new SmtVariantStatementAiseWarning(statement.getValue()));
			}
		}
		return results;
	}

	public void setAiseWarnings(List<SmtVariantStatementAiseWarning> aiseWarnings) {
		setStatementsOfClass(aiseWarnings, SmtVariantStatementAiseWarning.TYPE);
	}

	private <SmtVariantNameLookupT extends SmtVariantNameLookup> void setNameLookupsOfClass(List<SmtVariantNameLookupT> nameLookups, int type) {
		Iterator<SmtVariantNameLookup> iterator = this.nameLookups.iterator();
		while(iterator.hasNext()) {
			SmtVariantNameLookup nameLookup = iterator.next();
			if(nameLookup.getType() == type) {
				iterator.remove();
			}
		}
		this.nameLookups.addAll(nameLookups);
	}

	@JacksonXmlElementWrapper(localName = "allergyAdvices")
	@JacksonXmlProperty(localName = "allergyAdvice")
	public List<SmtVariantNameLookupAllergyAdvice> getAllergyAdvices() {
		List<SmtVariantNameLookupAllergyAdvice> results = new ArrayList<SmtVariantNameLookupAllergyAdvice>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupAllergyAdvice.TYPE) {
				results.add(new SmtVariantNameLookupAllergyAdvice(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setAllergyAdvices(List<SmtVariantNameLookupAllergyAdvice> allergyAdvices) {
		setNameLookupsOfClass(allergyAdvices, SmtVariantNameLookupAllergyAdvice.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "additives")
	@JacksonXmlProperty(localName = "additive")
	public List<SmtVariantNameLookupAdditive> getAdditives() {
		List<SmtVariantNameLookupAdditive> results = new ArrayList<SmtVariantNameLookupAdditive>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupAdditive.TYPE) {
				results.add(new SmtVariantNameLookupAdditive(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setAdditives(List<SmtVariantNameLookupAdditive> additives) {
		setNameLookupsOfClass(additives, SmtVariantNameLookupAdditive.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "recyclingInfos")
	@JacksonXmlProperty(localName = "recyclingInfo")
	public List<SmtVariantNameLookupRecyclingInfo> getRecyclingInfos() {
		List<SmtVariantNameLookupRecyclingInfo> results = new ArrayList<SmtVariantNameLookupRecyclingInfo>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupRecyclingInfo.TYPE) {
				results.add(new SmtVariantNameLookupRecyclingInfo(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setRecyclingInfos(List<SmtVariantNameLookupRecyclingInfo> recyclingInfos) {
		setNameLookupsOfClass(recyclingInfos, SmtVariantNameLookupRecyclingInfo.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "countries")
	@JacksonXmlProperty(localName = "country")
	public List<SmtVariantNameLookupCountry> getCountries() {
		List<SmtVariantNameLookupCountry> results = new ArrayList<SmtVariantNameLookupCountry>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupCountry.TYPE) {
				results.add(new SmtVariantNameLookupCountry(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setCountries(List<SmtVariantNameLookupCountry> countries) {
		setNameLookupsOfClass(countries, SmtVariantNameLookupCountry.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "storageTypes")
	@JacksonXmlProperty(localName = "storageType")
	public List<SmtVariantNameLookupStorageType> getStorageTypes() {
		List<SmtVariantNameLookupStorageType> results = new ArrayList<SmtVariantNameLookupStorageType>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupStorageType.TYPE) {
				results.add(new SmtVariantNameLookupStorageType(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setStorageTypes(List<SmtVariantNameLookupStorageType> storageTypes) {
		setNameLookupsOfClass(storageTypes, SmtVariantNameLookupStorageType.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "packTypes")
	@JacksonXmlProperty(localName = "packType")
	public List<SmtVariantNameLookupPackType> getPackTypes() {
		List<SmtVariantNameLookupPackType> results = new ArrayList<SmtVariantNameLookupPackType>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupPackType.TYPE) {
				results.add(new SmtVariantNameLookupPackType(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setPackTypes(List<SmtVariantNameLookupPackType> packTypes) {
		setNameLookupsOfClass(packTypes, SmtVariantNameLookupPackType.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "standardisedBrands")
	@JacksonXmlProperty(localName = "standardisedBrand")
	public List<SmtVariantNameLookupStandardisedBrand> getStandardisedBrands() {
		List<SmtVariantNameLookupStandardisedBrand> results = new ArrayList<SmtVariantNameLookupStandardisedBrand>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupStandardisedBrand.TYPE) {
				results.add(new SmtVariantNameLookupStandardisedBrand(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setStandardisedBrands(List<SmtVariantNameLookupStandardisedBrand> standardisedBrands) {
		setNameLookupsOfClass(standardisedBrands, SmtVariantNameLookupStandardisedBrand.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "productLanguages")
	@JacksonXmlProperty(localName = "productLanguage")
	public List<SmtVariantNameLookupProductLanguage> getProductLanguages() {
		List<SmtVariantNameLookupProductLanguage> results = new ArrayList<SmtVariantNameLookupProductLanguage>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupProductLanguage.TYPE) {
				results.add(new SmtVariantNameLookupProductLanguage(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setProductLanguages(List<SmtVariantNameLookupProductLanguage> productLanguages) {
		setNameLookupsOfClass(productLanguages, SmtVariantNameLookupProductLanguage.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "specificUnits")
	@JacksonXmlProperty(localName = "specificUnit")
	public List<SmtVariantNameLookupSpecificUnit> getSpecificUnits() {
		List<SmtVariantNameLookupSpecificUnit> results = new ArrayList<SmtVariantNameLookupSpecificUnit>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupSpecificUnit.TYPE) {
				results.add(new SmtVariantNameLookupSpecificUnit(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setSpecificUnits(List<SmtVariantNameLookupSpecificUnit> specificUnits) {
		setNameLookupsOfClass(specificUnits, SmtVariantNameLookupSpecificUnit.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "alcoholTypes")
	@JacksonXmlProperty(localName = "alcoholType")
	public List<SmtVariantNameLookupAlcoholType> getAlcoholTypes() {
		List<SmtVariantNameLookupAlcoholType> results = new ArrayList<SmtVariantNameLookupAlcoholType>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupAlcoholType.TYPE) {
				results.add(new SmtVariantNameLookupAlcoholType(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setAlcoholTypes(List<SmtVariantNameLookupAlcoholType> alcoholTypes) {
		setNameLookupsOfClass(alcoholTypes, SmtVariantNameLookupAlcoholType.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "regionsOfOrigin")
	@JacksonXmlProperty(localName = "regionOfOrigin")
	public List<SmtVariantNameLookupRegionOfOrigin> getRegionsOfOrigin() {
		List<SmtVariantNameLookupRegionOfOrigin> results = new ArrayList<SmtVariantNameLookupRegionOfOrigin>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupRegionOfOrigin.TYPE) {
				results.add(new SmtVariantNameLookupRegionOfOrigin(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setRegionsOfOrigin(List<SmtVariantNameLookupRegionOfOrigin> regionsOfOrigin) {
		setNameLookupsOfClass(regionsOfOrigin, SmtVariantNameLookupRegionOfOrigin.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "wineColours")
	@JacksonXmlProperty(localName = "wineColour")
	public List<SmtVariantNameLookupWineColour> getWineColours() {
		List<SmtVariantNameLookupWineColour> results = new ArrayList<SmtVariantNameLookupWineColour>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupWineColour.TYPE) {
				results.add(new SmtVariantNameLookupWineColour(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setWineColours(List<SmtVariantNameLookupWineColour> wineColours) {
		setNameLookupsOfClass(wineColours, SmtVariantNameLookupWineColour.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "definedAreas")
	@JacksonXmlProperty(localName = "definedArea")
	public List<SmtVariantNameLookupDefinedArea> getDefinedAreas() {
		List<SmtVariantNameLookupDefinedArea> results = new ArrayList<SmtVariantNameLookupDefinedArea>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupDefinedArea.TYPE) {
				results.add(new SmtVariantNameLookupDefinedArea(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setDefinedAreas(List<SmtVariantNameLookupDefinedArea> definedAreas) {
		setNameLookupsOfClass(definedAreas, SmtVariantNameLookupDefinedArea.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "typesOfClosure")
	@JacksonXmlProperty(localName = "typeOfClosure")
	public List<SmtVariantNameLookupTypeOfClosure> getTypesOfClosure() {
		List<SmtVariantNameLookupTypeOfClosure> results = new ArrayList<SmtVariantNameLookupTypeOfClosure>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupTypeOfClosure.TYPE) {
				results.add(new SmtVariantNameLookupTypeOfClosure(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setTypesOfClosure(List<SmtVariantNameLookupTypeOfClosure> typesOfClosure) {
		setNameLookupsOfClass(typesOfClosure, SmtVariantNameLookupTypeOfClosure.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "recommendedStorages")
	@JacksonXmlProperty(localName = "recommendedStorage")
	public List<SmtVariantNameLookupRecommendedStorage> getRecommendedStorages() {
		List<SmtVariantNameLookupRecommendedStorage> results = new ArrayList<SmtVariantNameLookupRecommendedStorage>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupRecommendedStorage.TYPE) {
				results.add(new SmtVariantNameLookupRecommendedStorage(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setRecommendedStorages(List<SmtVariantNameLookupRecommendedStorage> recommendedStorages) {
		setNameLookupsOfClass(recommendedStorages, SmtVariantNameLookupRecommendedStorage.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "recommendedStorageEndTexts")
	@JacksonXmlProperty(localName = "recommendedStorageEndText")
	public List<SmtVariantNameLookupRecommendedStorageEndText> getRecommendedStorageEndTexts() {
		List<SmtVariantNameLookupRecommendedStorageEndText> results = new ArrayList<SmtVariantNameLookupRecommendedStorageEndText>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupRecommendedStorageEndText.TYPE) {
				results.add(new SmtVariantNameLookupRecommendedStorageEndText(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setRecommendedStorageEndTexts(List<SmtVariantNameLookupRecommendedStorageEndText> recommendedStorageEndTexts) {
		setNameLookupsOfClass(recommendedStorageEndTexts, SmtVariantNameLookupRecommendedStorageEndText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "manufacturerBrands")
	@JacksonXmlProperty(localName = "manufacturerBrand")
	public List<SmtVariantNameLookupManufacturerBrand> getManufacturerBrands() {
		List<SmtVariantNameLookupManufacturerBrand> results = new ArrayList<SmtVariantNameLookupManufacturerBrand>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupManufacturerBrand.TYPE) {
				results.add(new SmtVariantNameLookupManufacturerBrand(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setManufacturerBrands(List<SmtVariantNameLookupManufacturerBrand> manufacturerBrands) {
		setNameLookupsOfClass(manufacturerBrands, SmtVariantNameLookupManufacturerBrand.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "nappyIndexedSizes")
	@JacksonXmlProperty(localName = "nappyIndexedSize")
	public List<SmtVariantNameLookupNappyIndexedSize> getNappyIndexedSizes() {
		List<SmtVariantNameLookupNappyIndexedSize> results = new ArrayList<SmtVariantNameLookupNappyIndexedSize>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupNappyIndexedSize.TYPE) {
				results.add(new SmtVariantNameLookupNappyIndexedSize(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setNappyIndexedSizes(List<SmtVariantNameLookupNappyIndexedSize> nappyIndexedSizes) {
		setNameLookupsOfClass(nappyIndexedSizes, SmtVariantNameLookupNappyIndexedSize.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "newProductDevelopments")
	@JacksonXmlProperty(localName = "newProductDevelopment")
	public List<SmtVariantNameLookupNewProductDevelopment> getNewProductDevelopments() {
		List<SmtVariantNameLookupNewProductDevelopment> results = new ArrayList<SmtVariantNameLookupNewProductDevelopment>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupNewProductDevelopment.TYPE) {
				results.add(new SmtVariantNameLookupNewProductDevelopment(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setNewProductDevelopments(List<SmtVariantNameLookupNewProductDevelopment> newProductDevelopments) {
		setNameLookupsOfClass(newProductDevelopments, SmtVariantNameLookupNewProductDevelopment.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "calculatedNutritionOrderings")
	@JacksonXmlProperty(localName = "calculatedNutritionOrdering")
	public List<SmtVariantNameLookupCalculatedNutritionOrdering> getCalculatedNutritionOrderings() {
		List<SmtVariantNameLookupCalculatedNutritionOrdering> results = new ArrayList<SmtVariantNameLookupCalculatedNutritionOrdering>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupCalculatedNutritionOrdering.TYPE) {
				results.add(new SmtVariantNameLookupCalculatedNutritionOrdering(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setCalculatedNutritionOrderings(List<SmtVariantNameLookupCalculatedNutritionOrdering> calculatedNutritionOrderings) {
		setNameLookupsOfClass(calculatedNutritionOrderings, SmtVariantNameLookupCalculatedNutritionOrdering.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "productCompositions")
	@JacksonXmlProperty(localName = "productComposition")
	public List<SmtVariantNameLookupProductComposition> getProductCompositions() {
		List<SmtVariantNameLookupProductComposition> results = new ArrayList<SmtVariantNameLookupProductComposition>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupProductComposition.TYPE) {
				results.add(new SmtVariantNameLookupProductComposition(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setProductCompositions(List<SmtVariantNameLookupProductComposition> productCompositions) {
		setNameLookupsOfClass(productCompositions, SmtVariantNameLookupProductComposition.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "petTypes")
	@JacksonXmlProperty(localName = "petType")
	public List<SmtVariantNameLookupPetType> getPetTypes() {
		List<SmtVariantNameLookupPetType> results = new ArrayList<SmtVariantNameLookupPetType>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupPetType.TYPE) {
				results.add(new SmtVariantNameLookupPetType(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setPetTypes(List<SmtVariantNameLookupPetType> petTypes) {
		setNameLookupsOfClass(petTypes, SmtVariantNameLookupPetType.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "additionalCategories")
	@JacksonXmlProperty(localName = "additionalCategory")
	public List<SmtVariantNameLookupAdditionalCategory> getAdditionalCategories() {
		List<SmtVariantNameLookupAdditionalCategory> results = new ArrayList<SmtVariantNameLookupAdditionalCategory>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupAdditionalCategory.TYPE) {
				results.add(new SmtVariantNameLookupAdditionalCategory(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setAdditionalCategories(List<SmtVariantNameLookupAdditionalCategory> additionalCategories) {
		setNameLookupsOfClass(additionalCategories, SmtVariantNameLookupAdditionalCategory.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "bulbsSpecifications")
	@JacksonXmlProperty(localName = "bulbsSpecification")
	public List<SmtVariantNameLookupBulbSpecifications> getBulbsSpecifications() {
		List<SmtVariantNameLookupBulbSpecifications> results = new ArrayList<SmtVariantNameLookupBulbSpecifications>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupBulbSpecifications.TYPE) {
				results.add(new SmtVariantNameLookupBulbSpecifications(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setBulbsSpecifications(List<SmtVariantNameLookupBulbSpecifications> bulbsSpecifications) {
		setNameLookupsOfClass(bulbsSpecifications, SmtVariantNameLookupBulbSpecifications.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "clpRegulations")
	@JacksonXmlProperty(localName = "clpRegulation")
	public List<SmtVariantNameLookupClpRegulation> getClpRegulations() {
		List<SmtVariantNameLookupClpRegulation> results = new ArrayList<SmtVariantNameLookupClpRegulation>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupClpRegulation.TYPE) {
				results.add(new SmtVariantNameLookupClpRegulation(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setClpRegulations(List<SmtVariantNameLookupClpRegulation> clpRegulations) {
		setNameLookupsOfClass(clpRegulations, SmtVariantNameLookupClpRegulation.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "eggSizes")
	@JacksonXmlProperty(localName = "eggSize")
	public List<SmtVariantNameLookupEggSize> getEggSizes() {
		List<SmtVariantNameLookupEggSize> results = new ArrayList<SmtVariantNameLookupEggSize>();
		for(SmtVariantNameLookup nameLookup : nameLookups) {
			if(nameLookup.getType() == SmtVariantNameLookupEggSize.TYPE) {
				results.add(new SmtVariantNameLookupEggSize(nameLookup.getName(), nameLookup.getValue()));
			}
		}
		return results;
	}

	public void setEggSizes(List<SmtVariantNameLookupEggSize> eggSizes) {
		setNameLookupsOfClass(eggSizes, SmtVariantNameLookupEggSize.TYPE);
	}

	private <SmtVariantNameTextT extends SmtVariantNameText> void setNameTextsOfClass(List<SmtVariantNameTextT> nameTexts, int type) {
		Iterator<SmtVariantNameText> iterator = this.nameTexts.iterator();
		while(iterator.hasNext()) {
			SmtVariantNameText nameText = iterator.next();
			if(nameText.getType() == type) {
				iterator.remove();
			}
		}
		this.nameTexts.addAll(nameTexts);
	}

	@JacksonXmlElementWrapper(localName = "nappySizes")
	@JacksonXmlProperty(localName = "nappySize")
	public List<SmtVariantNameTextNappySize> getNappySizes() {
		List<SmtVariantNameTextNappySize> results = new ArrayList<SmtVariantNameTextNappySize>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextNappySize.TYPE) {
				results.add(new SmtVariantNameTextNappySize(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setNappySizes(List<SmtVariantNameTextNappySize> nappySizes) {
		setNameTextsOfClass(nappySizes, SmtVariantNameTextNappySize.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "nutStatements")
	@JacksonXmlProperty(localName = "nutStatement")
	public List<SmtVariantNameTextNutStatement> getNutStatements() {
		List<SmtVariantNameTextNutStatement> results = new ArrayList<SmtVariantNameTextNutStatement>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextNutStatement.TYPE) {
				results.add(new SmtVariantNameTextNutStatement(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setNutStatements(List<SmtVariantNameTextNutStatement> nutStatements) {
		setNameTextsOfClass(nutStatements, SmtVariantNameTextNutStatement.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "dimensions")
	@JacksonXmlProperty(localName = "dimension")
	public List<SmtVariantNameTextDimension> getDimensions() {
		List<SmtVariantNameTextDimension> results = new ArrayList<SmtVariantNameTextDimension>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextDimension.TYPE) {
				results.add(new SmtVariantNameTextDimension(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setDimensions(List<SmtVariantNameTextDimension> dimensions) {
		setNameTextsOfClass(dimensions, SmtVariantNameTextDimension.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "storageConditions")
	@JacksonXmlProperty(localName = "storageCondition")
	public List<SmtVariantNameTextStorageCondition> getStorageConditions() {
		List<SmtVariantNameTextStorageCondition> results = new ArrayList<SmtVariantNameTextStorageCondition>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextStorageCondition.TYPE) {
				results.add(new SmtVariantNameTextStorageCondition(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setStorageConditions(List<SmtVariantNameTextStorageCondition> storageConditions) {
		setNameTextsOfClass(storageConditions, SmtVariantNameTextStorageCondition.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "pharmacies")
	@JacksonXmlProperty(localName = "pharmacy")
	public List<SmtVariantNameTextPharmacy> getPharmacies() {
		List<SmtVariantNameTextPharmacy> results = new ArrayList<SmtVariantNameTextPharmacy>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextPharmacy.TYPE) {
				results.add(new SmtVariantNameTextPharmacy(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setPharmacies(List<SmtVariantNameTextPharmacy> pharmacies) {
		setNameTextsOfClass(pharmacies, SmtVariantNameTextPharmacy.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "weights")
	@JacksonXmlProperty(localName = "weight")
	public List<SmtVariantNameTextWeight> getWeights() {
		List<SmtVariantNameTextWeight> results = new ArrayList<SmtVariantNameTextWeight>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextWeight.TYPE) {
				results.add(new SmtVariantNameTextWeight(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setWeights(List<SmtVariantNameTextWeight> weights) {
		setNameTextsOfClass(weights, SmtVariantNameTextWeight.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "multilingualDescriptions")
	@JacksonXmlProperty(localName = "multilingualDescription")
	public List<SmtVariantNameTextMultilingualDescription> getMultilingualDescriptions() {
		List<SmtVariantNameTextMultilingualDescription> results = new ArrayList<SmtVariantNameTextMultilingualDescription>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextMultilingualDescription.TYPE) {
				results.add(new SmtVariantNameTextMultilingualDescription(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setMultilingualDescriptions(List<SmtVariantNameTextMultilingualDescription> multilingualDescriptions) {
		setNameTextsOfClass(multilingualDescriptions, SmtVariantNameTextMultilingualDescription.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "numbersOfUnits")
	@JacksonXmlProperty(localName = "numbersOfUnit")
	public List<SmtVariantNameTextNumberOfUnits> getNumbersOfUnits() {
		List<SmtVariantNameTextNumberOfUnits> results = new ArrayList<SmtVariantNameTextNumberOfUnits>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextNumberOfUnits.TYPE) {
				results.add(new SmtVariantNameTextNumberOfUnits(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setNumbersOfUnits(List<SmtVariantNameTextNumberOfUnits> numbersOfUnits) {
		setNameTextsOfClass(numbersOfUnits, SmtVariantNameTextNumberOfUnits.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "numericSizes")
	@JacksonXmlProperty(localName = "numericSize")
	public List<SmtVariantNameTextNumericSize> getNumericSizes() {
		List<SmtVariantNameTextNumericSize> results = new ArrayList<SmtVariantNameTextNumericSize>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextNumericSize.TYPE) {
				results.add(new SmtVariantNameTextNumericSize(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setNumericSizes(List<SmtVariantNameTextNumericSize> numericSizes) {
		setNameTextsOfClass(numericSizes, SmtVariantNameTextNumericSize.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "generalAlcoholData")
	@JacksonXmlProperty(localName = "generalAlcoholDatum")
	public List<SmtVariantNameTextGeneralAlcoholDatum> getGeneralAlcoholData() {
		List<SmtVariantNameTextGeneralAlcoholDatum> results = new ArrayList<SmtVariantNameTextGeneralAlcoholDatum>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextGeneralAlcoholDatum.TYPE) {
				results.add(new SmtVariantNameTextGeneralAlcoholDatum(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setGeneralAlcoholData(List<SmtVariantNameTextGeneralAlcoholDatum> generalAlcoholData) {
		setNameTextsOfClass(generalAlcoholData, SmtVariantNameTextGeneralAlcoholDatum.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "wineAlcoholData")
	@JacksonXmlProperty(localName = "wineAlcoholDatum")
	public List<SmtVariantNameTextWineAlcoholDatum> getWineAlcoholData() {
		List<SmtVariantNameTextWineAlcoholDatum> results = new ArrayList<SmtVariantNameTextWineAlcoholDatum>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextWineAlcoholDatum.TYPE) {
				results.add(new SmtVariantNameTextWineAlcoholDatum(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setWineAlcoholData(List<SmtVariantNameTextWineAlcoholDatum> wineAlcoholData) {
		setNameTextsOfClass(wineAlcoholData, SmtVariantNameTextWineAlcoholDatum.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "barcodeVerificationData")
	@JacksonXmlProperty(localName = "barcodeVerificationDatum")
	public List<SmtVariantNameTextBarcodeVerificationDatum> getBarcodeVerificationData() {
		List<SmtVariantNameTextBarcodeVerificationDatum> results = new ArrayList<SmtVariantNameTextBarcodeVerificationDatum>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextBarcodeVerificationDatum.TYPE) {
				results.add(new SmtVariantNameTextBarcodeVerificationDatum(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setBarcodeVerificationData(List<SmtVariantNameTextBarcodeVerificationDatum> barcodeVerificationData) {
		setNameTextsOfClass(barcodeVerificationData, SmtVariantNameTextBarcodeVerificationDatum.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "shelfReadyPacks")
	@JacksonXmlProperty(localName = "shelfReadyPack")
	public List<SmtVariantNameTextShelfReadyPack> getShelfReadyPacks() {
		List<SmtVariantNameTextShelfReadyPack> results = new ArrayList<SmtVariantNameTextShelfReadyPack>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextShelfReadyPack.TYPE) {
				results.add(new SmtVariantNameTextShelfReadyPack(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setShelfReadyPacks(List<SmtVariantNameTextShelfReadyPack> shelfReadyPacks) {
		setNameTextsOfClass(shelfReadyPacks, SmtVariantNameTextShelfReadyPack.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "breakPacks")
	@JacksonXmlProperty(localName = "breakPack")
	public List<SmtVariantNameTextBreakPack> getBreakPacks() {
		List<SmtVariantNameTextBreakPack> results = new ArrayList<SmtVariantNameTextBreakPack>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextBreakPack.TYPE) {
				results.add(new SmtVariantNameTextBreakPack(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setBreakPacks(List<SmtVariantNameTextBreakPack> breakPacks) {
		setNameTextsOfClass(breakPacks, SmtVariantNameTextBreakPack.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "cases")
	@JacksonXmlProperty(localName = "case")
	public List<SmtVariantNameTextCase> getCases() {
		List<SmtVariantNameTextCase> results = new ArrayList<SmtVariantNameTextCase>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextCase.TYPE) {
				results.add(new SmtVariantNameTextCase(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setCases(List<SmtVariantNameTextCase> cases) {
		setNameTextsOfClass(cases, SmtVariantNameTextCase.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "unitMerchandisings")
	@JacksonXmlProperty(localName = "unitMerchandising")
	public List<SmtVariantNameTextUnitMerchandising> getUnitMerchandisings() {
		List<SmtVariantNameTextUnitMerchandising> results = new ArrayList<SmtVariantNameTextUnitMerchandising>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextUnitMerchandising.TYPE) {
				results.add(new SmtVariantNameTextUnitMerchandising(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setUnitMerchandisings(List<SmtVariantNameTextUnitMerchandising> unitMerchandisings) {
		setNameTextsOfClass(unitMerchandisings, SmtVariantNameTextUnitMerchandising.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "pallets")
	@JacksonXmlProperty(localName = "pallet")
	public List<SmtVariantNameTextPallet> getPallets() {
		List<SmtVariantNameTextPallet> results = new ArrayList<SmtVariantNameTextPallet>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextPallet.TYPE) {
				results.add(new SmtVariantNameTextPallet(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setPallets(List<SmtVariantNameTextPallet> pallets) {
		setNameTextsOfClass(pallets, SmtVariantNameTextPallet.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "lampAndBulbSpecifications")
	@JacksonXmlProperty(localName = "lampAndBulbSpecification")
	public List<SmtVariantNameTextLampAndBulbSpecification> getLampAndBulbSpecifications() {
		List<SmtVariantNameTextLampAndBulbSpecification> results = new ArrayList<SmtVariantNameTextLampAndBulbSpecification>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextLampAndBulbSpecification.TYPE) {
				results.add(new SmtVariantNameTextLampAndBulbSpecification(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setLampAndBulbSpecifications(List<SmtVariantNameTextLampAndBulbSpecification> lampAndBulbSpecifications) {
		setNameTextsOfClass(lampAndBulbSpecifications, SmtVariantNameTextLampAndBulbSpecification.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "origins")
	@JacksonXmlProperty(localName = "origin")
	public List<SmtVariantNameTextOrigin> getOrigins() {
		List<SmtVariantNameTextOrigin> results = new ArrayList<SmtVariantNameTextOrigin>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextOrigin.TYPE) {
				results.add(new SmtVariantNameTextOrigin(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setOrigins(List<SmtVariantNameTextOrigin> origins) {
		setNameTextsOfClass(origins, SmtVariantNameTextOrigin.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "subBrands")
	@JacksonXmlProperty(localName = "subBrand")
	public List<SmtVariantNameTextSubBrand> getSubBrands() {
		List<SmtVariantNameTextSubBrand> results = new ArrayList<SmtVariantNameTextSubBrand>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextSubBrand.TYPE) {
				results.add(new SmtVariantNameTextSubBrand(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setSubBrands(List<SmtVariantNameTextSubBrand> subBrands) {
		setNameTextsOfClass(subBrands, SmtVariantNameTextSubBrand.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "descriptionBreakdowns")
	@JacksonXmlProperty(localName = "descriptionBreakdown")
	public List<SmtVariantNameTextDescriptionBreakdown> getDescriptionBreakdowns() {
		List<SmtVariantNameTextDescriptionBreakdown> results = new ArrayList<SmtVariantNameTextDescriptionBreakdown>();
		for(SmtVariantNameText nameText : nameTexts) {
			if(nameText.getType() == SmtVariantNameTextDescriptionBreakdown.TYPE) {
				results.add(new SmtVariantNameTextDescriptionBreakdown(nameText.getName(), nameText.getValue()));
			}
		}
		return results;
	}

	public void setDescriptionBreakdowns(List<SmtVariantNameTextDescriptionBreakdown> descriptionBreakdowns) {
		setNameTextsOfClass(descriptionBreakdowns, SmtVariantNameTextDescriptionBreakdown.TYPE);
	}

	public SmtVariantMemoOtherInformation getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(SmtVariantMemoOtherInformation otherInformation) {
		this.otherInformation = otherInformation;
	}

	public SmtVariantMemoManufacturersAddress getManufacturersAddress() {
		return manufacturersAddress;
	}

	public void setManufacturersAddress(SmtVariantMemoManufacturersAddress manufacturersAddress) {
		this.manufacturersAddress = manufacturersAddress;
	}

	public SmtVariantMemoPreparationAndUsage getPreparationAndUsage() {
		return preparationAndUsage;
	}

	public void setPreparationAndUsage(SmtVariantMemoPreparationAndUsage preparationAndUsage) {
		this.preparationAndUsage = preparationAndUsage;
	}

	public SmtVariantMemoStorage getStorage() {
		return storage;
	}

	public void setStorage(SmtVariantMemoStorage storage) {
		this.storage = storage;
	}

	public SmtVariantMemoFurtherDescription getFurtherDescription() {
		return furtherDescription;
	}

	public void setFurtherDescription(SmtVariantMemoFurtherDescription furtherDescription) {
		this.furtherDescription = furtherDescription;
	}

	public SmtVariantMemoReturnTo getReturnTo() {
		return returnTo;
	}

	public void setReturnTo(SmtVariantMemoReturnTo returnTo) {
		this.returnTo = returnTo;
	}

	public SmtVariantMemoProductMarketing getProductMarketing() {
		return productMarketing;
	}

	public void setProductMarketing(SmtVariantMemoProductMarketing productMarketing) {
		this.productMarketing = productMarketing;
	}

	public SmtVariantMemoBrandMarketing getBrandMarketing() {
		return brandMarketing;
	}

	public void setBrandMarketing(SmtVariantMemoBrandMarketing brandMarketing) {
		this.brandMarketing = brandMarketing;
	}

	public SmtVariantMemoManufacturerMarketing getManufacturerMarketing() {
		return manufacturerMarketing;
	}

	public void setManufacturerMarketing(SmtVariantMemoManufacturerMarketing manufacturerMarketing) {
		this.manufacturerMarketing = manufacturerMarketing;
	}

	public SmtVariantMemoSafetyWarning getSafetyWarning() {
		return safetyWarning;
	}

	public void setSafetyWarning(SmtVariantMemoSafetyWarning safetyWarning) {
		this.safetyWarning = safetyWarning;
	}

	public SmtVariantMemoRecipes getRecipes() {
		return recipes;
	}

	public void setRecipes(SmtVariantMemoRecipes recipes) {
		this.recipes = recipes;
	}

	public SmtVariantMemoImporterAddress getImporterAddress() {
		return importerAddress;
	}

	public void setImporterAddress(SmtVariantMemoImporterAddress importerAddress) {
		this.importerAddress = importerAddress;
	}

	public SmtVariantMemoDistributorAddress getDistributorAddress() {
		return distributorAddress;
	}

	public void setDistributorAddress(SmtVariantMemoDistributorAddress distributorAddress) {
		this.distributorAddress = distributorAddress;
	}

	public SmtVariantMemoRegulatedProductName getRegulatedProductName() {
		return regulatedProductName;
	}

	public void setRegulatedProductName(SmtVariantMemoRegulatedProductName regulatedProductName) {
		this.regulatedProductName = regulatedProductName;
	}

	public SmtVariantMemoNappySizeOtherText getNappySizeOtherText() {
		return nappySizeOtherText;
	}

	public void setNappySizeOtherText(SmtVariantMemoNappySizeOtherText nappySizeOtherText) {
		this.nappySizeOtherText = nappySizeOtherText;
	}

	public SmtVariantMemoCompanyAddress getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(SmtVariantMemoCompanyAddress companyAddress) {
		this.companyAddress = companyAddress;
	}

	public SmtVariantMemoTrademarkInformation getTrademarkInformation() {
		return trademarkInformation;
	}

	public void setTrademarkInformation(SmtVariantMemoTrademarkInformation trademarkInformation) {
		this.trademarkInformation = trademarkInformation;
	}

	private <SmtVariantLongTextT extends SmtVariantLongText> void setLongTextsOfClass(List<SmtVariantLongTextT> longTexts, int type) {
		Iterator<SmtVariantLongText> iterator = this.longTexts.iterator();
		while(iterator.hasNext()) {
			SmtVariantLongText longText = iterator.next();
			if(longText.getType() == type) {
				iterator.remove();
			}
		}
		this.longTexts.addAll(longTexts);
	}

	@JacksonXmlElementWrapper(localName = "allergyOtherTexts")
	@JacksonXmlProperty(localName = "allergyOtherText")
	public List<SmtVariantLongTextAllergyOtherText> getAllergyOtherTexts() {
		List<SmtVariantLongTextAllergyOtherText> results = new ArrayList<SmtVariantLongTextAllergyOtherText>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextAllergyOtherText.TYPE) {
				results.add(new SmtVariantLongTextAllergyOtherText(longText.getValue()));
			}
		}
		return results;
	}

	public void setAllergyOtherTexts(List<SmtVariantLongTextAllergyOtherText> allergyOtherTexts) {
		setLongTextsOfClass(allergyOtherTexts, SmtVariantLongTextAllergyOtherText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "additivesOtherTexts")
	@JacksonXmlProperty(localName = "additivesOtherText")
	public List<SmtVariantLongTextAdditivesOtherText> getAdditivesOtherTexts() {
		List<SmtVariantLongTextAdditivesOtherText> results = new ArrayList<SmtVariantLongTextAdditivesOtherText>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextAdditivesOtherText.TYPE) {
				results.add(new SmtVariantLongTextAdditivesOtherText(longText.getValue()));
			}
		}
		return results;
	}

	public void setAdditivesOtherTexts(List<SmtVariantLongTextAdditivesOtherText> additivesOtherTexts) {
		setLongTextsOfClass(additivesOtherTexts, SmtVariantLongTextAdditivesOtherText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "lifestyleOtherTexts")
	@JacksonXmlProperty(localName = "lifestyleOtherText")
	public List<SmtVariantLongTextLifestyleOtherText> getLifestyleOtherTexts() {
		List<SmtVariantLongTextLifestyleOtherText> results = new ArrayList<SmtVariantLongTextLifestyleOtherText>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextLifestyleOtherText.TYPE) {
				results.add(new SmtVariantLongTextLifestyleOtherText(longText.getValue()));
			}
		}
		return results;
	}

	public void setLifestyleOtherTexts(List<SmtVariantLongTextLifestyleOtherText> lifestyleOtherTexts) {
		setLongTextsOfClass(lifestyleOtherTexts, SmtVariantLongTextLifestyleOtherText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "brands")
	@JacksonXmlProperty(localName = "brand")
	public List<SmtVariantLongTextBrand> getBrands() {
		List<SmtVariantLongTextBrand> results = new ArrayList<SmtVariantLongTextBrand>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextBrand.TYPE) {
				results.add(new SmtVariantLongTextBrand(longText.getValue()));
			}
		}
		return results;
	}

	public void setBrands(List<SmtVariantLongTextBrand> brands) {
		setLongTextsOfClass(brands, SmtVariantLongTextBrand.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "features")
	@JacksonXmlProperty(localName = "feature")
	public List<SmtVariantLongTextFeature> getFeatures() {
		List<SmtVariantLongTextFeature> results = new ArrayList<SmtVariantLongTextFeature>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextFeature.TYPE) {
				results.add(new SmtVariantLongTextFeature(longText.getValue()));
			}
		}
		return results;
	}

	public void setFeatures(List<SmtVariantLongTextFeature> features) {
		setLongTextsOfClass(features, SmtVariantLongTextFeature.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "boxContents")
	@JacksonXmlProperty(localName = "boxContent")
	public List<SmtVariantLongTextBoxContent> getBoxContents() {
		List<SmtVariantLongTextBoxContent> results = new ArrayList<SmtVariantLongTextBoxContent>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextBoxContent.TYPE) {
				results.add(new SmtVariantLongTextBoxContent(longText.getValue()));
			}
		}
		return results;
	}

	public void setBoxContents(List<SmtVariantLongTextBoxContent> boxContents) {
		setLongTextsOfClass(boxContents, SmtVariantLongTextBoxContent.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "unitTypes")
	@JacksonXmlProperty(localName = "unitType")
	public List<SmtVariantLongTextUnitType> getUnitTypes() {
		List<SmtVariantLongTextUnitType> results = new ArrayList<SmtVariantLongTextUnitType>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextUnitType.TYPE) {
				results.add(new SmtVariantLongTextUnitType(longText.getValue()));
			}
		}
		return results;
	}

	public void setUnitTypes(List<SmtVariantLongTextUnitType> unitTypes) {
		setLongTextsOfClass(unitTypes, SmtVariantLongTextUnitType.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "packSizes")
	@JacksonXmlProperty(localName = "packSize")
	public List<SmtVariantLongTextPackSize> getPackSizes() {
		List<SmtVariantLongTextPackSize> results = new ArrayList<SmtVariantLongTextPackSize>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextPackSize.TYPE) {
				results.add(new SmtVariantLongTextPackSize(longText.getValue()));
			}
		}
		return results;
	}

	public void setPackSizes(List<SmtVariantLongTextPackSize> packSizes) {
		setLongTextsOfClass(packSizes, SmtVariantLongTextPackSize.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "freeTextUnits")
	@JacksonXmlProperty(localName = "freeTextUnit")
	public List<SmtVariantLongTextFreeTextUnit> getFreeTextUnits() {
		List<SmtVariantLongTextFreeTextUnit> results = new ArrayList<SmtVariantLongTextFreeTextUnit>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextFreeTextUnit.TYPE) {
				results.add(new SmtVariantLongTextFreeTextUnit(longText.getValue()));
			}
		}
		return results;
	}

	public void setFreeTextUnits(List<SmtVariantLongTextFreeTextUnit> freeTextUnits) {
		setLongTextsOfClass(freeTextUnits, SmtVariantLongTextFreeTextUnit.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "alcoholByVolumeOtherTexts")
	@JacksonXmlProperty(localName = "alcoholByVolumeOtherText")
	public List<SmtVariantLongTextAlcoholByVolumeOtherText> getAlcoholByVolumeOtherTexts() {
		List<SmtVariantLongTextAlcoholByVolumeOtherText> results = new ArrayList<SmtVariantLongTextAlcoholByVolumeOtherText>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextAlcoholByVolumeOtherText.TYPE) {
				results.add(new SmtVariantLongTextAlcoholByVolumeOtherText(longText.getValue()));
			}
		}
		return results;
	}

	public void setAlcoholByVolumeOtherTexts(List<SmtVariantLongTextAlcoholByVolumeOtherText> alcoholByVolumeOtherTexts) {
		setLongTextsOfClass(alcoholByVolumeOtherTexts, SmtVariantLongTextAlcoholByVolumeOtherText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "alcoholUnitsOtherTexts")
	@JacksonXmlProperty(localName = "alcoholUnitsOtherText")
	public List<SmtVariantLongTextAlcoholUnitsOtherText> getAlcoholUnitsOtherTexts() {
		List<SmtVariantLongTextAlcoholUnitsOtherText> results = new ArrayList<SmtVariantLongTextAlcoholUnitsOtherText>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextAlcoholUnitsOtherText.TYPE) {
				results.add(new SmtVariantLongTextAlcoholUnitsOtherText(longText.getValue()));
			}
		}
		return results;
	}

	public void setAlcoholUnitsOtherTexts(List<SmtVariantLongTextAlcoholUnitsOtherText> alcoholUnitsOtherTexts) {
		setLongTextsOfClass(alcoholUnitsOtherTexts, SmtVariantLongTextAlcoholUnitsOtherText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "placesOfBirth")
	@JacksonXmlProperty(localName = "placeOfBirth")
	public List<SmtVariantLongTextPlaceOfBirth> getPlacesOfBirth() {
		List<SmtVariantLongTextPlaceOfBirth> results = new ArrayList<SmtVariantLongTextPlaceOfBirth>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextPlaceOfBirth.TYPE) {
				results.add(new SmtVariantLongTextPlaceOfBirth(longText.getValue()));
			}
		}
		return results;
	}

	public void setPlacesOfBirth(List<SmtVariantLongTextPlaceOfBirth> placesOfBirth) {
		setLongTextsOfClass(placesOfBirth, SmtVariantLongTextPlaceOfBirth.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "placesOfRearing")
	@JacksonXmlProperty(localName = "placeOfRearing")
	public List<SmtVariantLongTextPlaceOfRearing> getPlacesOfRearing() {
		List<SmtVariantLongTextPlaceOfRearing> results = new ArrayList<SmtVariantLongTextPlaceOfRearing>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextPlaceOfRearing.TYPE) {
				results.add(new SmtVariantLongTextPlaceOfRearing(longText.getValue()));
			}
		}
		return results;
	}

	public void setPlacesOfRearing(List<SmtVariantLongTextPlaceOfRearing> placesOfRearing) {
		setLongTextsOfClass(placesOfRearing, SmtVariantLongTextPlaceOfRearing.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "placesOfSlaughter")
	@JacksonXmlProperty(localName = "placeOfSlaughter")
	public List<SmtVariantLongTextPlaceOfSlaughter> getPlacesOfSlaughter() {
		List<SmtVariantLongTextPlaceOfSlaughter> results = new ArrayList<SmtVariantLongTextPlaceOfSlaughter>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextPlaceOfSlaughter.TYPE) {
				results.add(new SmtVariantLongTextPlaceOfSlaughter(longText.getValue()));
			}
		}
		return results;
	}

	public void setPlacesOfSlaughter(List<SmtVariantLongTextPlaceOfSlaughter> placesOfSlaughter) {
		setLongTextsOfClass(placesOfSlaughter, SmtVariantLongTextPlaceOfSlaughter.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "thirdPartyLogoOtherTexts")
	@JacksonXmlProperty(localName = "thirdPartyLogoOtherText")
	public List<SmtVariantLongTextThirdPartyLogoOtherText> getThirdPartyLogoOtherTexts() {
		List<SmtVariantLongTextThirdPartyLogoOtherText> results = new ArrayList<SmtVariantLongTextThirdPartyLogoOtherText>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextThirdPartyLogoOtherText.TYPE) {
				results.add(new SmtVariantLongTextThirdPartyLogoOtherText(longText.getValue()));
			}
		}
		return results;
	}

	public void setThirdPartyLogoOtherTexts(List<SmtVariantLongTextThirdPartyLogoOtherText> thirdPartyLogoOtherTexts) {
		setLongTextsOfClass(thirdPartyLogoOtherTexts, SmtVariantLongTextThirdPartyLogoOtherText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "recyclingOtherTexts")
	@JacksonXmlProperty(localName = "recyclingOtherText")
	public List<SmtVariantLongTextRecyclingOtherText> getRecyclingOtherTexts() {
		List<SmtVariantLongTextRecyclingOtherText> results = new ArrayList<SmtVariantLongTextRecyclingOtherText>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextRecyclingOtherText.TYPE) {
				results.add(new SmtVariantLongTextRecyclingOtherText(longText.getValue()));
			}
		}
		return results;
	}

	public void setRecyclingOtherTexts(List<SmtVariantLongTextRecyclingOtherText> recyclingOtherTexts) {
		setLongTextsOfClass(recyclingOtherTexts, SmtVariantLongTextRecyclingOtherText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "telephoneHelplines")
	@JacksonXmlProperty(localName = "telephoneHelpline")
	public List<SmtVariantLongTextTelephoneHelpline> getTelephoneHelplines() {
		List<SmtVariantLongTextTelephoneHelpline> results = new ArrayList<SmtVariantLongTextTelephoneHelpline>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextTelephoneHelpline.TYPE) {
				results.add(new SmtVariantLongTextTelephoneHelpline(longText.getValue()));
			}
		}
		return results;
	}

	public void setTelephoneHelplines(List<SmtVariantLongTextTelephoneHelpline> telephoneHelplines) {
		setLongTextsOfClass(telephoneHelplines, SmtVariantLongTextTelephoneHelpline.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "emailHelplines")
	@JacksonXmlProperty(localName = "emailHelpline")
	public List<SmtVariantLongTextEmailHelpline> getEmailHelplines() {
		List<SmtVariantLongTextEmailHelpline> results = new ArrayList<SmtVariantLongTextEmailHelpline>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextEmailHelpline.TYPE) {
				results.add(new SmtVariantLongTextEmailHelpline(longText.getValue()));
			}
		}
		return results;
	}

	public void setEmailHelplines(List<SmtVariantLongTextEmailHelpline> emailHelplines) {
		setLongTextsOfClass(emailHelplines, SmtVariantLongTextEmailHelpline.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "webAddresses")
	@JacksonXmlProperty(localName = "webAddress")
	public List<SmtVariantLongTextWebAddress> getWebAddresses() {
		List<SmtVariantLongTextWebAddress> results = new ArrayList<SmtVariantLongTextWebAddress>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextWebAddress.TYPE) {
				results.add(new SmtVariantLongTextWebAddress(longText.getValue()));
			}
		}
		return results;
	}

	public void setWebAddresses(List<SmtVariantLongTextWebAddress> webAddresses) {
		setLongTextsOfClass(webAddresses, SmtVariantLongTextWebAddress.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "nutritionalClaims")
	@JacksonXmlProperty(localName = "nutritionalClaim")
	public List<SmtVariantLongTextNutritionalClaim> getNutritionalClaims() {
		List<SmtVariantLongTextNutritionalClaim> results = new ArrayList<SmtVariantLongTextNutritionalClaim>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextNutritionalClaim.TYPE) {
				results.add(new SmtVariantLongTextNutritionalClaim(longText.getValue()));
			}
		}
		return results;
	}

	public void setNutritionalClaims(List<SmtVariantLongTextNutritionalClaim> nutritionalClaims) {
		setLongTextsOfClass(nutritionalClaims, SmtVariantLongTextNutritionalClaim.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "healthClaims")
	@JacksonXmlProperty(localName = "healthClaim")
	public List<SmtVariantLongTextHealthClaim> getHealthClaims() {
		List<SmtVariantLongTextHealthClaim> results = new ArrayList<SmtVariantLongTextHealthClaim>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextHealthClaim.TYPE) {
				results.add(new SmtVariantLongTextHealthClaim(longText.getValue()));
			}
		}
		return results;
	}

	public void setHealthClaims(List<SmtVariantLongTextHealthClaim> healthClaimses) {
		setLongTextsOfClass(healthClaimses, SmtVariantLongTextHealthClaim.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "latinNamesOfFish")
	@JacksonXmlProperty(localName = "latinNameOfFish")
	public List<SmtVariantLongTextLatinNameOfFish> getLatinNamesOfFish() {
		List<SmtVariantLongTextLatinNameOfFish> results = new ArrayList<SmtVariantLongTextLatinNameOfFish>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextLatinNameOfFish.TYPE) {
				results.add(new SmtVariantLongTextLatinNameOfFish(longText.getValue()));
			}
		}
		return results;
	}

	public void setLatinNamesOfFish(List<SmtVariantLongTextLatinNameOfFish> latinNamesOfFish) {
		setLongTextsOfClass(latinNamesOfFish, SmtVariantLongTextLatinNameOfFish.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "companyNames")
	@JacksonXmlProperty(localName = "companyName")
	public List<SmtVariantLongTextCompanyName> getCompanyNames() {
		List<SmtVariantLongTextCompanyName> results = new ArrayList<SmtVariantLongTextCompanyName>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextCompanyName.TYPE) {
				results.add(new SmtVariantLongTextCompanyName(longText.getValue()));
			}
		}
		return results;
	}

	public void setCompanyNames(List<SmtVariantLongTextCompanyName> companyNames) {
		setLongTextsOfClass(companyNames, SmtVariantLongTextCompanyName.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "usageOtherTexts")
	@JacksonXmlProperty(localName = "usageOtherText")
	public List<SmtVariantLongTextUsageOtherText> getUsageOtherTexts() {
		List<SmtVariantLongTextUsageOtherText> results = new ArrayList<SmtVariantLongTextUsageOtherText>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextUsageOtherText.TYPE) {
				results.add(new SmtVariantLongTextUsageOtherText(longText.getValue()));
			}
		}
		return results;
	}

	public void setUsageOtherTexts(List<SmtVariantLongTextUsageOtherText> usageOtherTexts) {
		setLongTextsOfClass(usageOtherTexts, SmtVariantLongTextUsageOtherText.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "faxNumbers")
	@JacksonXmlProperty(localName = "faxNumber")
	public List<SmtVariantLongTextFaxNumber> getFaxNumbers() {
		List<SmtVariantLongTextFaxNumber> results = new ArrayList<SmtVariantLongTextFaxNumber>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextFaxNumber.TYPE) {
				results.add(new SmtVariantLongTextFaxNumber(longText.getValue()));
			}
		}
		return results;
	}

	public void setFaxNumbers(List<SmtVariantLongTextFaxNumber> faxNumbers) {
		setLongTextsOfClass(faxNumbers, SmtVariantLongTextFaxNumber.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "ingredients")
	@JacksonXmlProperty(localName = "ingredient")
	public List<SmtVariantLongTextIngredient> getIngredients() {
		List<SmtVariantLongTextIngredient> results = new ArrayList<SmtVariantLongTextIngredient>();
		for(SmtVariantLongText longText : longTexts) {
			if(longText.getType() == SmtVariantLongTextIngredient.TYPE) {
				results.add(new SmtVariantLongTextIngredient(longText.getValue()));
			}
		}
		return results;
	}

	public void setIngredients(List<SmtVariantLongTextIngredient> ingredients) {
		setLongTextsOfClass(ingredients, SmtVariantLongTextIngredient.TYPE);
	}

	private <SmtVariantNameTextLookupT extends SmtVariantNameTextLookup> void setNameTextLookupsOfClass(List<SmtVariantNameTextLookupT> nameTextLookups, int type) {
		Iterator<SmtVariantNameTextLookup> iterator = this.nameTextLookups.iterator();
		while(iterator.hasNext()) {
			SmtVariantNameTextLookup nameTextLookup = iterator.next();
			if(nameTextLookup.getType() == type) {
				iterator.remove();
			}
		}
		this.nameTextLookups.addAll(nameTextLookups);
	}

	@JacksonXmlElementWrapper(localName = "cookingGuidelines")
	@JacksonXmlProperty(localName = "cookingGuideline")
	public List<SmtVariantNameTextLookupCookingGuideline> getCookingGuidelines() {
		List<SmtVariantNameTextLookupCookingGuideline> results = new ArrayList<SmtVariantNameTextLookupCookingGuideline>();
		for(SmtVariantNameTextLookup nameTextLookup : nameTextLookups) {
			if(nameTextLookup.getType() == SmtVariantNameTextLookupCookingGuideline.TYPE) {
				results.add(new SmtVariantNameTextLookupCookingGuideline(nameTextLookup.getName(), nameTextLookup.getValue(), nameTextLookup.getText()));
			}
		}
		return results;
	}

	public void setCookingGuidelines(List<SmtVariantNameTextLookupCookingGuideline> cookingGuidelines) {
		setNameTextLookupsOfClass(cookingGuidelines, SmtVariantNameTextLookupCookingGuideline.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "lowerAgeLimits")
	@JacksonXmlProperty(localName = "lowerAgeLimit")
	public List<SmtVariantNameTextLookupLowerAgeLimit> getLowerAgeLimits() {
		List<SmtVariantNameTextLookupLowerAgeLimit> results = new ArrayList<SmtVariantNameTextLookupLowerAgeLimit>();
		for(SmtVariantNameTextLookup nameTextLookup : nameTextLookups) {
			if(nameTextLookup.getType() == SmtVariantNameTextLookupLowerAgeLimit.TYPE) {
				results.add(new SmtVariantNameTextLookupLowerAgeLimit(nameTextLookup.getName(), nameTextLookup.getValue(), nameTextLookup.getText()));
			}
		}
		return results;
	}

	public void setLowerAgeLimits(List<SmtVariantNameTextLookupLowerAgeLimit> lowerAgeLimits) {
		setNameTextLookupsOfClass(lowerAgeLimits, SmtVariantNameTextLookupLowerAgeLimit.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "upperAgeLimits")
	@JacksonXmlProperty(localName = "upperAgeLimit")
	public List<SmtVariantNameTextLookupUpperAgeLimit> getUpperAgeLimits() {
		List<SmtVariantNameTextLookupUpperAgeLimit> results = new ArrayList<SmtVariantNameTextLookupUpperAgeLimit>();
		for(SmtVariantNameTextLookup nameTextLookup : nameTextLookups) {
			if(nameTextLookup.getType() == SmtVariantNameTextLookupUpperAgeLimit.TYPE) {
				results.add(new SmtVariantNameTextLookupUpperAgeLimit(nameTextLookup.getName(), nameTextLookup.getValue(), nameTextLookup.getText()));
			}
		}
		return results;
	}

	public void setUpperAgeLimits(List<SmtVariantNameTextLookupUpperAgeLimit> upperAgeLimits) {
		setNameTextLookupsOfClass(upperAgeLimits, SmtVariantNameTextLookupUpperAgeLimit.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "usageCounts")
	@JacksonXmlProperty(localName = "usageCount")
	public List<SmtVariantNameTextLookupUsageCount> getUsageCounts() {
		List<SmtVariantNameTextLookupUsageCount> results = new ArrayList<SmtVariantNameTextLookupUsageCount>();
		for(SmtVariantNameTextLookup nameTextLookup : nameTextLookups) {
			if(nameTextLookup.getType() == SmtVariantNameTextLookupUsageCount.TYPE) {
				results.add(new SmtVariantNameTextLookupUsageCount(nameTextLookup.getName(), nameTextLookup.getValue(), nameTextLookup.getText()));
			}
		}
		return results;
	}

	public void setUsageCounts(List<SmtVariantNameTextLookupUsageCount> usageCounts) {
		setNameTextLookupsOfClass(usageCounts, SmtVariantNameTextLookupUsageCount.TYPE);
	}

	@JacksonXmlElementWrapper(localName = "durabiltyAfterOpenings")
	@JacksonXmlProperty(localName = "durabiltyAfterOpening")
	public List<SmtVariantNameTextLookupDurabiltyAfterOpening> getDurabiltyAfterOpenings() {
		List<SmtVariantNameTextLookupDurabiltyAfterOpening> results = new ArrayList<SmtVariantNameTextLookupDurabiltyAfterOpening>();
		for(SmtVariantNameTextLookup nameTextLookup : nameTextLookups) {
			if(nameTextLookup.getType() == SmtVariantNameTextLookupDurabiltyAfterOpening.TYPE) {
				results.add(new SmtVariantNameTextLookupDurabiltyAfterOpening(nameTextLookup.getName(), nameTextLookup.getValue(), nameTextLookup.getText()));
			}
		}
		return results;
	}

	public void setDurabiltyAfterOpenings(List<SmtVariantNameTextLookupDurabiltyAfterOpening> durabiltyAfterOpenings) {
		setNameTextLookupsOfClass(durabiltyAfterOpenings, SmtVariantNameTextLookupDurabiltyAfterOpening.TYPE);
	}

	public SmtVariantTextualNutrition getTextualNutrition() {
		return textualNutrition;
	}

	public void setTextualNutrition(SmtVariantTextualNutrition textualNutrition) {
		this.textualNutrition = textualNutrition;
	}

	public SmtVariantNumericNutrition getNumericNutrition() {
		return numericNutrition;
	}

	public void setNumericNutrition(SmtVariantNumericNutrition numericNutrition) {
		this.numericNutrition = numericNutrition;
	}

	@JacksonXmlElementWrapper(localName = "genericImageAssets")
	@JacksonXmlProperty(localName = "genericImageAsset")
	public List<SmtVariantGenericImageAsset> getGenericImageAssets() {
		return genericImageAssets;
	}

	public SmtVariantGenericImageAsset getGenericImageAsset(SmtAssetName assetName) {
		if(assetName != null) {
			for(SmtVariantGenericImageAsset genericImageAsset : genericImageAssets) {
				if(genericImageAsset.getName().equals(assetName)) {
					return genericImageAsset;
				}
			}
		}
		return null;
	}

	@JsonIgnore
	public SmtVariantGenericImageAsset getPrimaryGenericImageAsset() {
		if(!genericImageAssets.isEmpty()) {
			return genericImageAssets.get(0);
		}
		return null;
	}

	public void setGenericImageAssets(List<SmtVariantGenericImageAsset> genericImageAssets) {
		this.genericImageAssets = genericImageAssets;
	}

	@JacksonXmlElementWrapper(localName = "thirdPartyLogoImageAssets")
	@JacksonXmlProperty(localName = "thirdPartyLogoImageAsset")
	public List<SmtVariantThirdPartyLogoImageAsset> getThirdPartyLogoImageAssets() {
		return thirdPartyLogoImageAssets;
	}

	public SmtVariantThirdPartyLogoImageAsset getThirdPartyLogoImageAsset(SmtAssetName assetName) {
		if(assetName != null) {
			for(SmtVariantThirdPartyLogoImageAsset asset : getThirdPartyLogoImageAssets()) {
				if(asset.getName().equals(assetName)) {
					return asset;
				}
			}
		}
		return null;
	}

	@JsonIgnore
	public SmtVariantThirdPartyLogoImageAsset getPrimaryThirdPartyLogoImageAsset() {
		if(!thirdPartyLogoImageAssets.isEmpty()) {
			return thirdPartyLogoImageAssets.get(0);
		}
		return null;
	}

	public void setThirdPartyLogoImageAssets(List<SmtVariantThirdPartyLogoImageAsset> thirdPartyLogoImageAssets) {
		this.thirdPartyLogoImageAssets = thirdPartyLogoImageAssets;
	}

	@Override
	public boolean sameIdentityAs(SmtVariant other) {
		if(other == null) {
			return false;
		}
		return new EqualsBuilder()
		.append(gtin, other.gtin)
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
		final SmtVariant other = (SmtVariant) object;
		return sameIdentityAs(other);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
		.append(gtin)
		.toHashCode();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
		.append("gtin", gtin)
		.toString();
	}

}
