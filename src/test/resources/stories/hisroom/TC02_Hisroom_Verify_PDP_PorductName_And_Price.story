Meta:
@ReportName His Room

Scenario:  TC02_HisRoom_Verify_PDP_PorductName_And_Price

Given [1000-9001] User on hisroom page
When [1200-1302] For any element from hisroomTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] hisroomProducts should be all displayed, Within 120 seconds
And [1200-0302] For any of the elements
And [1101-1181] the user saves hisroomProductName text in global scope under name hisroomProductName
And [1101-1181] the user saves hisroomProductPrice text in global scope under name hisroomProductPrice
And [1100-1581] the user saves hisroomProductImage attribute of src in global scope under name hisroomProductImage
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] hisroomPdp should be displayed, Within 120 seconds
And [1101-1181] the user saves hisroomPdpName text in global scope under name hisroomPdpName
And [1101-1181] the user saves hisroomPdpPrice text in global scope under name hisroomPdpPrice
And [1100-1581] the user saves hisroomPdpImage attribute of src in global scope under name hisroomPdpImage
!-- And [5101-1103] verify that text `hisroomPdpName` starts with text `hisroomProductName`
Then [8024-0001] User compare between `hisroomProductPrice` and `hisroomPdpPrice`