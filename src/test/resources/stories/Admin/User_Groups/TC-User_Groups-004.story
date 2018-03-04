Meta:
@DependOn |AddUserGroup|0|
 

Scenario: TC-User Groups-004 - Verify user ability to delete a user group.
Given [1000-9120] User navigate to User Groups page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1340] User fills Search Box with `last Created Group`
And [1111-1010] Progress Dialog should be visible, Within 10 seconds
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Action Button
And [1100-1300] User clicks on the Delete User Group
And [1100-1300] User clicks on the Modal Dialog Accept Button
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1100] No Data Found text should equal to No User Groups, Within 20 seconds

















