Meta:
@ReportName Pacsun

Scenario:  TC06_Pacsun_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] pacsunCartPage should be displayed
When [1200-1302] For any element from pacsunTopNav
And [1100-0360] User move mouse to it
And [1100-0300] User click on it
And [1211-1080] pacsunProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from pacsunProducts
And [1100-0300] User click on it
And [1111-1080] pacsunPdp should be displayed, Within 120 seconds
And [1100-1300] User clicks on the pacsunSizeIcon
And [8029-0002] user randomly select an available pacsunSize
And [1100-1300] User clicks on the pacsunAddToCart
And [1111-1080] pacsunCartDialog should be displayed, Within 120 seconds
And [1100-1370] User move mouse to pacsunCartIcon and click it
And [1111-1080] pacsunCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves pacsunCartPriceOne text in global scope under name pacsunCartPriceOne
And [1101-1181] the user saves pacsunCartPriceTwo text in global scope under name pacsunCartPriceTwo
And [1101-1181] the user saves pacsunCartPriceTotal text in global scope under name pacsunCartPriceTotal
Then [8029-0006] the user check the sum of `pacsunCartPriceOne` and `pacsunCartPriceTwo` with `pacsunCartPriceTotal`