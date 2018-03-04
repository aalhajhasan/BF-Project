Meta:
@reports
Scenario: TC-Deal_Center-007.1 - Verify user ability to navigate to specific deal

Given I am On Reports_Page
When I click on Deal_Center_Button
And I click on dateRangePicker_label
And change date range to get data
And I Click on specific_deal
Then I should be led to specific deal page
And I verify revenue_filter displays
And I verify Select_filter displays
And I click on dateRangePicker_label
And I verify dateRangePicker_body displays
And I verify deal_information_section displays
And I verify deal center table header

Scenario: TC-Deal_Center-007.2 - check selecting a preset custom date range with the Date Shortcut functionality


Given I am at specific_deal_Page
When I click on Date_Shortcut_label
Then check value of Date_Shortcut_label is Date Shortcut
And I verify date range equal beforeMonth to todayDate
And I click on Today_option
And I verify date range equal Today to todayDate
And I click on Date_Shortcut_label
And I click on Yesterday_option
And I verify date range equal Yesterday to YesterdayDate
And I click on Date_Shortcut_label
And I click on Week_to_Date_option
And I verify date range equal week to todayDate
And I click on Date_Shortcut_label
And I click on Month_to_Date_option
And I verify date range equal month to todayDate
And I click on Date_Shortcut_label
And I scroll to Quarter_to_Date_option
And I click on Quarter_to_Date_option
And I verify date range equal Quarter to todayDate
And I click on Date_Shortcut_label
And I scroll to Year_to_Date_option
And I click on Year_to_Date_option
And I verify date range equal Year to todayDate


Scenario: TC-Deal_Center-007.3 - Verify export button displays and working fine at specific Deal_Center page.

Given I am at specific_deal_Page
When I calculate number of downloaded folders
And I Click on Export_Button
And I wait progress dialog to disappear
Then I verify downloded folders incremented
