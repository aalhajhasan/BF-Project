Meta:
@Properties
Scenario: TC-Specific Property-022- Verify user ability to bookmark a specific property.

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
Then I verify Bookmark_Icon displays
And I verify bookmark icon color changes to orange after clicking on it
And the booked item name should be added to bookmarks list