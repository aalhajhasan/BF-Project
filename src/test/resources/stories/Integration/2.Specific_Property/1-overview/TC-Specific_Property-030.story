Meta:
@Properties
Scenario: TC-Specific Property-030- Verify user ability to add new ad slot(kraken)

Given I am On Integrations_Page
When I add new publisher
And I add new Property
And I search for the property
And check if the newly added item is visible on screen
And I click on Specific_Property
And I wait for page title
And I wait progress dialog to disappear
And I Click on Add_AdSlot_Button
And I click on AddSlot_PubPlatForm
And I click on AddSlot_PubPlatForm1option
And I click on AddSlot_AdSlotType
And I click on AddSlot_AdSlotType1option
And I fill AddSlot_AdUnitFormats: site skin and select AddSlot_AdUnitFormats1option
And I click on Has_PassBack
And I click on call_automatically
And I click on is_kraken
And I Want to enter AdSlot_DisplayName: Automation kraken AdSlot
And I Fill AddSlot_MonthlyImpressions:9
And I want to click on entry form submit button
And I search for the newly added Ad slot
And I Click on Specific_AdSlot
Then check value of AdSlot_Platform_value is Mobile Web
And check value of AdSlot_type_value is Above The Fold
And check value of AdSlot_AdUnittype_value is Site Skin
And check value of AdSlot_IntegrationType_value is Ad tag
And check value of AdSlot_CallAutomatically_value is Yes
And check value of kraken_HasPassback_value is Yes
And check value of kraken_IsKraken_value is Yes
And check value of kraken_MonthlyImpressions_value is 9
And I verify Display name equal the previously entered name