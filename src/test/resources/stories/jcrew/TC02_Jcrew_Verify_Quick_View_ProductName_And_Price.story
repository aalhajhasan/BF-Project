Meta:
@ReportName Jcrew

Scenario:  TC02_Jcrew_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on jcrew page
When [1200-1302] For any element from jcrewTopNav
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from jcrewSales
And [1100-0400] Execute `click` javascript on the element
And [8010-0001] user search for jcrewProducts
And [1200-1302] For any element from jcrewProducts
And [1101-1181] the user saves plpItemName text in global scope under name plpItemName
And [1100-1581] the user saves plpItemImage attribute of src in global scope under name plpItemImage
And [1101-1181] the user saves plpItemPrice text in global scope under name plpItemPrice
And [1100-0360] User move mouse to it
And [1100-1300] User clicks on the quickShop
And [1111-1080] quickShopDialog should be displayed, Within 120 seconds
And [1101-1102] quickShopItemName text is equal to `plpItemName` case sensitive
And [1101-1181] the user saves quickShopItemPrice text in global scope under name quickShopItemPrice
And [1100-1581] the user saves quickShopItemImage attribute of src in global scope under name quickShopItemImage
Then [8010-0002] User compare between `plpItemPrice` and `quickShopItemPrice`