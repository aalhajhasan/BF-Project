Meta:
@DependOn |login|0|

Scenario: TC-User Companies-004-1 - Verify  page elements and user ability to add Advertiser and unable to add an exist Advertiser.
Given [1000-9120] User navigate to Advertiser User Company page
When [1011-0000] Page Url should contain user-companies, Within 3 seconds
Then [8003-0007] I add the Company if it's not exist at company





