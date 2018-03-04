
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-006.1 - Verify user disability to navigate to Publishers previous page when at page no.1.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1320] User scroll to the Previous Arrow Button
Then [1101-1540] Previous Arrow Button should have class attribute contain is-disabled









