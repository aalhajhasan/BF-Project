
Meta:
@DependOn |addBrand|0|

Scenario: TC-SpecificKargoUsers-005 - Verify user is able to delete user from user entry page

Given [1000-9000] User opens Kargo User page
When [1100-1300] User clicks on the Delete User Button
And [1100-1300] User clicks on the Modal Dialog Accept Button
And [1111-1010] Progress Dialog should be visible, Within 10 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1340] User fills Search Box with `last Created User2`
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
Then [1111-1100] No Data Found text should equal to No Users, Within 20 seconds