Meta:
@Properties
Scenario: TC-Specific_Property-029 - integration status Indicator color

Given I am On Integrations_Page
When I add new publisher
And I add new Property
And I search for the property
And check if the newly added item is visible on screen
And I click on Specific_Property
And User add new ad slot
And I want to click on tab : Store Management
Then integration status Indicator color should red
And I click on Edit_Monthly_Capacity_Button
Then I verify that the default selected tab is Capacity
And I want to click on tab : Config
And I Click on AdSlot_SiteSkin_Arrow
And I Click on AdSlot_SiteSkin_EditButton
And I Click on Global_PerAdSlot_SaveDraftButton
And I Click on BreadCrumb_Navigate_Back
And I want to click on tab : Store Management
And integration status Indicator color should yellow
And I click on Edit_Monthly_Capacity_Button
And I want to click on tab : Config
And I Click on AdSlot_SiteSkin_Arrow
And I Click on PushLive_Button
And I Click on BreadCrumb_Navigate_Back
And I want to click on tab : Store Management
And integration status Indicator color should green