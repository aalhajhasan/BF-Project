Meta:
@ReportName Eddie Bauer

Scenario: TC03_Eddiebauer_Verify_Cart_PorductName_And_Price

Given [1101-1080] eddiebauerPdp should be displayed
When [8017-0003] user randomly select an available eddiebauerSize
And [8017-0003] user randomly select an available eddiebauerColor
And [1100-1400] Execute `click` javascript on eddiebauerAddToBag
And [1111-1080] eddiebauerQuickView should be displayed, Within 120 seconds
And [1101-1181] the user saves eddiebauerQuickViewPrice text in global scope under name eddiebauerQuickViewPrice
And [1100-1581] the user saves eddiebauerQuickViewImage attribute of src in global scope under name eddiebauerQuickViewImage
And [1101-1181] the user saves eddiebauerQuickViewName text in global scope under name eddiebauerQuickViewName
And [5100-2106] convert text `eddiebauerPdpName` to lower and tag it as eddiebauerPdpNameL
And [5100-2106] convert text `eddiebauerQuickViewName` to lower and tag it as eddiebauerQuickViewNameL
Then [5101-1102] verify that text `eddiebauerPdpNameL` contains `eddiebauerQuickViewNameL`
And [8017-0002] verify that the value of `eddiebauerPdpPrice` equals to the value of `eddiebauerQuickViewPrice`
And [8014-0004] user compare between `eddiebauerProductImage` , `eddiebauerPdpImage` and `eddiebauerQuickViewImage`