Meta:
@DependOn |login|0|

Scenario: TC-Data Lists-004 - Verify user ability to navigate to Ad Demographics page.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the Ad Demographics Link
And [1111-1020] Progress Dialog should not be visible, Within 15 seconds
Then [1101-1100] Header Title text should equal to Ad Demographics Link
And [1101-1100] First Column text should equal to NAME
And [1101-1100] Second Column text should equal to Modified Date
And [1101-1100] Third Column text should equal to Modified BY


