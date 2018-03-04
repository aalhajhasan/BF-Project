Meta:
@DependOn |login|0|

Scenario: TC-Cache-002 - Verify clear cache buttons are clickable

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Cache Option
Then [1100-1300] User clicks on the Campaign ListClea rButton
And [1100-1300] User clicks on the Publytics Clear Button
And [1100-1300] User clicks on the Pulse Clear Button
And [1100-1300] User clicks on the Api Clear Button





