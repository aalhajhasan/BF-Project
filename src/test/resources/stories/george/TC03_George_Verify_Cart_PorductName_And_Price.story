Meta:
@ReportName Pacsun

Scenario:  TC03_George_Verify_Cart_PorductName_And_Price

Then [1111-1080] georgePDP should be displayed, Within 120 seconds
And [1101-1140] georgePdpName text should contain `georgeProductsName`
And [1101-1140] georgePdpPrice text should contain `georgeProductsPrice`
And [1100-1581] the user saves georgePdpImage attribute of src in global scope under name georgePdpImage
And [1100-1380] User double click on the georgeAddToBasket
And [1200-1302] For any element from georgeSelectSize
And [1100-0360] User move mouse to it
And [1100-0400] Execute `click` javascript on the element
And [8032-0001] sleep after last action for 3000 Milliseconds
!-- And [1100-1321] User scroll to the georgeAddToBasket then click it
!-- Then [1111-1080] georgeCheckBasket should be displayed, Within 120 seconds