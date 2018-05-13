Meta:
@ReportName Her Room

Scenario:  TC03_herroom_Verify_Cart_PorductName_And_Price

Given [1101-1080] herroomPdp should be displayed
When [8033-0002] user randomly select an available herroomSize
And [1100-1400] Execute `click` javascript on herroomSizeCloseDialog
And [8033-0002] user randomly select an available herroomColor
And [1101-1181] the user saves herroomPdpNetPrice text in global scope under name herroomPdpNetPrice
And [1100-1400] Execute `click` javascript on herroomAddToShoppingBag
And [8033-0003] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on herroomCartCheckout
And [1111-1080] herroomCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves herroomCartPrice text in global scope under name herroomCartPrice
And [1101-1181] the user saves herroomCartName text in global scope under name herroomCartName
!-- And [5101-1103] verify that text `herroomPdpName` starts with text `herroomCartName`
Then [8033-0001] User compare between `herroomProductPrice` and `herroomPdpNetPrice`