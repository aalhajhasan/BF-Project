
Meta:
@DependOn |login|0|

Scenario: TC-User Companies-012.1 - Verify user disability to navigate to Publisher previous page when at page no.1.
Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the publisher
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [1101-1540] Previous Arrow Button should have class attribute contain is-disabled

Scenario: TC-User Companies-012.2 - Verify user ability to navigate between Publisher pages using Next arrow.
Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the publisher
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [8001-0009] User presses on Next Arrow Button, if page contains pagination
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [8001-0010] User should be navigated to Next Page


Scenario: TC-User Companies-012.3 - Verify user ability to navigate between Publisher pages using Previous arrow.
Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the publisher
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [8001-0009] User presses on Previous Arrow Button, if page contains pagination
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
Then [8001-0010] User should be navigated to Previous Page
