Meta:
@DependOn |login|0|

Scenario: TC-Data Lists-008 - Verify search box displays and returns correct result at Ad Slot Types page.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the ad Slot Types Link
And [1111-1010] Progress Dialog should be visible, Within 4 seconds
And [8001-0001] I type  Keyword at Search Box
Then [8001-0002] verify the Returned Rows contains this `Last Searched Data`



