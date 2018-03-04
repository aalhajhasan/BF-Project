Meta:
@Properties
Scenario: TC-Specific Property-015 Verify User ability to Navigate to Activity Tab and Verify Tab Elements.

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
Then I should be led to Specific_Property page
And I want to click on tab : Activity
And I verify that the default selected tab is Activity
And I verify that Activity_Tab is highlighted in green
And I verify Search_Box displays
And I verify Export_Button displays
And I verify Calender displays
And I Verify all columns at Activity tab are displaying