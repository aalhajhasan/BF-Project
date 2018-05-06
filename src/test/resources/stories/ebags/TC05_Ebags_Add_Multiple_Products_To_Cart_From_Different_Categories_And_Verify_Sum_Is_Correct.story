Meta:
@ReportName eBags

Scenario:  TC05_Ebags_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] ebagsCartPage should be displayed
When [1200-1302] For any element from ebagsTopNav
And [1100-0300] User click on it
And [8006-0001] user search for ebagsProducts
And [1211-1080] ebagsProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from ebagsProducts
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on ebagsItemCart
And [1111-1080] ebagsQuickView should be displayed, Within 120 seconds
And [1100-1300] User clicks on the ebagsViewCartLink
And [1111-1080] ebagsCartPage should be displayed, Within 120 seconds
And [1101-1184] the user saves ebagsBagProductOnePrice text in scenario scope under name ebagsBagProductOnePrice
And [1101-1184] the user saves ebagsBagProductTwoPrice text in scenario scope under name ebagsBagProductTwoPrice
And [1101-1184] the user saves ebagsBagSubTotalPrice text in scenario scope under name ebagsBagSubTotalPrice
Then [8006-0007] the user check the sum of `ebagsBagProductOnePrice` and `ebagsBagProductTwoPrice` with `ebagsBagSubTotalPrice`