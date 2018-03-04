Meta:
@DependOn |login|0|
Scenario: TC-Reports-005.1 - verify pagination is working fine fine at Reports page (50 row).


Given [1000-9000] User opens reports page
Then [1211-1542] allDataTableOnreportsPage should have at least 50 elements that have attribute name class and it's value contain prettyTable-row, Within 10 seconds
And [1211-1544] allDataTableOnreportsPage should have at most 50 element have attribute name class and it's value contain prettyTable-row, Within 10 seconds



Scenario: TC-Reports-005.2 - verify pagination is working fine fine at Reports page (75 row).

Given [1000-9000] User opens reports page
And [1100-1300] User clicks on the Row 75
Then [1211-1542] allDataTableOnreportsPage should have at least 75 elements that have attribute name class and it's value contain prettyTable-row, Within 10 seconds
And [1211-1544] allDataTableOnreportsPage should have at most 75 element have attribute name class and it's value contain prettyTable-row, Within 10 seconds


Scenario: TC-Reports-005.3 - verify pagination is working fine fine at Reports page (100 row).

Given [1000-9000] User opens reports page
And [1100-1300] User clicks on the Row 100
Then [1211-1542] allDataTableOnreportsPage should have at least 100 elements that have attribute name class and it's value contain prettyTable-row, Within 10 seconds
And [1211-1544] allDataTableOnreportsPage should have at most 100 element have attribute name class and it's value contain prettyTable-row, Within 10 seconds