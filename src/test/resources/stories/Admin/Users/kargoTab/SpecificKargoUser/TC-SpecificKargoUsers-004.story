
Meta:
@DependOn |addBrand|0|

Scenario: TC-SpecificKargoUsers-003 - Verify user is able to delete user from user entry page

Given [1000-9000] User opens Kargo User page
When [1100-1300] User clicks on the Action Button
And [1100-1300] User clicks on the Delete Brand From Action Button
And [1111-1010] Progress Dialog should be visible, Within 10 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
Then [1111-1100] No Data Found text should equal to No Brands, Within 20 seconds