Meta:
@DependOn |login|0|

Scenario: TC-Data Lists-012 - Verify user ability to navigate to Ad Networks page.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the Ad Networks Link
And [1111-1020] Progress Dialog should not be visible, Within 15 seconds
Then [1101-1100] Header Title text should equal to Ad Networks
And [1101-1100] First Column text should equal to NAME
And [1101-1100] Second Column text should equal to Modified Date
And [1101-1100] Third Column text should equal to Modified BY
And [1101-1100] Forth Column text should equal to Actions





