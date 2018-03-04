
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-006.1 - Verify user disability to navigate to Publishers previous page when at page no.1.

Given [1000-9000] User opens The Integration page
When [1100-1300] User clicks on the Row 100
Then [1211-1542] Publisher Data should have at least 100 elements that have attribute name class and it's value contain js-teamDropdownButton, Within 10 seconds
And [1211-1544] Publisher Data should have at most 100 element have attribute name class and it's value contain js-teamDropdownButton, Within 10 seconds









