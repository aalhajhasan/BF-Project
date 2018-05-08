Meta:
@ReportName Sephora

Scenario:  TC05_Sephora_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] sephoraBasketPage should be displayed
When [1100-1400] Execute `click` javascript on sephoraTopNav
And [1200-1302] For any element from sephoraSales
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] sephoraProducts should be all displayed, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0371] User move mouse to it and click on sephoraProductQickLook
And [1100-1400] Execute `click` javascript on sephoraProductDetails
And [1111-1080] sephoraPdp should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on sephoraAddToBasket
And [1111-1080] sephoraBasketDialog should be displayed, Within 120 seconds
And [1100-1371] User moves mouse to sephoraBasketIcon and click on sephoraBasketCheckout
And [1111-1080] sephoraBasketPage should be displayed, Within 120 seconds
And [1101-1181] the user saves sephoraBasketItemOnePrice text in global scope under name sephoraBasketItemOnePrice
And [1101-1181] the user saves sephoraBasketItemTwoPrice text in global scope under name sephoraBasketItemTwoPrice
And [1101-1181] the user saves sephoraBasketItemsTotalPrice text in global scope under name sephoraBasketItemsTotalPrice
Then [8022-0006] the user check the sum of `sephoraBasketItemOnePrice` and `sephoraBasketItemTwoPrice` with `sephoraBasketItemsTotalPrice`