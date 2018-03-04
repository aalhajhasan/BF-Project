Meta:
@DependOn |login|0|
Scenario: TC-Deal_Center-003 - Verify export button displays and working fine at Deal_Center page.
Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the dealCenterButton
And [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the Export Button
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40

