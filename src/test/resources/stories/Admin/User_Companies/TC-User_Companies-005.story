Meta:
@DependOn |login|0|


Scenario: TC-User Companies-005 - After clicking on Agency tab verify data loaded successfly  and tab highlighted in green.

Given [1000-9120] User navigate to Advertiser User Company page
When [1100-1300] User clicks on the Agency Tab
Then [1111-1430] Agency Tab should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1111-1080] Search Box should be displayed, Within 100 seconds
And [1111-1080] Add User Company Button should be displayed, Within 20 seconds
And [1111-0430] First Column css attribute should contain COMPANY, Within 10 seconds


