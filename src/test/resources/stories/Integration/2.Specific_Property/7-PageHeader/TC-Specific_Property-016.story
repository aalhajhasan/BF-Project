Meta:
@Properties
Scenario: TC-Specific Property-016- Verify user is able to edit notes

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
And I wait for page title
And I Click on Notes_Icon
And I Click on Edit_Button
And Edit note content
And I click on Save_Note_Button
Then check note content changed