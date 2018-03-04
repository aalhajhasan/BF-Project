Meta:
@Properties
Scenario: TC-Specific Property-003- Verify Export button is working properly under a specific property

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
And I calculate number of downloaded folders
And I Click on Export_Button
Then I verify downloded folders incremented