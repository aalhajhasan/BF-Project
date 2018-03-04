Meta:
@DependOn |login|0|

Scenario: TC-User Companies-010-1 - Verify user ability to add publisher company and unable to add an exist publisher.
Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the publisher
Then [8003-0007] I add the Company if it's not exist at company