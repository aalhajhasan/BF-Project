Meta:
@DependOn |login|0|
Scenario: TC-Reports-Specific-property_004 - Verify export button is working fine at property Revenue tab.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the reportsSpecificProperty
And [1100-1300] User clicks on the revenueTab
And [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the revenueExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the byCreativeTypeExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the forCreativeTypeExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the platformExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the brandExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the advertiserVerticalExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the agencyExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the regionExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the salesPersonExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the campaignManagerExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the accountManagerExportButton
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 40