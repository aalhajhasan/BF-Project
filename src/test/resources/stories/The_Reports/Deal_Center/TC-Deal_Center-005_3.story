Meta:
@DependOn |login|0|
Scenario: TC-Deal_Center-005.1 - verify arrow status

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the dealCenterButton
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [1101-1540] previousArrowButton should have class attribute contain is-disabled


Scenario: TC-Deal_Center-005.2 - Verify user ability to navigate between Deal_Center pages using Next arrow.
Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the dealCenterButton
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1100-1320] User scroll to the Next Arrow Button
And [1100-1300] User clicks on the Next Arrow Button
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [8001-0010] User should be navigated to Next Page



Scenario: TC-Deal_Center-005.3 - Verify user ability to navigate between Deal_Center pages using Previous arrow.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the dealCenterButton
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1100-1320] User scroll to the Previous Arrow Button
And [1100-1300] User clicks on the Previous Arrow Button
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [8001-0010] User should be navigated to Previous Page