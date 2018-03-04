Meta:
@DependOn |login|0|
Scenario: TC-Reports-Specific-publisher_003 - Verify user ability to navigate to eCPM tab and verify tab elements.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the specificPublisherReports
And [1100-1300] User clicks on the eCPMTab
And [1111-1080] overviewMetric should be displayed, Within 10 seconds
And [1111-1080] eCPMSection should be displayed, Within 10 seconds
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
And [1111-1080] creativeTypeCreativeFilters should be displayed, Within 10 seconds
And [1111-1080] brandNetFilters should be displayed, Within 10 seconds
And [1111-1080] agencyNetFilters should be displayed, Within 10 seconds
And [1111-1080] byCreativeTypeExportButton should be displayed, Within 10 seconds
And [1111-1080] forCreativeTypeExportButton should be displayed, Within 10 seconds
And [1111-1080] brandExportButton should be displayed, Within 10 seconds
And [1111-1080] advertiserVerticalExportButton should be displayed, Within 10 seconds
And [1111-1080] agencyExportButton should be displayed, Within 10 seconds
And [1111-1080] regionExportButton should be displayed, Within 10 seconds
And [1111-1080] salesPersonExportButton should be displayed, Within 10 seconds
And [1111-1080] campaignManagerExportButton should be displayed, Within 10 seconds
And [1111-1080] accountManagerExportButton should be displayed, Within 10 seconds
