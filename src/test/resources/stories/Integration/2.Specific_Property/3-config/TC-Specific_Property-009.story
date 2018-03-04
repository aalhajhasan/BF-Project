Meta:
@Properties
Scenario: TC-Specific Property-009- Verify global ad unit sections are properly enabled and disabled.

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
And I want to click on tab : Config
Then I verify that the default selected tab is Config
And I verify that Config_Tab is highlighted in green
And I verify ad_Tag_Config_Info_section displays
And I verify Global(Per_Property)_Section displays
And I click on expandIndicator
And I click on Global_Settings_Button
And I verify that the Global_Settings_Section is disabled by default
And I click on Global_Conditional_Check_Button
And I verify that the Global_Conditional_Check_Section is disabled by default
And I click on Global_CSS_Button
And I verify that the Global_CSS_Section is disabled by default
And I click on Global_JavaScript_Button
And I verify that the Global_JavaScript_Section is disabled by default