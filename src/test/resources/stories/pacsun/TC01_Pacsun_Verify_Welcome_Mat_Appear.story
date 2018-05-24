Meta:
@ReportName Pacsun

Scenario:  TC01_Pacsun_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens pacsun page
And [1100-1300] User clicks on the pacsunCountryFlag
And [1100-1601] Select pacsunCountry By Value `pacsunRandomCountry`
And [1100-1300] User clicks on the pacsunCountryUpdate
And [1111-1080] pacsunWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the pacsunWelcomeMatContinue
Then [1201-1080] pacsunTopNav should be all displayed