
Scenario:  verify country dialog displays
Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens carters page
And [1111-1080] signupDialog should be displayed, Within 60 seconds
And [1100-1300] User clicks on the closePopup
And [1101-1080] countryflag should be displayed
And [1100-0300] User click on it
And [1111-1080] countrycontinar should be displayed, Within 120 seconds
And [1100-1601] Select countryselect By Value GB
And [1100-1300] User clicks on the updateButton
Then [1101-1080] countryflag should be displayed