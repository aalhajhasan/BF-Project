Meta:
@ReportName Jcrew

Scenario:  TC01_Jcrew_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens jcrew page
And [1111-1080] jcrewWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the jcrewWelcomeMatContinue
And [1100-1300-S] User clicks on the jcrewXButton
Then [1201-1080] jcrewTopNav should be all displayed