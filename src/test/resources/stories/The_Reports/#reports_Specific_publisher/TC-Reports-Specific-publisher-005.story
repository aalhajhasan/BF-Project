Meta:
@DependOn |login|0|
Scenario: TC-Reports-Specific-publisher_005 - Verify export button is working fine at publisher Overview tab.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the reportsSpecificProperty
And [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the revenueExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the impressionsExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the eCPMExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40