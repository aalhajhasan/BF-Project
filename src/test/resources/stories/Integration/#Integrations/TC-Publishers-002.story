
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-002 - Verify export button displays and working fine.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Integration Link and click on Publishers Option
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Export Button
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40


