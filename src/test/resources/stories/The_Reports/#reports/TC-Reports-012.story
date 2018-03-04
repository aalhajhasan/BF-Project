Meta:
@DependOn |login|0|
Scenario: TC-Reports-012 - Verify user ability to navigate to specific property and verify page elements.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the reportsSpecificProperty
And [1100-1300] User clicks on the dateRangePickerLabel
Then [1111-1080] dateRangePickerBody should be displayed, Within 100 seconds
And [1111-1080] revenueTab should be displayed, Within 100 seconds
And [1111-1080] eCPMTab should be displayed, Within 100 seconds
And [1111-1080] impressionsTab should be displayed, Within 100 seconds
And [1111-1080] overviewMetric should be displayed, Within 100 seconds
And [1111-1080] revenueSection should be displayed, Within 100 seconds
And [1111-1080] impressionsSection should be displayed, Within 100 seconds
And [1111-1080] eCPMSection should be displayed, Within 100 seconds
And [1111-1080] revenueNetFilters should be displayed, Within 100 seconds
And [1111-1080] impressionsPeriodFilters should be displayed, Within 100 seconds
And [1111-1080] impressionsPeriodFilters should be displayed, Within 100 seconds
And [1111-1080] eCPMPeriodFilters should be displayed, Within 100 seconds
And [1111-1080] eCPMNetFilters should be displayed, Within 100 seconds
And [1111-1080] eCPMExportButton should be displayed, Within 100 seconds
And [1111-1080] impressionsExportButton should be displayed, Within 100 seconds


