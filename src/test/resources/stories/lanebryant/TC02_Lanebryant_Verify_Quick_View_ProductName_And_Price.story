Meta:
@ReportName Lane Bryant Brands

Scenario:  TC02_Lanebryant_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on lanebryant page
When [1200-1302] For any element from lanebryantSales
And [1100-0360] User move mouse to it
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] lanebryantProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from lanebryantProducts
And [1101-1181] the user saves lanebryantProductName text in global scope under name lanebryantProductName
And [1101-1181] the user saves lanebryantProductPrice text in global scope under name lanebryantProductPrice
And [1100-1581] the user saves lanebryantProductImage attribute of src in global scope under name lanebryantProductImage
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on lanebryantProductQuickView
And [8016-0001] sleep after last action for 10000 Milliseconds
And [1111-1080] lanebryantQuickViewDialog should be displayed, Within 120 seconds
Then [1101-1140] lanebryantQuickViewProductName text should contain `lanebryantProductName`
And [1101-1140] lanebryantQuickViewProductPrice text should contain `lanebryantProductPrice`
And [1100-1581] the user saves lanebryantQuickViewProductImage attribute of src in global scope under name lanebryantQuickViewProductImage