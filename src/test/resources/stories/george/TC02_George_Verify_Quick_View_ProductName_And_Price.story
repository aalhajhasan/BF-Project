Meta:
@ReportName George


Scenario:  TC02_George_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on george page
When [8032-0001] sleep after last action for 5000 Milliseconds
And [1200-1302] For any element from georgeTopNav
And [1100-0360] User move mouse to it
And [1100-0400] Execute `click` javascript on the element
And [8032-0001] sleep after last action for 3000 Milliseconds
And [1200-1302] For any element from categotries
And [1100-0360] User move mouse to it
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] georgeProducts should be all displayed, Within 120 seconds
And [8032-0001] sleep after last action for 3000 Milliseconds
And [1200-1302] For any element from georgeProducts
And [8032-0001] sleep after last action for 3000 Milliseconds
And [1101-1181] the user saves georgeProductsName text in global scope under name georgeProductsName
And [8032-0001] sleep after last action for 3000 Milliseconds
And [1101-1181] the user saves georgeProductsPrice text in global scope under name georgeProductsPrice
And [8032-0001] sleep after last action for 3000 Milliseconds
And [1100-1581] the user saves georgeProductsImage attribute of src in global scope under name georgeProductsImage
And [1200-1302] For any element from georgeProducts
And [1100-0360] User move mouse to it
And [1100-0400] Execute `click` javascript on the element