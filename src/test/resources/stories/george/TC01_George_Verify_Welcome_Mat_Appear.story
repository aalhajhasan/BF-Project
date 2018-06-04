Meta:
@ReportName George

Scenario:  TC01_George_Verify_Welcome_Mat_Appear

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens george page
And [8032-0001] sleep after last action for 5000 Milliseconds
And [1100-1601] Select georgeCountry By Value `georgeRandomCountry`
And [1100-1300] User clicks on the georgeCountryUpdate
And [1111-1080] georgeWelcomeMat should be displayed, Within 120 seconds
And [1100-1321] User scroll to the georgeWelcomeMatContinue then click it
Then [1201-1080] georgeTopNav should be all displayed