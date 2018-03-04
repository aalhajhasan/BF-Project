
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-005.1 - verify pagination is working fine at Publishers tab (50 row).

integration
Given [1000-9000] User opens The Integration page
When [1211-1542] Publisher Data should have at least 50 elements that have attribute name class and it's value contain js-teamDropdownButton, Within 20 seconds
Then [1211-1544] Publisher Data should have at most 50 element have attribute name class and it's value contain js-teamDropdownButton, Within 20 seconds








