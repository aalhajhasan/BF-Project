Meta:
@DependOn |login|0|

Scenario: TC-User Companies-011 -01- verify pagination is working fine at Publisher tab (50 row).

Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the publisher
Then [1211-1542] All Data For First Coulmn should have at least 50 elements that have attribute name class and it's value contain prettyTable-row, Within 5 seconds
And [1211-1544] All Data For First Coulmn should have at most 50 element have attribute name class and it's value contain prettyTable-row, Within 3 seconds

Scenario: TC-User Companies-011 -02- verify pagination is working fine at Publisher tab (75 row).
Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the publisher
And [1100-1300] User clicks on the Row 75
Then [1211-1542] All Data For First Coulmn should have at least 75 elements that have attribute name class and it's value contain prettyTable-row, Within 5 seconds
And [1211-1544] All Data For First Coulmn should have at most 75 element have attribute name class and it's value contain prettyTable-row, Within 3 seconds


Scenario: TC-User Companies-011 -03- verify pagination is working fine at Publisher tab (100 row).
Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the publisher
And [1100-1300] User clicks on the Row 100
Then [1211-1542] All Data For First Coulmn should have at least 100 elements that have attribute name class and it's value contain prettyTable-row, Within 5 seconds
And [1211-1544] All Data For First Coulmn should have at most 100 element have attribute name class and it's value contain prettyTable-row, Within 3 seconds
