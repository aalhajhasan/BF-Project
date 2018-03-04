Meta:
@DependOn |login|0|

Scenario: TC-Roles-004 - Verify user ability to navigate to specific Role page.

Given [1000-9120] User navigate to roles page
When [1101-1284] save Specific Role value in scenario scope under name Role Name
And [1100-1300] User clicks on the Specific Role
Then [1111-1430] Permissions Tab should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1111-1530] The Permissions Tab should have class attribute contain is-active, Within 40 seconds
And [1111-1080] Add Role Button should be displayed, Within 20 seconds
And [1111-1080] Permissions Blocks should be displayed, Within 20 seconds
And [1111-1080] Delete Role Button should be displayed, Within 20 seconds
And [1111-1100] Page Title text should equal to `Role Name`, Within timeout seconds


