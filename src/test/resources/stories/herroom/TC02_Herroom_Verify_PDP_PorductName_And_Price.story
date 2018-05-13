Meta:
@ReportName Her Room

Scenario:  TC02_herroom_Verify_PDP_PorductName_And_Price

Given [1000-9001] User on herroom page
When [1200-1302] For any element from herroomTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] herroomProducts should be all displayed, Within 120 seconds
And [1200-0302] For any of the elements
And [1101-1181] the user saves herroomProductName text in global scope under name herroomProductName
And [1101-1181] the user saves herroomProductPrice text in global scope under name herroomProductPrice
And [1100-1581] the user saves herroomProductImage attribute of src in global scope under name herroomProductImage
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] herroomPdp should be displayed, Within 120 seconds
And [1101-1181] the user saves herroomPdpName text in global scope under name herroomPdpName
And [1101-1181] the user saves herroomPdpPrice text in global scope under name herroomPdpPrice
And [1100-1581] the user saves herroomPdpImage attribute of src in global scope under name herroomPdpImage
!-- And [5101-1103] verify that text `herroomPdpName` starts with text `herroomProductName`
Then [8033-0001] User compare between `herroomProductPrice` and `herroomPdpPrice`