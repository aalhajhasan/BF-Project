Meta:
@ReportName Lord And Taylor

Scenario:  TC01_Lordandtaylor_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens lordandtaylor page
And [1111-1080] lordandtaylorWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the lordandtaylorWelcomeMatContinue
Then [1201-1080] lordandtaylorTopNav should be all displayed