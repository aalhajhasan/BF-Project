Meta:
@DependOn |login|0|
					 
Scenario: TC-Reports-001 - Verify user ability to navigate to Reports page.

Given [1000-9001] User on dashboard page
When [1100-1300] User clicks on the Reports Option
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1080] reprotsSearchBox should be displayed, Within 100 seconds
And [1111-1080] Pagination Module should be displayed, Within 20 seconds
And [1111-1080] publyticsButton should be displayed, Within 100 seconds
And [1111-1080] discrepanciesButton should be displayed, Within 100 seconds
And [1111-1080] dealCenterButton should be displayed, Within 100 seconds
And [1111-1080] pulseLink should be displayed, Within 100 seconds
And [1101-1100] reportsFirstCoulmn text should equal to Publisher
And [1101-1100] reportsSecondCoulmn text should equal to Property
And [1101-1100] reportsThirdCoulmn text should equal to Pub Manager
