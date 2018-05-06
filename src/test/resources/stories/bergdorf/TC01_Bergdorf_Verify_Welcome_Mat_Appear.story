Meta:
@ReportName Bergdorf Goodman

Scenario:  TC01_Bergdorf_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens bergdorf page
And [1111-1080] bergdorfWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the bergdorfWelcomeMatClose
Then [1201-1080] bergdorfTopNav should be all displayed