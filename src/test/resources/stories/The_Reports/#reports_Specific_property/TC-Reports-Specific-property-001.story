Meta:
@DependOn |login|0|
Scenario: TC-Reports-Specific-property_001 - Verify user ability to navigate to property Revenue tab and verify tab elements at publisher tab.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the reportsSpecificProperty
And [1100-1300] User clicks on the Revenue Tab
And [1111-1080] overviewMetric should be displayed, Within 100 seconds
And [1111-1080] revenueSection should be displayed, Within 100 seconds
And [1111-1080] byCreativeTypeSection should be displayed, Within 100 seconds
And [1111-1080] forCreativeTypeSection should be displayed, Within 100 seconds
And [1111-1080] platformSection should be displayed, Within 100 seconds
And [1111-1080] brandSection should be displayed, Within 100 seconds
And [1111-1080] advertiserVerticalSection should be displayed, Within 100 seconds
And [1111-1080] agencySection should be displayed, Within 100 seconds
And [1111-1080] regionSection should be displayed, Within 100 seconds
And [1111-1080] salesPersonSection should be displayed, Within 100 seconds
And [1111-1080] campaignManagerSection should be displayed, Within 100 seconds
And [1111-1080] accountManagerSection should be displayed, Within 100 seconds
And [1111-1080] creativeTypeCreativeFilters should be displayed, Within 100 seconds
And [1111-1080] creativeTypePeriodFilters should be displayed, Within 100 seconds
And [1111-1080] byCreativeNetFilters should be displayed, Within 100 seconds
And [1111-1080] forCreativeNetFilters should be displayed, Within 100 seconds
And [1111-1080] platformNetFilters should be displayed, Within 100 seconds
And [1111-1080] brandNetFilters should be displayed, Within 100 seconds
And [1111-1080] advertiserVerticalNetFilters should be displayed, Within 100 seconds
And [1111-1080] agencyNetFilters should be displayed, Within 100 seconds
And [1111-1080] regionNetFilters should be displayed, Within 100 seconds
And [1111-1080] salesPersonNetFilters should be displayed, Within 100 seconds
And [1111-1080] campaignManagerNetFilters should be displayed, Within 100 seconds
And [1111-1080] accountManagerNetFilters should be displayed, Within 100 seconds
And [1111-1080] revenueExportButton should be displayed, Within 100 seconds
And [1111-1080] byCreativeTypeExportButton should be displayed, Within 100 seconds
And [1111-1080] forCreativeTypeExportButton should be displayed, Within 100 seconds
And [1111-1080] brandExportButton should be displayed, Within 100 seconds
And [1111-1080] advertiserVerticalExportButton should be displayed, Within 100 seconds
And [1111-1080] agencyExportButton should be displayed, Within 100 seconds
And [1111-1080] regionExportButton should be displayed, Within 100 seconds
And [1111-1080] salesPersonExportButton should be displayed, Within 100 seconds
And [1111-1080] campaignManagerExportButton should be displayed, Within 100 seconds
And [1111-1080] accountManagerExportButton should be displayed, Within 100 seconds

