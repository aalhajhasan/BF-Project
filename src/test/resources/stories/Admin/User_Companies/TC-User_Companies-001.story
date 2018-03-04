Meta:
@DependOn |login|0|

Scenario: TC-Roles-001-Verfiy roles page elements.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on User Companies
Then [1111-1080] Search Box should be displayed, Within 100 seconds
And [1111-1430] Advertiser Tab Admin should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1111-1080] Add User Company Button should be displayed, Within 20 seconds
And [1111-0430] First Column css attribute should contain COMPANY, Within 10 seconds










