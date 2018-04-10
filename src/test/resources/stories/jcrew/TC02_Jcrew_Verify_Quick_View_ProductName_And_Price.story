Meta:
@ReportName Jcrew

Scenario:  TC02_Jcrew_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on jcrew page
When [1200-1302] For any element from jcrewTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] jcrewSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from jcrewSales
And [1100-0400] Execute `click` javascript on the element
And [8010-0001] user search for jcrewProducts
And [1200-1302] For any element from jcrewProducts
And [1101-1181] the user saves jcrewPlpItemName text in global scope under name jcrewPlpItemName
And [1100-1581] the user saves jcrewPlpItemImage attribute of src in global scope under name jcrewPlpItemImage
And [1101-1181] the user saves jcrewPlpItemPrice text in global scope under name jcrewPlpItemPrice
And [1100-0360] User move mouse to it
And [1100-1300] User clicks on the jcrewQuickShop
And [1111-1080] jcrewQuickShopDialog should be displayed, Within 120 seconds
And [1101-1140] jcrewQuickShopItemName text should contain `jcrewPlpItemName`
And [1101-1181] the user saves jcrewQuickShopItemPrice text in global scope under name jcrewQuickShopItemPrice
And [1100-1581] the user saves jcrewQuickShopItemImage attribute of src in global scope under name jcrewQuickShopItemImage
Then [8010-0002] User compare between `jcrewPlpItemPrice` and `jcrewQuickShopItemPrice`