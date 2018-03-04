Meta:
@Properties
Scenario: TC-Specific Property-013 Verify User ability to Navigate to Comscore Tab and Verify Tab Elements.

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
Then I should be led to Specific_Property page
And I want to click on tab : Comscore
And I verify that the default selected tab is Comscore
And I verify that Comscore_Tab is highlighted in green
And I verify Comscore_Tab_Platforms_Filter displays
And check value of Comscore_Tab_Platforms_Filter is Total mobile