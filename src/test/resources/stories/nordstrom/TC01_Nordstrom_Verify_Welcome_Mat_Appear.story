Meta:
@ReportName Nordstrom

Scenario:  TC01_Nordstrom_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens nordstrom page
And [1111-1080] nordstromWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the nordstromWelcomeMatClose
Then [1201-1080] nordstromTopNav should be all displayed