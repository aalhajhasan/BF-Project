Meta:
@DependOn |login|0|
					 
Scenario: TC-User Companies-009 - Verify Publishers Search is working properly.
Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the publisher
And [8001-0001] I type Keyword at Search Box
Then [8001-0002] verify the Returned Rows contains this `Last Searched Data`
