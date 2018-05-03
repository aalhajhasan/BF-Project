Meta:
@ReportName Eddie Bauer

Scenario:  TC02_Eddiebauer_Verify_PDP_ProductName_And_Price

Given [1000-9001] User on eddiebauer page
When [1211-1000] eddiebauerTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] eddiebauerSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from eddiebauerSales
And [1100-0400] Execute `click` javascript on the element
And [1211-1000] eddiebauerProducts should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1101-1181] the user saves eddiebauerProductPrice text in global scope under name eddiebauerProductPrice
And [1100-1581] the user saves eddiebauerProductImage attribute of src in global scope under name eddiebauerProductImage
And [1101-1181] the user saves eddiebauerProductName text in global scope under name eddiebauerProductName
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] eddiebauerPdp should be displayed, Within 120 seconds
And [1101-1181] the user saves eddiebauerPdpName text in global scope under name eddiebauerPdpName
And [5101-1102] verify that text `eddiebauerProductName` contains `eddiebauerPdpName`
And [1101-1181] the user saves eddiebauerPdpPrice text in global scope under name eddiebauerPdpPrice
And [1100-1581] the user saves eddiebauerPdpImage attribute of href in global scope under name eddiebauerPdpImage
Then [8017-0002] verify that the value of `eddiebauerProductPrice` equals to the value of `eddiebauerPdpPrice`
