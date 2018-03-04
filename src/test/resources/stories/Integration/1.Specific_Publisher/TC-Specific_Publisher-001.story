Meta:
@DependOn |login|0|

Scenario: TC-Specific Publisher-001- Verify User ability to navigate to Publisher and verify page elements.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the First Item On Publisher
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1111-1430] Overview Tab should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1111-1080] exportButton should be displayed, Within 10 seconds
And [1111-1080] Add Property Button should be displayed, Within 10 seconds
And [1111-1080] Pagination Module should be displayed, Within 10 seconds
And [1111-1080] More Filters should be displayed, Within 10 seconds
And [1111-1080] Platform Filter should be displayed, Within 10 seconds
And [1111-1080] Left Details Rail should be displayed, Within 10 seconds
And [1111-1080] Bookmark Icon should be displayed, Within 10 seconds
And [1111-1080] propertiesTableUnderPublisher should be displayed, Within 10 seconds

