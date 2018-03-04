Meta:
@Properties
Scenario: TC-Specific Property-021- Verify History is updated when editing any entry in drawers

Given I am On Integrations_Page_Properties_Tab
When I Fill Search_Box:Automation
And wait progress dialog to disappear
And I Click on Specific_Property
And I wait for page title
And I Click on History_Icon
And check the number of rows in history drawer
And I click on Unarchive/Archive_property_button
And I click on modal_Dialog_accept_button
And I wait progress dialog to disappear
And I wait for page title
And I scroll to Page_Title
And I Click on History_Icon
Then verify the action added to the history table