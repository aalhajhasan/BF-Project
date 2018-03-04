Meta:
@DependOn |login|0|
Scenario: TC-Deal_Center-001 - Verify user ability to navigate Deal_Center page

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the dealCenterButton
And [1111-1080] reprotsSearchBox should be displayed, Within 100 seconds
And [1111-1080] moreFilters should be displayed, Within 100 seconds
And [1111-1080] overviewMetric should be displayed, Within 100 seconds
And [1111-1080] revenueFilter should be displayed, Within 100 seconds
And [1111-1080] selectFilter should be displayed, Within 100 seconds
And [1100-1300] User clicks on the dateRangePickerLabel
Then [1111-1080] dateRangePickerBody should be displayed, Within 100 seconds
And [1111-1100] dealHeader text should equal to Deal Center, Within 10 seconds


