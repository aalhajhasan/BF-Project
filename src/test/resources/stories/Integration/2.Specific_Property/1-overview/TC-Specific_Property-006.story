Meta:
@Properties
Scenario: TC-Specific Property-006- Verify User ability to download ad tags under a specific property

Given I am On Integrations_Page_Properties_Tab
When click on Properties Have Ad Slots
And I calculate number of downloaded folders
And I Click on Download_Ad_Tags_Button
Then I verify downloded folders incremented