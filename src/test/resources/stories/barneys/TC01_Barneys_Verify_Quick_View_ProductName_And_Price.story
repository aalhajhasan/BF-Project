
Scenario:  TC01_Barneys_Verify_Quick_View_ProductName_And_Price

Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens barneys page
And [1200-1302] For any element from barneysTopNavStore
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] salesPage should be displayed, Within 120 seconds
And [1200-1302] For any element from barneysSales
And [1100-0400] Execute `click` javascript on the element