Meta:
@ReportName Sephora

Scenario:  TC04_Sephora_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] sephoraPdp should be displayed
When [1100-1371] User moves mouse to sephoraBasketIcon and click on sephoraBasketCheckout
And [1111-1080] sephoraBasketPage should be displayed, Within 120 seconds
And [1100-1600] Select sephoraBasketQuantity By Index 1
And [8022-0001] sleep after last action for 5000 Milliseconds
And [1101-1181] the user saves sephoraBasketPriceAfter text in global scope under name sephoraBasketPriceAfter
And [8022-0004] User hits `sephoraProductPrice` with 2
Then [8022-0005] User compare between `sephoraBasketPriceAfter` and `sephoraProductPrice`
And [8022-0001] sleep after last action for 5000 Milliseconds
And [1100-1600] Select sephoraBasketQuantity By Index 0