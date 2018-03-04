Meta:
@DependOn |login|0|
@name AddUserGroup

Scenario: Scenario: TC-User Groups-002 - Verify user ability to add a user group.
Given [1000-9120] User navigate to User Groups page
When [1100-1300] User clicks on the Add User Group Button
And [1100-1340] User fills Name Form Field with `User Group Name`
And [1101-0281] Save value in global scope under name last Created Group
And [1100-1300] User clicks on the Submit Button
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1340] User fills Search Box with `User Group Name`
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1130] First Cell text should contain `User Group Name`, Within 5 seconds

























