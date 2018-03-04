Meta:
@reports
Scenario: TC-Discrepancies-002.1 - verify pagination is working fine at Discrepancies page (50 row).

Given I am On Reports_Page
When I click on Discrepancies_Button
And I click on Discrepancies_Page_Calendar
And change date range at Discrepancies page to get data
Then I verify the number of rows in the table equals 50


Scenario: TC-Discrepancies-002.2 - verify pagination is working fine at Discrepancies page(75 row).

Given I am at Deal_Center page
When I Hit 75_Row_At_Page_Button
And I wait progress dialog to disappear
Then I verify the number of rows in the table equals 75


Scenario: TC-Discrepancies-002.3 - verify pagination is working fine at Discrepancies page (100 row).

Given I am at Deal_Center page
When I Hit 100_Row_At_Page_Button
Then I verify the number of rows in the table equals 100