Meta:
@DependOn |login|0|

Scenario: TC-Specific Publisher-002- Verify User Ability to bookmark a specific publisher and verify the functionality

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the First Item On Publisher
And [1111-1080] Bookmark Icon should be displayed, Within 10 seconds
And [1101-1187] save Bookmark Header text in step scope under name Marked
And [1100-1300] User clicks on the Bookmark Icon
And [1111-1430] Bookmark Icon should have color css attribute contain rgb(255, 117, 0), Within 20 seconds
And [1100-1300] User clicks on the Bookmark Icon
And [1100-1300] User clicks on the bookmarkIconTopNav
Then [8001-0002] verify the firstBookedItem contains this `Marked`


