Meta:
@DependOn |login|0|

Scenario: TC-User Groups-001 - Verify user ability to navigate to User Groups page.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on user Groups Option
Then [1111-1080] Search Box should be displayed, Within 100 seconds
And [1111-1430] User Groups Tap should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1111-1530] User Groups Tap should have class attribute contain is-active, Within 3 seconds
And [1111-1080] Add UserGroup Button should be displayed, Within 20 seconds
And [1111-0430] First Column css attribute should contain NAME, Within 10 seconds










