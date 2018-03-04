
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-025 - Verify ad slot Search is working properly.
Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Ad Slots Tap
And [8001-0001] I type  Keyword at Search Box
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
Then [8001-0002] verify the Returned Rows contains this `Last Searched Data`









