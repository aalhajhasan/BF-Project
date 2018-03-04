
Meta:
@DependOn |addUser|0|

Scenario: TC-Users-005 - Verify user is able to delete kargo user

Given [1000-9000] User opens Kargo User page
When [1100-1340] User fills Search Box with `last Created User`
And [1111-1020] Progress Dialog should not be visible, Within 20 seconds
And [1111-1000] Action Button should be clickable, Within 50 seconds
And [1100-1300] User clicks on the Action Button
And [1000-9001] User on User Common Elements page
And [1100-1300] User clicks on the delete User From Action Button
And [1111-1000] Modal Dialog Accept Button should be clickable, Within 50 seconds
And [1100-1300] User clicks on the Modal Dialog Accept Button
And [1100-1340] User fills Search Box with `Automated User First Name`
Then [1111-1100] No Data Found text should equal to No Users, Within 20 seconds





