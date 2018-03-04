Meta:
@DependOn |login|0|
Scenario: TC-Specific Publisher-006 - Verify user ability to archive/unarchive Property.


Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the archivedFilter
And [1100-1300] User clicks on the All Option Archived
And [1100-1300] User clicks on the Publisher Action Button
Then [8007-0002] And check property status and archive/Unarchive moreover check popup msg
