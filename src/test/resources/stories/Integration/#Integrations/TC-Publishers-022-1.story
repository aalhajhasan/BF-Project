
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-021 -1- Verify archive button status-property tab

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1300] User clicks on the Properties Tab
And [1100-1300] User clicks on the Approved For Direct Filter
And [1100-1300] User clicks on the All Option
And [1100-1300] User clicks on the archivedFilter
And [1100-1300] User clicks on the Yes Option
And [1100-1300] User clicks on the reset All Button
When [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1101-1100] Approved For Direct Filter text should equal to All
And [1101-1100] archivedFilter text should equal to No








