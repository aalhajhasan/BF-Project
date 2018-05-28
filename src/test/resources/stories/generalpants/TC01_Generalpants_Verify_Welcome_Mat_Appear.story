Meta:
@ReportName General Pants

Scenario:  TC01_Generalpants_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens generalPants page
And [1111-1080] generalPantsWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the generalPantsWelcomeMatContinue
Then [1201-1080] generalPantsTopNav should be all displayed