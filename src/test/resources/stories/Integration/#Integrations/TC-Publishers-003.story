
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-003 - Verify Publishers Search is working properly.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Integration Link and click on Publishers Option
And [8001-0001] I type  Keyword at Search Box
Then [8001-0002] verify the Returned Rows contains this `Last Searched Data`


