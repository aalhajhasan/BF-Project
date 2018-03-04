
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-001 - Verify user ability to navigate to Integrations landing page and Publishers tab selected by default.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Integration Link and click on Publishers Option
Then [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1111-1430] Publisher Tap should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1111-1080] Search Box should be displayed, Within 100 seconds
And [1111-1080] exportButton should be displayed, Within 20 seconds
And [1111-1080] Approved For Direct Filter should be displayed, Within 20 seconds
And [1111-1080] Add Publisher Button should be displayed, Within 20 seconds
And [1111-1080] Pagination Module should be displayed, Within 20 seconds
And [1101-1100] First Column text should equal to Publisher
And [1101-1100] Second Column text should equal to LOGO
And [1101-1100] Third Column text should equal to Approved For Direct
And [1101-1100] Forth Column text should equal to Tier
And [1101-1100] fifth Column text should equal to Goal Type
And [1101-1100] sixth Column text should equal to Contract Type
And [1101-1100] Seventh Column text should equal to Pacing
And [1101-1100] Eightth Column text should equal to Actions
And [1100-1300] User clicks on the Team Button
And [1111-1080] Team Widget should be displayed, Within 20 seconds
Then [1201-1032] Team Widget Items should have some elements


