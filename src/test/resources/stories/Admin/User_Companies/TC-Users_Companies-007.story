Meta:
@DependOn |login|0|

Scenario: TC-User Companies-007-1 - Verify  user ability to add  Agency Company and unable to add an exist Agency company.
Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the Agency Tab
Then [8003-0007] I add the Company if it's not exist at company
