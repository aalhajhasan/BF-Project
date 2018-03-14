
Scenario:  Another scenario exploring different combination of events
Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens macys page
And [1111-1080] macysWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the macysWelcomeMatClose
Then [1201-1080] macysTopNav should be all displayed
