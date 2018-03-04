Meta:
@DependOn |login|0|

Scenario: TC-User Companies-002 - Verify user ability to navigate between Publisher pages by clicking on specific page number.

Given [1000-9120] User navigate to Publisher User Company page
When [1111-1020] Progress Dialog should not be visible, Within 20 seconds
And [1100-1320] User scroll to the Second Page Button
And [8001-0009] User presses on Second Page Button, if page contains pagination
Then [8001-0010] User should be navigated to Next Page










