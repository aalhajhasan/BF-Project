
Meta:
@DependOn |login|0|

Scenario: TC-Users-008 - Verify user ability to navigate to next user page

Given [1000-9000] User opens Kargo User page
When [1000-3010] Set window size to be 1456 Height and 876 Width
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [8001-0009] User presses on Second Page Button, if page contains pagination
Then [8001-0010] User should be navigated to Next Page