package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;
import com.aspire.kargo.pages.common.UserCommonElements;

@Page(name = "reports", url = "${pages.reports.url}")

public interface ReportsPage extends SiteCommonElements, UserCommonElements{
	
	
	@CssSelector("${pages.reports.reportsOption}")
	public AspireWebElement reportsOption();
	
	@CssSelector("${pages.reports.publyticsButton}")
	public AspireWebElement publyticsButton();
	
	@CssSelector("${pages.reports.discrepanciesButton}")
	public AspireWebElement discrepanciesButton();
	
	@CssSelector("${pages.reports.dealCenterButton}")
	public AspireWebElement dealCenterButton();
	
	
	@CssSelector("${pages.reports.reportsFirstCoulmn}")
	public AspireWebElement reportsFirstCoulmn();
	
	@CssSelector("${pages.reports.reportsSecondCoulmn}")
	public AspireWebElement reportsSecondCoulmn();
	
	
	@CssSelector("${pages.reports.reportsThirdCoulmn}")
	public AspireWebElement reportsThirdCoulmn();
	
	@CssSelector("${pages.reports.pulseLink}")
	public AspireWebElement pulseLink();
	
	
	@CssSelector("${pages.reports.reprotsSearchBox}")
	public AspireWebElement reprotsSearchBox();
	
	
	@CssSelector("${pages.reports.dateRangePickerLabel}")
	public AspireWebElement dateRangePickerLabel();
	
	
	@CssSelector("${pages.reports.dateRangePickerBody}")
	public AspireWebElement dateRangePickerBody();
	
	@CssSelector("${pages.reports.revenueTab}")
	public AspireWebElement revenueTab();
	
	@CssSelector("${pages.reports.impressionsTab}")
	public AspireWebElement impressionsTab();
	
	
	@CssSelector("${pages.reports.eCPMTab}")
	public AspireWebElement eCPMTab();
	
	
	@CssSelector("${pages.reports.overviewMetric}")
	public AspireWebElement overviewMetric();
	
	
	@CssSelector("${pages.reports.revenueSection}")
	public AspireWebElement revenueSection();
	
	@CssSelector("${pages.reports.impressionsSection}")
	public AspireWebElement impressionsSection();
	
	
	@CssSelector("${pages.reports.eCPMSection}")
	public AspireWebElement eCPMSection();
	
	
	@CssSelector("${pages.reports.revenuePeriodFilters}")
	public AspireWebElement revenuePeriodFilters();
	
	@CssSelector("${pages.reports.revenueNetFilters}")
	public AspireWebElement revenueNetFilters();
	
	@CssSelector("${pages.reports.impressionsPeriodFilters}")
	public AspireWebElement impressionsPeriodFilters();
	
	
	@CssSelector("${pages.reports.eCPMPeriodFilters}")
	public AspireWebElement eCPMPeriodFilters();
	
	@CssSelector("${pages.reports.eCPMNetFilters}")
	public AspireWebElement eCPMNetFilters();
	
	@CssSelector("${pages.reports.impressionsExportButton}")
	public AspireWebElement impressionsExportButton();
	
	@CssSelector("${pages.reports.eCPMExportButton}")
	public AspireWebElement eCPMExportButton();
	
	@CssSelector("${pages.reports.specificPublisherName}")
	public AspireWebElement specificPublisherName();
	
	
	@CssSelector("${pages.reports.specificPropertyName}")
	public AspireWebElement specificPropertyName();
	
	@CssSelector("${pages.reports.reportsReturnedRows}")
	public AspireWebElement reportsReturnedRows();
	
	@CssSelector("${pages.reports.allDataTableOnreportsPage}")
	public AspireWebElements allDataTableOnreportsPage();
	
	@CssSelector("${pages.reports.specificPublisherReports}")
	public AspireWebElement specificPublisherReports();
	
	@CssSelector("${pages.reports.discrepanciesPageCalendar}")
	public AspireWebElement discrepanciesPageCalendar();
	
	@CssSelector("${pages.reports.discrepanciesDateRangePickerBody}")
	public AspireWebElement discrepanciesDateRangePickerBody();
	
	@CssSelector("${pages.reports.learnMoreButton}")
	public AspireWebElement learnMoreButton();
	
	
	
	@CssSelector("${pages.reports.reportsForthCoulmn}")
	public AspireWebElement reportsForthCoulmn();
	
	@CssSelector("${pages.reports.reportsFifthCoulmn}")
	public AspireWebElement reportsFifthCoulmn();
	
	@CssSelector("${pages.reports.reportsSixthCoulmn}")
	public AspireWebElement reportsSixthCoulmn();
	
	@CssSelector("${pages.reports.reportsSeventhCoulmn}")
	public AspireWebElement reportsSeventhCoulmn();
	
	@CssSelector("${pages.reports.reportsEighthCoulmn}")
	public AspireWebElement reportsEighthCoulmn();
	
	
	@CssSelector("${pages.reports.reportsSpecificProperty}")
	public AspireWebElement reportsSpecificProperty();
	
	@CssSelector("${pages.reports.byCreativeTypeSection}")
	public AspireWebElement byCreativeTypeSection();
	
	@CssSelector("${pages.reports.forCreativeTypeSection}")
	public AspireWebElement forCreativeTypeSection();
	
	
	@CssSelector("${pages.reports.platformSection}")
	public AspireWebElement platformSection();
	
	
	@CssSelector("${pages.reports.brandSection}")
	public AspireWebElement brandSection();
	
	
	
	
	
	@CssSelector("${pages.reports.advertiserVerticalSection}")
	public AspireWebElement advertiserVerticalSection();
	
	@CssSelector("${pages.reports.agencySection}")
	public AspireWebElement agencySection();
	
	@CssSelector("${pages.reports.regionSection}")
	public AspireWebElement regionSection();
	
	@CssSelector("${pages.reports.salesPersonSection}")
	public AspireWebElement salesPersonSection();
	
	@CssSelector("${pages.reports.campaignManagerSection}")
	public AspireWebElement campaignManagerSection();
	
	
	@CssSelector("${pages.reports.accountManagerSection}")
	public AspireWebElement accountManagerSection();
	
	
	@CssSelector("${pages.reports.creativeTypeCreativeFilters}")
	public AspireWebElement creativeTypeCreativeFilters();
	
	@CssSelector("${pages.reports.creativeTypePeriodFilters}")
	public AspireWebElement creativeTypePeriodFilters();
	
	@CssSelector("${pages.reports.byCreativeNetFilters}")
	public AspireWebElement byCreativeNetFilters();
	
	@CssSelector("${pages.reports.forCreativeNetFilters}")
	public AspireWebElement forCreativeNetFilters();
	
	@CssSelector("${pages.reports.platformNetFilters}")
	public AspireWebElement platformNetFilters();
	
	@CssSelector("${pages.reports.brandNetFilters}")
	public AspireWebElement brandNetFilters();
	
	@CssSelector("${pages.reports.advertiserVerticalNetFilters}")
	public AspireWebElement advertiserVerticalNetFilters();
	
	@CssSelector("${pages.reports.agencyNetFilters}")
	public AspireWebElement agencyNetFilters();
	
	
	@CssSelector("${pages.reports.regionNetFilters}")
	public AspireWebElement regionNetFilters();
	
	@CssSelector("${pages.reports.salesPersonNetFilters}")
	public AspireWebElement salesPersonNetFilters();
	
	@CssSelector("${pages.reports.campaignManagerNetFilters}")
	public AspireWebElement campaignManagerNetFilters();
	
	@CssSelector("${pages.reports.accountManagerNetFilters}")
	public AspireWebElement accountManagerNetFilters();
	
	
	@CssSelector("${pages.reports.revenueExportButton}")
	public AspireWebElement revenueExportButton();
	
	@CssSelector("${pages.reports.byCreativeTypeExportButton}")
	public AspireWebElement byCreativeTypeExportButton();
	
	@CssSelector("${pages.reports.forCreativeTypeExportButton}")
	public AspireWebElement forCreativeTypeExportButton();
	
	@CssSelector("${pages.reports.brandExportButton}")
	public AspireWebElement brandExportButton();
	
	@CssSelector("${pages.reports.advertiserVerticalExportButton}")
	public AspireWebElement advertiserVerticalExportButton();
	
	
	@CssSelector("${pages.reports.agencyExportButton}")
	public AspireWebElement agencyExportButton();
	
	@CssSelector("${pages.reports.regionExportButton}")
	public AspireWebElement regionExportButton();
	
	
	@CssSelector("${pages.reports.salesPersonExportButton}")
	public AspireWebElement salesPersonExportButton();
	
	
	@CssSelector("${pages.reports.campaignManagerExportButton}")
	public AspireWebElement campaignManagerExportButton();
	
	
	@CssSelector("${pages.reports.accountManagerExportButton}")
	public AspireWebElement accountManagerExportButton();
	
	@CssSelector("${pages.reports.adFormatsFilterAtImpressionForSection}")
	public AspireWebElement adFormatsFilterAtImpressionForSection();
	
	@CssSelector("${pages.reports.platformExportButton}")
	public AspireWebElement platformExportButton();
	
	@CssSelector("${pages.reports.revenueFilter}")
	public AspireWebElement revenueFilter();
	
	@CssSelector("${pages.reports.dealHeader}")
	public AspireWebElement dealHeader();
	
	@CssSelector("${pages.reports.selectFilter}")
	public AspireWebElement selectFilter();
	
	
	@CssSelector("${pages.reports.dateShortcutLabel}")
	public AspireWebElement dateShortcutLabel();
	
	
}
