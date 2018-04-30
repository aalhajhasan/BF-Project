Meta:
@ReportName ebags

Scenario:  TC01_Ebags_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens ebags page
And [1111-1080] ebagsWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the ebagsWelcomeMatContinue
Then [1201-1080] ebagsTopNav should be all displayed