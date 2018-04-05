Meta:
@ReportName Gilt

Scenario:  TC00_Gilt_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens gilt page
And [1111-1000] giltRegisterLink should be clickable, Within 120 seconds
And [1100-0300] User click on it
And [1111-1080] giltRegisterDialog should be displayed, Within 120 seconds
And [1100-1340] User fills giltRegisterEmailSection with `newUser`
And [1100-1300] User clicks on the giltShopNowButton
And [1111-1080] giltRegisterPasswordSection should be displayed, Within 120 seconds
And [1100-1340] User fills giltRegisterPasswordSection with `newPassword`
And [1100-1300] User clicks on the giltGenderMale
And [1100-1400] Execute `click` javascript on giltSubmitButton
Then [1111-1080] giltWelcomeDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the giltStartShopping
And [1100-1300] User clicks on the giltAccountIcon
And [1100-1300] User clicks on the giltSignOutLink
Then [1111-1080] giltRegisterLink should be displayed, Within 120 seconds