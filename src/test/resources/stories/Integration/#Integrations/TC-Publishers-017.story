
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-017 - Verify user ability to navigate between Properties pages by clicking on specific page number.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Properties Tab
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [8001-0009] User presses on Second Page Button, if page contains pagination
Then [8001-0010] User should be navigated to Next Page
