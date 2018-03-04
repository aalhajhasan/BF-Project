Meta:
@DependOn |login|0|
Scenario: TC-Reports-010- Verify user ability to navigate to pulse under reports.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the pulseLink
And [1100-1300] User clicks on the dateRangePickerLabel
Then [1111-1080] dateRangePickerBody should be displayed, Within 10 seconds
And [1111-1080] revenueTab should be displayed, Within 10 seconds
And [1111-1080] eCPMTab should be displayed, Within 10 seconds
And [1111-1080] impressionsTab should be displayed, Within 10 seconds
And [1111-1080] overviewMetric should be displayed, Within 10 seconds
And [1111-1080] revenueSection should be displayed, Within 10 seconds
And [1111-1080] impressionsSection should be displayed, Within 10 seconds
And [1111-1080] eCPMSection should be displayed, Within 10 seconds
And [1111-1080] eCPMNetFilters should be displayed, Within 10 seconds
And [1111-1080] eCPMExportButton should be displayed, Within 10 seconds
And [1111-1080] impressionsExportButton should be displayed, Within 10 seconds