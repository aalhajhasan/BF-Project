Meta:
@ReportName Rue La La

Scenario:  TC01_Ruelala_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens ruelala page
And [1111-1080] ruelalaNewMemberDialog should be displayed, Within 120 seconds
And [1100-1340] User fills ruelalaMemberEmail with `newUser`
And [1100-1300] User clicks on the ruelalaContinueButton
And [1111-1080] ruelalaMemberPassword  should be displayed, Within 120 seconds
And [1100-1340] User fills ruelalaMemberPassword with `newPassword`
And [1100-1300] User clicks on the ruelalaRegisterCheckBox
And [1100-1300] User clicks on the ruelalaStartShopping
Then [1111-1080] ruelalaWelcomeMate should be displayed, Within 120 seconds
And [1100-1300] User clicks on the ruelalaShopNowButton