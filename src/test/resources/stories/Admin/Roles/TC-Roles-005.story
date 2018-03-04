Meta:
@DependOn |login|0|

Scenario: TC-Roles-005 - Verify user ability to navigate to users tab.
Given [1000-9120] User navigate to roles page
When [1100-1300] User clicks on the Specific Role
And [1100-1300] User clicks on the Users Tab
Then [1111-1430] Permissions Tab should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1111-0430] First Column css attribute should contain NAME, Within 10 seconds
And [1111-0430] Second Column css attribute should contain EMAIL, Within 10 seconds
And [1101-1100] Third Column text should equal to TYPE
