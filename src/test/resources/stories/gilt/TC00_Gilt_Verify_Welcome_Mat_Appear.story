Meta:
@ReportName Gilt

Scenario:  TC00_Gilt_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens gilt page
And [1111-1000] registerLink should be clickable, Within 120 seconds
And [1100-0300] User click on it
And [1111-1080] registerDialog should be displayed, Within 120 seconds
And [1100-1340] User fills registerEmailSection with `newUser`
And [1100-1300] User clicks on the shopNowButton
And [1111-1080] registerPasswordSection should be displayed, Within 120 seconds
And [1100-1340] User fills registerPasswordSection with `newPassword`
And [1100-1300] User clicks on the genderMale
And [1100-1400] Execute `click` javascript on submitButton
Then [1111-1080] welcomeDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the startShopping
And [1100-1300] User clicks on the accountIcon
And [1100-1300] User clicks on the signOutLink
Then [1111-1080] registerLink should be displayed, Within 120 seconds