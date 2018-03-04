
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-005.2 - verify pagination is working fine at Publishers tab (75 row).

Given [1000-9000] User opens The Integration page
When [1100-1300] User clicks on the Row 75
Then [1211-1542] Publisher Data should have at least 75 elements that have attribute name class and it's value contain js-teamDropdownButton, Within 10 seconds
And [1211-1544] Publisher Data should have at most 75 element have attribute name class and it's value contain js-teamDropdownButton, Within 10 seconds










