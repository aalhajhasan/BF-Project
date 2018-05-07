Meta:
@ReportName Sephora

Scenario:  TC01_Sephora_Verify_Quick_View_ProductName_And_Price

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens sephora page
And [1100-1400] Execute `click` javascript on sephoraTopNav
And [1211-1080] sephoraProducts should be all displayed, Within 120 seconds