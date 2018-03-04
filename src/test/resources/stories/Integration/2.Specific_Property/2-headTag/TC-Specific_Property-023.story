Meta:
@Properties
Scenario: TC-Specific Property-023- Verify User ability to Navigate to Head Tag Tab and Verify Tab Elements

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
Then I should be led to Specific_Property page
And I want to click on tab :  Head Tag
And I verify that the default selected tab is Head Tag
And I verify BreadCrumb_Navigate_Back displays
And I verify that Head_Tag_Tab is highlighted in green
And I verify GeneratedAdTag_TextArea displays