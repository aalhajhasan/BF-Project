
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-018 - Verify approved for direct filter functionality at properties tab.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Properties Tab
And [1101-1100] Default Option From Filter text should equal to All
Then [8007-0001] filter using All from approved for direct list return correct rows

