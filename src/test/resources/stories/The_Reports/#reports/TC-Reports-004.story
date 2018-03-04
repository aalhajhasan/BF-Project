Meta:
@DependOn |login|0|
Scenario: TC-Reports-004 - Verify  Search is working properly at Reports page.

Given [1000-9000] User opens reports page
When [8001-0001] I type specificPublisherName at reprotsSearchBox
And [1101-0281] Save value in global scope under name Last Searched Data
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
Then [1101-1140] reportsReturnedRows text should contain `Last Searched Data`




