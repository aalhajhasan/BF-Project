Meta:
@reports
Scenario: TC-Discrepancies-004.1 - verify Discrepancies_by_Publisher_SubTable expand

Given I am On Reports_Page
When I click on Discrepancies_Button
And I click on Discrepancies_Page_Calendar
And change date range at Discrepancies page to get data
And click on the first chevron beside publisher name name
Then I verify Discrepancies by_Publisher_SubTable columns



Scenario: TC-Discrepancies-004.2 - verify Discrepancies_by_Publisher_SubTable collapsed 

Given I am at  Discrepancies Page
When i click on chevron X_Button_At_Table
Then I verify Discrepancies_by_Publisher_Sub table collapse