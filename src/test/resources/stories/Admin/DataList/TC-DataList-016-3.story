Meta:
@DependOn |AddNetwork|0|

Scenario: TC-Data Lists-016-3 - Verify user ability to add and delete Ad Network.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the Ad Networks Link
And [1100-1340] User fills Search Box with `last Created Network`
And [1111-1010] Progress Dialog should be visible, Within 10 seconds
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Action Button
And [1100-1300] User clicks on the Delete Vendor
And [1100-1300] User clicks on the Modal Dialog Accept Button
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1100] No Data Found text should equal to No Ad Networks, Within 20 seconds
