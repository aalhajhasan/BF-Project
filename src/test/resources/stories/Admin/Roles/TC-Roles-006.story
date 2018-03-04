Meta:
@DependOn |login|0|

Scenario: TC-Roles-006 - Verify permissions blocks expanded.
Given [1000-9120] User navigate to roles page
When [1100-1300] User clicks on the Specific Role
Then [1211-1000] allChevrons should be all clickable, Within 4 seconds
And [1211-0500] They should have attribute with name class and their values equals to button--expandIndicator, Within 3 seconds
And [1200-0300] User clicks on all of them 
Then [1211-0540] They should all have attribute with name class and their values contain is-expanded, Within 2 seconds
Then [1200-1320] User scroll to each of the allChevrons then click


