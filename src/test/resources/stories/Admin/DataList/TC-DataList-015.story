Meta:
@DependOn |login|0|

Scenario: TC-Data_Lists-015 - Verify export button displays and working fine at Targeting Positions page.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the Targeting Positions Link
And [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the Export Button
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40


