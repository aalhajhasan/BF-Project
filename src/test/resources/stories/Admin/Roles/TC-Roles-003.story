Meta:
@DependOn |login|0|

Scenario: TC-Roles-003 - Verify Roles Search is working properly.

Given [1000-9120] User navigate to roles page
When [8001-0001] I type Specific Role at Search Box
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
Then [8001-0002] verify the Returned Rows contains this `Last Searched Data`