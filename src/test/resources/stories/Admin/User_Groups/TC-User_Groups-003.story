Meta:
@DependOn |login|0|

Scenario: TC-User Groups-003 - Verify User Groups Search  and working properly.
Given [1000-9120] User navigate to User Groups page
When [1111-1010] Progress Dialog should be visible, Within 10 seconds
And [8001-0001] I type  Keyword at Search Box
Then [8001-0002] verify the Returned Rows contains this `Last Searched Data`




















