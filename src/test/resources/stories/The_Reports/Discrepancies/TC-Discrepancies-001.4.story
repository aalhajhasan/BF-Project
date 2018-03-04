Meta:
@DependOn |login|0|

Scenario: TC-Discrepancies-001.1 - pre step

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the discrepanciesButton
And [1100-1300] User clicks on the discrepanciesPageCalendar


And I click on Discrepancies_Page_Calendar
And change date range at Discrepancies page to get data

Scenario: TC-Discrepancies-001.2 - Verify "learn more" button functionality(property)

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the discrepanciesButton
When I Click on Discrepancies_Specific_Publisher
And I click on Learn_More_Button
Then I verify user redirected to google account in differnet tab

Scenario: TC-Discrepancies-001.3 - Verify "learn more" button functionality(Ad slot)

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the discrepanciesButton
When I Click on Discrepancies_Specific_Property
And I click on Learn_More_Button
Then I verify user redirected to google account in differnet tab