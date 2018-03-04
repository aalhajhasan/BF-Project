Meta:
@Properties
Scenario:TC-Specific Property-001- Verify user ability to navigate to a specific property and verify page elements

Given I am On Integrations_Page
When I want to click on tab : Properties
And I Click on Specific_Property
Then I should be led to Specific_Property page
And I verify that the default selected tab is Overview
And I verify that Overview_Tab is highlighted in green
And I verify BreadCrumb_Navigate_Back displays
And I verify Search_Box displays
And I verify Export_Button displays
And I verify Bookmark_Icon displays
And I verify Drawers_List displays
And I verify Pagination_Module displays
And I verify Add_AdSlot_Button displays
And I verify Archived_Filter displays
And I verify Format_Filter displays
And I verify Platform_Filter displays
And I verify Ad Solts table columns under the property name