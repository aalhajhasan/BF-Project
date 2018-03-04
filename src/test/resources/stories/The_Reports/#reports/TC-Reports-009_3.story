Meta:
@reports
Scenario: TC-Reports-009.1 - Verify user disability to navigate to Discrepancies previous page when at page no.1.

Given [1000-9000] User opens reports page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1101-1540] previousArrowButton should have class attribute contain is-disabled


Scenario: TC-Reports-009.2 - Verify user ability to navigate between Discrepancies pages using Next arrow.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the discrepanciesButton
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1320] User scroll to the Next Arrow Button
And [1100-1300] User clicks on the Next Arrow Button
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [8001-0010] User should be navigated to Next Page


Scenario: TC-Reports-009.3 - Verify user ability to navigate between Discrepancies pages using Previous arrow.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the discrepanciesButton
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1320] User scroll to the Previous Arrow Button
And [1100-1300] User clicks on the Previous Arrow Button
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [8001-0010] User should be navigated to Previous Page