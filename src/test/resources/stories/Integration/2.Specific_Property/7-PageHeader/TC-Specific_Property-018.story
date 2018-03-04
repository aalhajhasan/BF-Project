Meta:
@Properties
Scenario: TC-Specific Property-018- Verify breadcrumb functionality in specific property page

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
And I Click on BreadCrumb_Back_Publisher
Then I verify that the default selected tab is Publishers
And I verify that Publishers_tab is highlighted in green