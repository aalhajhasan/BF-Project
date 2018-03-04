@namedItAs start


Scenario:  TC01-Verify Welcome Mat Appear

Given [1000-9000] User opens macys page
When [1111-1080] welcomeDialog should be displayed, Within 30 seconds
And [1100-1300] User clicks on the welcomeCloseButton
Then [1101-1080] macysLogo should be displayed