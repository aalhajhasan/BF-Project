Meta:
@DependOn |login|0|

Scenario: TC-Roles-02-Check the functionality of filter on Role page When select All options.
					 
Given [1000-9120] User navigate to roles page
When [1100-1300] User clicks on the Type Filter
And [1100-1300] User clicks on the All Type
Then [8002-0001] verify type filter is working fine with All option
And [8002-0001] verify type filter is working fine with Kargo option
And [8002-0001] verify type filter is working fine with Publisher option
And [8002-0001] verify type filter is working fine with Advertiser option
And [8002-0001] verify type filter is working fine with Agency option


