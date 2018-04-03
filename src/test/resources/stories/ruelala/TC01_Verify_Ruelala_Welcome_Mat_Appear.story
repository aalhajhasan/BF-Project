Meta:
@ReportName Ruelala

Scenario:  TC01_Verify_Ruelala_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens ruelala page
And [1111-1080] newMemberDialog should be displayed, Within 120 seconds
And [1100-1340] User fills memberEmail with `newUser`
And [1100-1300] User clicks on the continueButton
And [1100-1340] User fills memberPassword with `newPassword`
And [1100-1300] User clicks on the startShopping
Then [1111-1080] welcomeMate should be displayed, Within 120 seconds
And [1100-1300] User clicks on the shopNowButton