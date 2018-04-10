Meta:
@ReportName Bergdorf

Scenario:  TC02_Bergdorf_Verify_PDP_ProductName_And_Price

Given [1000-9001] User on bergdorf page
When [1211-1000] bergdorfTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0370] User move mouse to it and click it
And [1100-0300] User click on it
And [1201-1080] bergdorfSales should be all displayed
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [1211-1080] bergdorfProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from bergdorfProducts
And [1100-0300] User click on it
And [8012-0001] user search for bergdorfValidPdp