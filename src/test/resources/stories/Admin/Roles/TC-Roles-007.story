Sample story

Meta:
@DependOn |login|0|

Scenario: TC-Roles-007 - Check the functionality of Add Role.
Given [1000-9120] User navigate to roles page
When [1100-1300] User clicks on the add_RoleButton
Then [1111-1080] ROLE text should be displayed, Within 3 seconds
Then [1111-1080] TYPE text should be displayed, Within 2 seconds

