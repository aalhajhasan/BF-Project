Meta:
@ReportName Landsend

Scenario:  TC01_Verify_Landsend_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens landsend page
And [1111-1080] landsendWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the landsendWelcomeMatClose
Then [1201-1080] landsendTopNav should be all displayed