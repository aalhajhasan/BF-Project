package com.aspire.kargo.pages.common;

import org.openqa.selenium.WebElement;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.ClassNameSelector;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "theIntegration", url = "${pages.integration.url}")
public interface IntegrationsElements extends SiteCommonElements {

	@CssSelector("${pages.integration.specificPublisher}")
	public AspireWebElement specificPublisher();

	@CssSelector("${pages.integration.secoundSpecificPublisher}")
	public AspireWebElement secoundSpecificPublisher();

	@CssSelector("${pages.integration.invoicesTab}")
	public AspireWebElement invoicesTab();

	@CssSelector("${pages.integration.addYearButton}")
	public AspireWebElement addYearButton();

	@CssSelector("${pages.integration.saveYearButton}")
	public AspireWebElement saveYearButton();

	@CssSelector("${pages.integration.addYearFields}")
	public AspireWebElements addYearFields();

	@CssSelector("${pages.integration.invoicesValue}")
	public AspireWebElement invoicesValue();
	
	@CssSelector("${pages.integration.publishersOption}")
	public AspireWebElement publishersOption();
	
	
	@CssSelector("${pages.integration.integrationLink}")
	public AspireWebElement integrationLink();
	
	@CssSelector("${pages.integration.publisherTap}")
	public AspireWebElement publisherTap();
	
	@CssSelector("${pages.integration.approvedForDirectFilter}")
	public AspireWebElement approvedForDirectFilter();
	
	
	@CssSelector("${pages.integration.addPublisherButton}")
	public AspireWebElement addPublisherButton();
	
	@CssSelector("${pages.integration.teamButton}")
	public AspireWebElement teamButton();
	
	@CssSelector("${pages.integration.publisherTier}")
	public AspireWebElement publisherTier();
	
	@CssSelector("${pages.integration.publisherTier1}")
	public AspireWebElement publisherTier1();
	
	@CssSelector("${pages.integration.contractType}")
	public AspireWebElement contractType();
	
	@CssSelector("${pages.integration.contractOption}")
	public AspireWebElement contractOption();
	
	@CssSelector("${pages.integration.primaryCountry}")
	public AspireWebElement primaryCountry();
	
	
	@CssSelector("${pages.integration.goalType}")
	public AspireWebElement goalType();
	
	
	@CssSelector("${pages.integration.commitment}")
	public AspireWebElement commitment();

	@CssSelector("${pages.integration.businessTermsAlert1}")
	public AspireWebElement businessTermsAlert1();
	
	@CssSelector("${pages.integration.businessTermsAlert2}")
	public AspireWebElement businessTermsAlert2();
	
	
	
	@CssSelector("${pages.integration.publisherDirectorIpField}")
	public AspireWebElement publisherDirectorIpField();
	
	@CssSelector("${pages.integration.publisherCoordinatorIpField}")
	public AspireWebElement publisherCoordinatorIpField();
	
	@CssSelector("${pages.integration.publisherManagerIpField}")
	public AspireWebElement publisherManagerIpField();
	
	@CssSelector("${pages.integration.firstPublisherDirector}")
	public AspireWebElement firstPublisherDirector();
	
	@CssSelector("${pages.integration.firstPublisherCoordinator}")
	public AspireWebElement firstPublisherCoordinator();
	
	@CssSelector("${pages.integration.firstPublisherManager}")
	public AspireWebElement firstPublisherManager();
	
	@CssSelector("${pages.integration.breadCrumbBackPublisher}")
	public AspireWebElement breadCrumbBackPublisher();
	
	
	@CssSelector("${pages.integration.logoImg}")
	public AspireWebElement logoImg();
	
	@CssSelector("${pages.integration.firstPrimaryCountry}")
	public AspireWebElement firstPrimaryCountry();
	
	
	@CssSelector("${pages.integration.publisherData}")
	public AspireWebElements publisherData();
	
	
	@CssSelector("${pages.integration.allOption}")
	public AspireWebElement allOption();
	
	
	@CssSelector("${pages.integration.archivedFilter}")
	public AspireWebElement archivedFilter();
	
	
	@CssSelector("${pages.integration.yesOption}")
	public AspireWebElement yesOption();
	
	@CssSelector("${pages.integration.subTableFirstRow}")
	public AspireWebElement subTableFirstRow();
	
	@CssSelector("${pages.integration.propertiesTable}")
	public AspireWebElement propertiesTable();
	
	
	@CssSelector("${pages.integration.nestedActionButtons}")
	public AspireWebElement nestedActionButtons();

	@CssSelector("${pages.integration.unarchiveArchivePublisher}")
	public AspireWebElement unarchiveArchivePublisher();
	
	@CssSelector("${pages.integration.pageHeaderIsArchived}")
	public AspireWebElement pageHeaderIsArchived();
	
	@CssSelector("${pages.integration.noDataFound}")
	public AspireWebElement noDataFound();
	
	@CssSelector("${pages.integration.propertiesTab}")
	public AspireWebElement propertiesTab();
	
	
	@CssSelector("${pages.integration.firstItemFromProperty}")
	public AspireWebElement firstItemFromProperty();
	
	@CssSelector("${pages.integration.adSlotsTable}")
	public AspireWebElement adSlotsTable();
	
	@CssSelector("${pages.integration.firstCoulmnFromadSlotsTable}")
	public AspireWebElement firstCoulmnFromadSlotsTable();
	
	@CssSelector("${pages.integration.secondCoulmnFromadSlotsTable}")
	public AspireWebElement secondCoulmnFromadSlotsTable();
	
	@CssSelector("${pages.integration.thirdCoulmnFromadSlotsTable}")
	public AspireWebElement thirdCoulmnFromadSlotsTable();
	
	@CssSelector("${pages.integration.forthCoulmnFromadSlotsTable}")
	public AspireWebElement forthCoulmnFromadSlotsTable();
	
	@CssSelector("${pages.integration.fifthCoulmnFromadSlotsTable}")
	public AspireWebElement fifthCoulmnFromadSlotsTable();
	
	@CssSelector("${pages.integration.sixthCoulmnFromadSlotsTable}")
	public AspireWebElement sixthCoulmnFromadSlotsTable();
	
	@CssSelector("${pages.integration.sevnthCoulmnFromadSlotsTable}")
	public AspireWebElement sevnthCoulmnFromadSlotsTable();
	
	@CssSelector("${pages.integration.xButtonAtAdSlotsTable}")
	public AspireWebElement xButtonAtAdSlotsTable();
	
	
	
	@CssSelector("${pages.integration.firstCoulmnFromPropertyTable}")
	public AspireWebElement firstCoulmnFromPropertyTable();
	
	@CssSelector("${pages.integration.secondCoulmnFromPropertyTable}")
	public AspireWebElement secondCoulmnFromPropertyTable();
	
	@CssSelector("${pages.integration.thirdCoulmnFromPropertyTable}")
	public AspireWebElement thirdCoulmnFromPropertyTable();
	
	@CssSelector("${pages.integration.forthCoulmnFromPropertyTable}")
	public AspireWebElement forthCoulmnFromPropertyTable();
	
	@CssSelector("${pages.integration.fifthCoulmnFromPropertyTable}")
	public AspireWebElement fifthCoulmnFromPropertyTable();
	
	@CssSelector("${pages.integration.sixthCoulmnFromPropertyTable}")
	public AspireWebElement sixthCoulmnFromPropertyTable();
	
	@CssSelector("${pages.integration.sevnthCoulmnFromPropertyTable}")
	public AspireWebElement sevnthCoulmnFromPropertyTable();
	
	@CssSelector("${pages.integration.propertyData}")
	public AspireWebElements propertyData();
	
	@CssSelector("${pages.integration.thirdCoulmnropertyTable}")
	public AspireWebElements thirdCoulmnropertyTable();
	
	
	@CssSelector("${pages.integration.noOption}")
	public AspireWebElement noOption();
	
	
	@CssSelector("${pages.integration.nestedActionButton}")
	public AspireWebElement nestedActionButton();
	
	@CssSelector("${pages.integration.propertyStatus}")
	public AspireWebElement propertyStatus();
	
	@CssSelector("${pages.integration.arachiveUnarachivePopup}")
	public AspireWebElement arachiveUnarachivePopup();
	
	
	@CssSelector("${pages.integration.specificProperty}")
	public AspireWebElement specificProperty();
	
	@CssSelector("${pages.integration.unarchiveArchivePropertyButton}")
	public AspireWebElement unarchiveArchivePropertyButton();
	
	@CssSelector("${pages.integration.resetAllButton}")
	public AspireWebElement resetAllButton();
	
	@CssSelector("${pages.integration.adSlotsTap}")
	public AspireWebElement adSlotsTap();
	
	@CssSelector("${pages.integration.formatFilter}")
	public AspireWebElement formatFilter();
	
	@CssSelector("${pages.integration.platformFilter}")
	public AspireWebElement platformFilter();
	
	
	
	
	@CssSelector("${pages.integration.firstC}")
	public AspireWebElement firstC();
	
	@CssSelector("${pages.integration.secondC}")
	public AspireWebElement secondC();
	
	@CssSelector("${pages.integration.thirdC}")
	public AspireWebElement thirdC();
	
	@CssSelector("${pages.integration.forthC}")
	public AspireWebElement forthC();
	
	@CssSelector("${pages.integration.fifthC}")
	public AspireWebElement fifthC();
	
	@CssSelector("${pages.integration.sixthC}")
	public AspireWebElement sixthC();
	
	@CssSelector("${pages.integration.seventhC}")
	public AspireWebElement seventhC();
	
	@CssSelector("${pages.integration.egighthC}")
	public AspireWebElement egighthC();
	
	@CssSelector("${pages.integration.ninthC}")
	public AspireWebElement ninthC();
	
	@CssSelector("${pages.integration.adSlotData}")
	public AspireWebElements adSlotData();
	
	@CssSelector("${pages.integration.adSlotData.forthCoulmnAdSlotTable}")
	public AspireWebElements forthCoulmnAdSlotTable();
	
	@CssSelector("${pages.integration.adSlotData.platformOptions}")
	public AspireWebElements platformOptions();
	
	@CssSelector("${pages.integration.adSlotData.firstItemOnPublisher}")
	public AspireWebElement firstItemOnPublisher();
	
	@CssSelector("${pages.integration.overviewTab}")
	public AspireWebElement overviewTab();
	
	@CssSelector("${pages.integration.addPropertyButton}")
	public AspireWebElement addPropertyButton();
	
	
	@CssSelector("${pages.integration.moreFilters}")
	public AspireWebElement moreFilters();
	
	@CssSelector("${pages.integration.leftDetailsRail}")
	public AspireWebElement leftDetailsRail();
	
	@CssSelector("${pages.integration.bookmarkIcon}")
	public AspireWebElement bookmarkIcon();
	
	@CssSelector("${pages.integration.propertiesTableUnderPublisher}")
	public AspireWebElement propertiesTableUnderPublisher();
	
	@CssSelector("${pages.integration.bookmarkIconTopNav}")
	public AspireWebElement bookmarkIconTopNav();
	
	@CssSelector("${pages.integration.firstBookedItem}")
	public AspireWebElement firstBookedItem();

	@CssSelector("${pages.integration.bookmarkHeader}")
	public AspireWebElement bookmarkHeader();
	
	@CssSelector("${pages.integration.editTeamModule}")
	public AspireWebElement editTeamModule();
	
	@CssSelector("${pages.integration.allEditTextBoxes}")
	public AspireWebElements allEditTextBoxes();
	
	@CssSelector("${pages.integration.teamDialog}")
	public AspireWebElement teamDialog();
	
	@CssSelector("${pages.integration.secondPublisherDirector}")
	public AspireWebElement secondPublisherDirector();
	
	@CssSelector("${pages.integration.secondPublisherManager}")
	public AspireWebElement secondPublisherManager();
	
	
	@CssSelector("${pages.integration.secondPublisherCoordinator}")
	public AspireWebElement secondPublisherCoordinator();
	
	
	@CssSelector("${pages.integration.firstTeam}")
	public AspireWebElement firstTeam();
	@CssSelector("${pages.integration.secondTeam}")
	public AspireWebElement secondTeam();
	@CssSelector("${pages.integration.thirdTeam}")
	public AspireWebElement thirdTeam();
	
	@CssSelector("${pages.integration.publisherInformation}")
	public AspireWebElement publisherInformation();
	
	@CssSelector("${pages.integration.editInformation}")
	public AspireWebElement editInformation();
	
	@CssSelector("${pages.integration.aPPROVEDFORPMPCheckBox}")
	public AspireWebElement aPPROVEDFORPMPCheckBox();
	
	@CssSelector("${pages.integration.logoDiv}")
	public AspireWebElement logoDiv();
	
	@CssSelector("${pages.integration.publisherTier2}")
	public AspireWebElement publisherTier2();
	
	@CssSelector("${pages.integration.internalGoal}")
	public AspireWebElement internalGoal();
	
	@CssSelector("${pages.integration.secondPrimaryCountry}")
	public AspireWebElement secondPrimaryCountry();
	
	@CssSelector("${pages.integration.ioOption}")
	public AspireWebElement ioOption();
	
	@CssSelector("${pages.integration.nameHeaderName}")
	public AspireWebElement nameHeaderName();
	
	@CssSelector("${pages.integration.removeLogo}")
	public AspireWebElement removeLogo();
	
	@CssSelector("${pages.integration.tierText}")
	public AspireWebElement tierText();
	
	@CssSelector("${pages.integration.goalTypeText}")
	public AspireWebElement goalTypeText();
	
	@CssSelector("${pages.integration.contractTypeText}")
	public AspireWebElement contractTypeText();
	
	@CssSelector("${pages.integration.countryText}")
	public AspireWebElement countryText();
	

	
	@CssSelector("${pages.integration.propertyName}")
	public AspireWebElement propertyName();
	
	@CssSelector("${pages.integration.languageTextBox}")
	public AspireWebElement languageTextBox();
	
	@CssSelector("${pages.integration.iABCategoryField}")
	public AspireWebElement iABCategoryField();
	
	@CssSelector("${pages.integration.websiteURL}")
	public AspireWebElement websiteURL();
	
	@CssSelector("${pages.integration.description}")
	public AspireWebElement description();
	
	@CssSelector("${pages.integration.blockListURL}")
	public AspireWebElement blockListURL();
	
	@CssSelector("${pages.integration.demographics}")
	public AspireWebElement demographics();
	
	@CssSelector("${pages.integration.addPropertyLogo}")
	public AspireWebElement addPropertyLogo();
	
	@CssSelector("${pages.integration.addPropertyBackgroundImage}")
	public AspireWebElement addPropertyBackgroundImage();
	
	@CssSelector("${pages.integration.addPropertyAdTagReleaseGroup}")
	public AspireWebElement addPropertyAdTagReleaseGroup();
	
	@CssSelector("${pages.integration.deltaVeryHigh}")
	public AspireWebElement deltaVeryHigh();
	
	
	
	@CssSelector("${pages.integration.propertyInformationApprovedForDirect}")
	public AspireWebElement propertyInformationApprovedForDirect();
	
	@CssSelector("${pages.integration.propertyInformationCountries}")
	public AspireWebElement propertyInformationCountries();
	
	@CssSelector("${pages.integration.propertyInformationLanguages}")
	public AspireWebElement propertyInformationLanguages();
	
	@CssSelector("${pages.integration.propertyInformationDemographics}")
	public AspireWebElement propertyInformationDemographics();
	
	@CssSelector("${pages.integration.propertyInformationIABCategories}")
	public AspireWebElement propertyInformationIABCategories();
	
	@CssSelector("${pages.integration.propertyInformationAdTagReleaseGroup}")
	public AspireWebElement propertyInformationAdTagReleaseGroup();
	
	@CssSelector("${pages.integration.businessTerms}")
	public AspireWebElement businessTerms();
	
	@CssSelector("${pages.integration.addNewRevenueSplitButton}")
	public AspireWebElement addNewRevenueSplitButton();
	
	@CssSelector("${pages.integration.publisherActionButton}")
	public AspireWebElement publisherActionButton();
	
	@CssSelector("${pages.integration.allOptionArchived}")
	public AspireWebElement allOptionArchived();
	
}





