
					 
Scenario:  Verify-Welcome-Mat-Displays
Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens nordstrom page
And [1111-1080] nordstromWelcomeMat should be displayed, Within 120 seconds
And [1100-1300] User clicks on the nordstromWelcomeMatClose
Then [1201-1080] nordstromTopNav should be all displayed
