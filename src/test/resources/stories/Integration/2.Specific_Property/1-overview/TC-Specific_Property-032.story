Meta:
@Properties
Scenario: TC-Specific Property-032- Verify user ability to add new ad slot(OFF-NETWORK)

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
And I click on FIA
And I click on AddSlot_AdSlotType
And I click on AddSlot_AdSlotType1option
And I fill AddSlot_AdUnitFormats: middle banner and select AddSlot_AdUnitFormats1option
And I click on Off_Network_label
And I Want to enter AdSlot_DisplayName: Automation OFF-NETWORK AdSlot
And I want to click on entry form submit button
And I search for the newly added Ad slot
And I Click on Specific_AdSlot
Then check value of AdSlot_Platform_value is FIA
And check value of AdSlot_type_value is Middle
And check value of AdSlot_AdUnittype_value is Middle Banner
And check value of AdSlot_IntegrationType_value is Off-Network
And I verify Display name equal the previously entered name