Meta:
@Properties
Scenario: TC-Specific Property-012 - Verify User ability to Navigate to Store Management Tab and Verify Tab Elements.

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
Then I should be led to Specific_Property page
And I want to click on tab : Store Management
And I verify that the default selected tab is Store Management
And I verify that Store_Management_Tab is highlighted in green
And I verify store_management_section displays