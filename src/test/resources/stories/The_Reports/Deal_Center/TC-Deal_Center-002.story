Meta:
@DependOn |login|0|
Scenario: TC-Deal_Center-002 - check selecting a preset custom date range with the Date Shortcut functionality

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the dealCenterButton
And [1100-1300] User clicks on the dateShortcutLabel


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