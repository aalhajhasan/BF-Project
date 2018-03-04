Meta:
@Properties
Scenario: TC-Specific Property-025- Verify Platform Filter working properly.

Given I am On Integrations_Page_Properties_Tab
When click on Properties Have Ad Slots
And I wait progress dialog to disappear
And I click on Archived_Filter
And I click on All_option
Then I verify platform filter is working fine (property_page)