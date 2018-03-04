Meta:
@Properties
Scenario: TC-Specific Property-010- Verify user ability edit global ad unit setting.

Given I am On Integrations_Page
When I add new publisher
And I add new Property
And I search for the property
And check if the newly added item is visible on screen
And I Click on Specific_Property
And I want to click on tab : Config
And I click on expandIndicator
Then I make change on global ad unit setting (edit) and verify changes
And I make change on global ad unit setting (Push_it_live) and verify changes
And I make change on global ad unit setting (Edit_after_Push) and verify changes
And I make change on global ad unit setting (Remove_From_live) and verify changes
And I make change on global ad unit setting (Discard_Draft) and verify changes