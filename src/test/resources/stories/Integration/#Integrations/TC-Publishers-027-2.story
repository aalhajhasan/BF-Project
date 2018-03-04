
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-027.2 - Verify user ability to navigate between Adslot pages using Next arrow.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Ad Slots Tap
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [8001-0009] User presses on Next Arrow Button, if page contains pagination
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [8001-0010] User should be navigated to Next Page







