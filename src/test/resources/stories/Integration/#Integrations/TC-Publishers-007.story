
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-007 - Verify archive button status-publisher tab

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Approved For Direct Filter
And [1100-1300] User clicks on the All Option
And [1100-1300] User clicks on the archivedFilter
And [1100-1300] User clicks on the Yes Option
And [1100-1300] User clicks on the Sub Table First Row
Then [1111-1080] Properties Table should be displayed, Within 100 seconds
And [1201-1090] Nested Action Buttons should be all disabled
And [1100-1300] User clicks on the Specific Publisher
And [1101-1090] Unarchive Archive Publisher should be disabled
And [1111-1080] Page Header Is Archived should be displayed, Within 100 seconds
And [1101-1100] No Data Found text should equal to No Properties














