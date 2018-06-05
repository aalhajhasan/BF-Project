Meta:
@ReportName Party City Canada

Scenario:  TC05_Partycitycanada_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] partycityCartPage should be displayed
When [1200-1302] For any element from partycityTopNavCat
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from partycityTopNavSubCat
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from partycityCategory
And [1100-0400] Execute `click` javascript on the element
And [8019-0002] user search for partycityPlp
And [1200-1302] For any element from partycityProducts
And [1100-0300] User click on it
And [1111-1080] partycityPdp should be displayed, Within 120 seconds
And [8019-0004] user randomly select an available partycityColors
And [1100-1400] Execute `click` javascript on partycityAddToBasket
And [1111-1080] partycityCartDialog should be displayed, Within 120 seconds
And [1100-1371] User moves mouse to partycityCart and click on partycityViewBasket
And [1111-1080] partycityCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves partycityCartPriceOne text in global scope under name partycityCartPriceOne
And [1101-1181] the user saves partycityCartPriceTwo text in global scope under name partycityCartPriceTwo
And [1101-1181] the user saves partycityCartPriceTotal text in global scope under name partycityCartPriceTotal
Then [8019-0007] the user check the sum of `partycityCartPriceOne` and `partycityCartPriceTwo` with `partycityCartPriceTotal`




