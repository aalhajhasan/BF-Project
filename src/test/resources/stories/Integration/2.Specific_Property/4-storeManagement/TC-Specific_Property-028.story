Meta:
@Properties
Scenario: TC-Specific_Property-028 - Verify User ability to approve ad format for direct/pmp

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
And I want to click on tab : Store Management
Then I Approve Ad format for Direct And PMP
And refresh the page and verify all checkboxes are checked