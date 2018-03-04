Meta:
@reports
Scenario: TC-Discrepancies-003.1 - verify arrow status

Given I am On Reports_Page
When I click on Discrepancies_Button
And I click on Discrepancies_Page_Calendar
And change date range at Discrepancies page to get data
Then I verify that the Previous_Arrow_Button is disabled by default


Scenario: TC-Discrepancies-003.2 - Verify user ability to navigate between Publisher pages using Next arrow.

Given I am at Deal_Center page
When i hit Next_Arrow_Button
Then I should navigate to Next Page


Scenario: TC-Discrepancies-003.3 - Verify user ability to navigate between Publisher pages using Previous arrow.

Given I am at Deal_Center page
When i hit Previous_Arrow_Button
Then I should navigate to Previous Page

Scenario: TC-Discrepancies-003.4 - Verify user ability to navigate between Publisher pages by clicking on specific page number.

Given I am at Deal_Center page
When I hit The_Second_Page_Button
Then I should be redirected to page number 2 if there is pagination