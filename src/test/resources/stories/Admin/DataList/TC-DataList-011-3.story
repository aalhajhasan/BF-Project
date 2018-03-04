Meta:
@DependOn |AddUserVendor|0|

Scenario: TC-Data Lists-016-3 - Verify user ability to add and edit Ad Networks.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the Tracking Vendors Link
And [1100-1340] User fills Search Box with `last Created Vendors`
And [1111-1010] Progress Dialog should be visible, Within 10 seconds
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Action Button
And [1100-1300] User clicks on the Edit Vendor
And [1100-1340] User fills Name Field with `Edit Tracking Vendors`
And [1100-1300] User clicks on the Submit Network
And [1100-1340] User fills Search Box with `Edit Tracking Vendors`
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1130] First Cell text should contain `Edit Tracking Vendors`, Within 5 seconds






