Meta:
@ReportName Party City Canada

Scenario:  TC04_Partycitycanada_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] partycityPdp should be displayed
When [1100-1371] User moves mouse to partycityCart and click on partycityViewBasket
And [1111-1080] partycityCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves partycityCartPriceB text in global scope under name partycityCartPriceB
And [1100-1340] User fills partycityCartQuantity with 2
And [1100-1300] User clicks on the partycityCartUpdate
And [8019-0001] sleep after last action for 3000 Milliseconds
And [1101-1181] the user saves partycityCartPriceA text in global scope under name partycityCartPriceA
And [8019-0005] User hits `partycityCartPriceB` with 2
Then [8019-0006] User compare between `partycityCartPriceB` and `partycityCartPriceA`
And [1100-1340] User fills partycityCartQuantity with 1
And [1100-1300] User clicks on the partycityCartUpdate