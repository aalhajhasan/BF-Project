Meta:
@DependOn |AddNetwork|0|

Scenario: TC-Data Lists-016-2 - Verify user ability to add and edit Ad Networks.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the Ad Networks Link
And [1100-1340] User fills Search Box with `last Created Network`
And [1111-1010] Progress Dialog should be visible, Within 10 seconds
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Action Button
And [1100-1300] User clicks on the Edit Ad Networks Option
And [1100-1340] User fills Name Field with `Edit Network Name`
And [1100-1300] User clicks on the Submit Network
And [1100-1340] User fills Search Box with `Edit Network Name`
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1130] First Cell text should contain `Edit Network Name`, Within 5 seconds






