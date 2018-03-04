Meta:
@Properties
Scenario: TC-Specific Property-017- Verify user is able to upload a file.

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
And I wait for page title
And I Click on Files_Icon
Then I verify Files_drawer displays
And upload new file
And verify new file added