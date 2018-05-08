Meta:
@ReportName Sephora

Scenario:  TC01_Sephora_Verify_Quick_View_ProductName_And_Price

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens sephora page
And [1100-1400] Execute `click` javascript on sephoraTopNav
And [1200-1302] For any element from sephoraSales
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] sephoraProducts should be all displayed, Within 120 seconds
And [1200-0302] For any of the elements
And [1101-1181] the user saves sephoraProductName text in global scope under name sephoraProductName
And [1101-1181] the user saves sephoraProductPrice text in global scope under name sephoraProductPrice
And [1100-1581] the user saves sephoraProductImage attribute of src in global scope under name sephoraProductImage
And [1100-0371] User move mouse to it and click on sephoraProductQickLook
And [1111-1080] sephoraQickLook should be displayed, Within 120 seconds
And [1101-1181] the user saves sephoraQickLookName text in global scope under name sephoraQickLookName
And [5100-2106] convert text `sephoraProductName` to lower and tag it as sephoraProductNameL
And [5100-2106] convert text `sephoraQickLookName` to lower and tag it as sephoraQickLookNameL
Then [5101-1102] verify that text `sephoraProductNameL` contains `sephoraQickLookNameL`
And [1101-1181] the user saves sephoraQickLookPrice text in global scope under name sephoraQickLookPrice
And [1100-1581] the user saves sephoraQickLookImage attribute of src in global scope under name sephoraQickLookImage
And [8022-0002] User compare between `sephoraProductPrice` and `sephoraQickLookPrice`