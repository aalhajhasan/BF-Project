
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-015.2 - verify pagination is working fine at Properties tab (75 row).
Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Properties Tab
And [1100-1300] User clicks on the Row 75
Then [1211-1542] Property Data should have at least 75 elements that have attribute name class and it's value contain button, Within 10 seconds
And [1211-1544] Property Data should have at most 75 element have attribute name class and it's value contain button, Within 10 seconds
