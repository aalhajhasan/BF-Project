Meta:
@DependOn |login|0|
@name AddUserVendor

Scenario: TC-Data Lists-012 - Verify user ability to add Tracking Vendor.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the Tracking Vendors Link
And [1100-1300] User clicks on the Add Tracking Vendors Button
And [1100-1340] User fills Name Field with `Tracking Vendors Name`
And [1101-0281] Save value in global scope under name last Created Vendors
And [1100-1300] User clicks on the Submit Button
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1340] User fills Search Box with `Tracking Vendors Name`
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1130] First Cell text should contain `Tracking Vendors Name`, Within 5 seconds



