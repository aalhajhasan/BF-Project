Meta:
@Properties
Scenario: TC-Specific Property-005- Verify user ability to search for an ad slot under a specific property page

Given I am On Integrations_Page_Properties_Tab
When click on Properties Have Ad Slots
And I type keyword at Search_Box
Then verify the First_Cell_In_The_Table contains this keyword