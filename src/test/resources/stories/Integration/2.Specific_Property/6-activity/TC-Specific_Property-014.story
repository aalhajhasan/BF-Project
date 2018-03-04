Meta:
@Properties
Scenario: TC-Specific Property-014- Verify export button displays and working fine at Activity tab

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
Then I should be led to Specific_Property page
And I want to click on tab : Activity
And I calculate number of downloaded folders
And I Click on Export_Button
Then I verify downloded folders incremented