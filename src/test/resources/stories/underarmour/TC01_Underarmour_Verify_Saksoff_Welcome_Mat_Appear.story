Meta:
@ReportName Underarmour

Scenario:  TC01_Underarmour_Verify_Saksoff_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens underarmour page
And [1111-1080] underarmourWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the underarmourWelcomeMatClose
Then [1201-1080] underarmourTopNav should be all displayed