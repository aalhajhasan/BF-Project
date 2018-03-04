Meta:
@DependOn |login|0|

Scenario: TC-Data Lists-018 - Verify user ability to navigate to Ad Slot Types page.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the ad Slot Types Link
And [1111-1020] Progress Dialog should not be visible, Within 15 seconds
Then [1101-1100] Header Title text should equal to Ad Slot Types
And [1101-1100] First Column text should equal to NAME
And [1101-1100] Second Column text should equal to Ad Server Targeting Position
And [1101-1100] Third Column text should equal to Platform
And [1101-1100] Forth Column text should equal to Ad Unit Types
And [1101-1100] Fifth Column text should equal to Allow Multiple Instances
And [1101-1100] Sixth Column text should equal to Has Slot-Level Wrapper
