Meta:
@ReportName L.L.Bean

Scenario:  TC01_Llbean_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens llbean page
And [1111-1080] llbeanWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the llbeanWelcomeMatContinue
Then [1201-1080] llbeanTopNav should be all displayed