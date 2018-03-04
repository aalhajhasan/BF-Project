
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-007 - Verify archive button status-publisher tab

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [8001-0009] User presses on Second Page Button, if page contains pagination
Then [8001-0010] User should be navigated to Next Page













