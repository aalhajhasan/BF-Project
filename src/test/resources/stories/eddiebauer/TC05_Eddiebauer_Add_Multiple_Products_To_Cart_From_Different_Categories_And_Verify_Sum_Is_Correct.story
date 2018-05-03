Meta:
@ReportName Eddie Bauer

Scenario:  TC05_Eddiebauer_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] eddiebauerBagPage should be displayed
When [1211-1000] eddiebauerTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] eddiebauerSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from eddiebauerSales
And [1100-0400] Execute `click` javascript on the element
And [1211-1000] eddiebauerProducts should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [1111-1080] eddiebauerPdp should be displayed, Within 120 seconds
And [8017-0003] user randomly select an available eddiebauerSize
And [8017-0003] user randomly select an available eddiebauerColor
And [1100-1400] Execute `click` javascript on eddiebauerAddToBag
And [1111-1080] eddiebauerQuickView should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on eddiebauerQuickViewCheckout
And [1111-1080] eddiebauerBagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves eddiebauerBagItemOnePrice text in global scope under name eddiebauerBagItemOnePrice
And [1101-1181] the user saves eddiebauerBagItemTwoPrice text in global scope under name eddiebauerBagItemTwoPrice
And [1101-1181] the user saves eddiebauerBagTotelPrice text in global scope under name eddiebauerBagTotelPrice
Then [8017-0007] `eddiebauerBagTotelPrice` value should be equal to the summation of `eddiebauerBagItemOnePrice` and `eddiebauerBagItemTwoPrice`