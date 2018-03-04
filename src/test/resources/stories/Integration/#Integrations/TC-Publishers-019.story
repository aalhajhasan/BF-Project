
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-019 - Verify user ability to archive/Unarchive property.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Properties Tab
And [1100-1300] User clicks on the Approved For Direct Filter
And [1100-1300] User clicks on the All Option
And [1100-1300] User clicks on the archivedFilter
And [1100-1300] User clicks on the All Option
And [1100-1300] User clicks on the Nested Action Button
When [8007-0002] And check property status and archive/Unarchive moreover check popup msg
