
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-024 - Verify user ability to navigate to AdSlot tab
Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Ad Slots Tap
And [1111-1080] ad Slots Table should be displayed, Within 10 seconds
And [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the Export Button
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40










