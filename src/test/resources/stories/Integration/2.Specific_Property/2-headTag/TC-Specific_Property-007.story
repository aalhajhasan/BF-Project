Meta:
@Properties
Scenario: TC-Specific Property-009- Verify User ability to export the ad tag under specific property

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
And I want to click on tab : Head Tag
And I calculate number of downloaded folders
And I Click on Download_Ad_Tag_Button
Then I verify downloded folders incremented