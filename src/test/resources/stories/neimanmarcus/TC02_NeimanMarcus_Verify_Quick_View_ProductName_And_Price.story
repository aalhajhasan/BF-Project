Meta:
@ReportName Neiman Marcus

Scenario:  TC02_NeimanMarcus_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on neimanmarcus page
When [1200-1302] For any element from neimanmarcusTopNav
And [1100-0360] User move mouse to it
And [1100-0300] User click on it
And [1211-1080] neimanmarcusSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from neimanmarcusSales
And [1100-0300] User click on it
And [8014-0001] user search for neimanmarcusPlpPage
And [1211-1080] neimanmarcusProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from neimanmarcusProducts
And [1101-1181] the user saves neimanmarcusProductName text in global scope under name neimanmarcusProductName
And [1101-1181] the user saves neimanmarcusProductPrice text in global scope under name neimanmarcusProductPrice
And [1100-1581] the user saves neimanmarcusProductImage attribute of src in global scope under name neimanmarcusProductImage
And [1100-0371] User move mouse to it and click on neimanmarcusProductQuickView
And [1111-1080] neimanmarcusQuickViewDialog should be displayed, Within 120 seconds
And [8015-0003] sleep after last action for 5000 Milliseconds
Then [1101-1140] neimanmarcusQuickViewProductName text should contain `neimanmarcusProductName`
And [1101-1181] the user saves neimanmarcusQuickViewProductPrice text in global scope under name neimanmarcusQuickViewProductPrice
And [8015-0006] `neimanmarcusProductPrice` and `neimanmarcusQuickViewProductPrice` should be equal
And [1100-1581] the user saves neimanmarcusQuickViewProductImage attribute of src in global scope under name neimanmarcusQuickViewProductImage