Meta:
@DependOn |login|0|
Scenario: TC-Reports-Specific-property-002 - Verify user ability to navigate to property Impressions tab and verify tab elements at publisher page.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the reportsSpecificProperty
And [1100-1300] User clicks on the impressionsTab
And [1111-1080] overviewMetric should be displayed, Within 10 seconds
And [1111-1080] impressionsSection should be displayed, Within 10 seconds
And [1111-1080] byCreativeTypeSection should be displayed, Within 10 seconds
And [1111-1080] forCreativeTypeSection should be displayed, Within 10 seconds
And [1111-1080] platformSection should be displayed, Within 10 seconds
And [1111-1080] brandSection should be displayed, Within 10 seconds
And [1111-1080] advertiserVerticalSection should be displayed, Within 10 seconds
And [1111-1080] agencySection should be displayed, Within 100 seconds
And [1111-1080] regionSection should be displayed, Within 100 seconds
And [1111-1080] salesPersonSection should be displayed, Within 100 seconds
And [1111-1080] campaignManagerSection should be displayed, Within 100 seconds
And [1111-1080] accountManagerSection should be displayed, Within 100 seconds
And [1111-1080] impressionsPeriodFilters should be displayed, Within 10 seconds
And [1111-1080] adFormatsFilterAtImpressionForSection should be displayed, Within 10 seconds
And [1111-1080] creativeTypePeriodFilters should be displayed, Within 10 seconds
And [1111-1080] impressionsExportButton should be displayed, Within 10 seconds
And [1111-1080] byCreativeTypeExportButton should be displayed, Within 10 seconds
And [1111-1080] forCreativeTypeExportButton should be displayed, Within 10 seconds
And [1111-1080] brandExportButton should be displayed, Within 10 seconds
And [1111-1080] advertiserVerticalExportButton should be displayed, Within 10 seconds
And [1111-1080] agencyExportButton should be displayed, Within 10 seconds
And [1111-1080] regionExportButton should be displayed, Within 10 seconds
And [1111-1080] salesPersonExportButton should be displayed, Within 10 seconds
And [1111-1080] campaignManagerExportButton should be displayed, Within 10 seconds
And [1111-1080] accountManagerExportButton should be displayed, Within 10 seconds
