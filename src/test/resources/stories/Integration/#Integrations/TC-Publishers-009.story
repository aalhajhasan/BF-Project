
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-009 - Verify approved for store filter functionality.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1101-1100] Default Option From Filter text should equal to Yes
Then [8001-0012] filtering using All from approved for direct list return correct rows







