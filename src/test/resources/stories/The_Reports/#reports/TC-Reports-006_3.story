Meta:
@DependOn |login|0|
Scenario: TC-Reports-006.1 - Verify user disability to navigate to Reports previous page when at page no.1.

Given [1000-9000] User opens reports page
When [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [1101-1540] previousArrowButton should have class attribute contain is-disabled


Scenario: TC-Reports-006.2 - Verify user ability to navigate between Reports pages using Next arrow.
Given [1000-9000] User opens reports page
When [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1100-1320] User scroll to the Next Arrow Button
And [1100-1300] User clicks on the Next Arrow Button
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [8001-0010] User should be navigated to Next Page



Scenario: TC-Reports-006.3 - Verify user ability to navigate between Reports pages using Previous arrow.
Given [1000-9000] User opens reports page
When [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1100-1320] User scroll to the Previous Arrow Button
And [1100-1300] User clicks on the Previous Arrow Button
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [8001-0010] User should be navigated to Previous Page