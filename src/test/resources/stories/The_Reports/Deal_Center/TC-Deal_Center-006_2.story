Meta:
@DependOn |login|0|
Scenario: TC-Deal_Center-006.1 - Verify user ability to navigate between deal_Pages by clicking on specific page number.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the dealCenterButton
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [8001-0009] User presses on Second Page Button, if page contains pagination
Then [8001-0010] User should be navigated to Next Page

Scenario: TC-Deal_Center-006.2 - Verify deal search is working properly.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the dealCenterButton
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [8001-0001] I type specificPublisherName User at reprotsSearchBox
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
Then [8001-0002] verify the Returned Rows contains this `Last Searched Data`