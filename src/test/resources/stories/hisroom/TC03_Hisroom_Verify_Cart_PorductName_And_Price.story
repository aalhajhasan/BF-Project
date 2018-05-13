Meta:
@ReportName His Room

Scenario:  TC03_Hisroom_Verify_Cart_PorductName_And_Price

Given [1101-1080] hisroomPdp should be displayed
When [8024-0002] user randomly select an available hisroomSize
And [1100-1400] Execute `click` javascript on hisroomSizeCloseDialog
And [8024-0002] user randomly select an available hisroomColor
And [1101-1181] the user saves hisroomPdpNetPrice text in global scope under name hisroomPdpNetPrice
And [1100-1400] Execute `click` javascript on hisroomAddToShoppingBag
And [8024-0003] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on hisroomCartCheckout
And [1111-1080] hisroomCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves hisroomCartPrice text in global scope under name hisroomCartPrice
And [1101-1181] the user saves hisroomCartName text in global scope under name hisroomCartName
!-- And [5101-1103] verify that text `hisroomPdpName` starts with text `hisroomCartName`
Then [8024-0001] User compare between `hisroomProductPrice` and `hisroomPdpNetPrice`