Meta:
@Properties
Scenario:  TC-Specific Property-026 - Verify user ability to archive property

Given I am On Integrations_Page_Properties_Tab
When I Fill Search_Box:Automation
And wait progress dialog to disappear
And click on Properties Have Ad Slots
And I click on Unarchive/Archive_property_button
And I click on modal_Dialog_accept_button
Then check value of No_dataFound is No Properties
And I verify Unarchive/Archive_property_button is disabled
And I verify PageHeaderIsArchived displays