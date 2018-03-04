Meta:
@DependOn |login|0|
Scenario: TC-Reports-003 - Verify user ability to navigate between Discrepancies pages by clicking on specific page number.

Given [1000-9000] User opens reports page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the discrepanciesButton
And [8001-0009] User presses on secondPageButton, if page contains pagination
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [8001-0010] User should be navigated to Next Page
