Meta:
@DependOn |login|0|

Scenario: TC-Data Lists-001 - Verify user ability to navigate to Data Lists page.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Roles Option
Then [1111-1080] Search Box should be displayed, Within 100 seconds
And [1111-0430] First Column css attribute should contain cx, Within 10 seconds











