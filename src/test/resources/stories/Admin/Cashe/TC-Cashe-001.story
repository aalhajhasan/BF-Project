Meta:
@DependOn |login|0|

Scenario: TC-Cache-001 - Verify user ability to navigate to Cache page and verify that all elements in the page are dispaying.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Cache Option
Then [1011-0000] Page Url should contain cache, Within 3 seconds
And [1101-1100] First Data text should equal to Campaign List
And [1101-1100] Second Data text should equal to Publytics
And [1101-1100] Third Data text should equal to Pulse
And [1101-1100] Forth Data text should equal to API






