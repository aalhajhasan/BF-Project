Meta:
@reports
Scenario: TC-Discrepancies-005.1 - Verify user ability to navigate throw path (pub> property> Ad slot)

Given I am On Reports_Page
When I click on Discrepancies_Button
And I click on Discrepancies_Page_Calendar
And change date range at Discrepancies page to get data
And I Click on Discrepancies_Specific_Publisher
Then I verify Discrepancies_By_Property table header
And click on the first chevron beside property name name
And I verify Discrepancies by_Property_SubTable columns



Scenario: TC-Discrepancies-005.2 - verify Discrepancies_by_property_SubTable collapsed 

Given I am at Discrepancies Page
When i click on chevron X_Button_At_Table
Then I verify Discrepancies_by_Property_Sub table collapse




Scenario: TC-Discrepancies-005.3 - verify Discrepancies_by_Ad slot_SubTable is expanded

Given I am at Discrepancies Page
When I click on Discrepancies_Specific_Property
Then I verify Discrepancies_By_Ad_Slot table header
And click on the first chevron beside Ad slot name name
And I verify Discrepancies by_Property_SubTable columns


Scenario: TC-Discrepancies-005.4 - verify Discrepancies_by_AdSlot_SubTable collapsed 

Given I am at Discrepancies Page
When i click on chevron X_Button_At_Table
Then I verify Discrepancies_by_AdSlot_Sub table collapse