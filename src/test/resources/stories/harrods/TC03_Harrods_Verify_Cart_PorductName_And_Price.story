Meta:
@ReportName Harrods

Scenario:  TC03_Harrods_Verify_Cart_PorductName_And_Price

Given [1101-1080] harrodsProductPage should be displayed
When [1100-1300] User clicks on the harrodsAddToBagButton
And [1111-1080] harrodsViewYourBag should be displayed, Within 120 seconds
And [1100-0300] User click on it
And [1111-1080] harrodsBagPage should be displayed, Within 120 seconds
Then [1101-1140] harrodsBagProductPrice text should contain `harrodsProductPrice`