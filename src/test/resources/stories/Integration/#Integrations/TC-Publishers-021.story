
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-022.1 - Verify reset_all button functionality - publisher tab

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Properties Tab
And [1100-1300] User clicks on the Approved For Direct Filter
And [1100-1300] User clicks on the All Option
And [1100-1300] User clicks on the archivedFilter
And [1100-1300] User clicks on the Yes Option
And [1100-1300] User clicks on the Specific Property
Then [1101-1540] unarchiveArchivePropertyButton should have class attribute contain is-disabled
And [1111-1080] pageHeaderIsArchived should be displayed, Within 10 seconds
Then [1111-1100] noDataFound text should equal to No Ad Slots, Within 50 seconds







