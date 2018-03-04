
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-006.2 - Verify user disability to navigate to Publishers previous page when at page no.1.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1320] User scroll to the Next Arrow
And [8001-0009] User presses on Next Arrow Button, if page contains pagination
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [8001-0010] User should be navigated to Next Page








