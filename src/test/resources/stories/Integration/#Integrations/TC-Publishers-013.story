
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-013 - Verify export button displays and working fine at Properties tab.
Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Properties Tab
And [8001-0004] calculate number of files at downloads directory
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Export Button
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40