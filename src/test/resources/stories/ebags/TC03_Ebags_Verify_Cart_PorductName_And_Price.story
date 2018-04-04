Meta:
@ReportName Ebags

Scenario:  TC03_Ebags_Verify_Cart_PorductName_And_Price

Given [1101-1080] pdpProductPage should be displayed
When [8006-0009] user randomly select an available color
And [1101-1181] the user saves ebagsPdpPrice text in global scope under name pdpPrice
And [1101-1181] the user saves ebagsPdpName text in global scope under name pdpName
And [1100-1300] User clicks on the addToCartButton
And [1111-1080] ebagsQuickView should be displayed, Within 120 seconds
And [1101-1181] the user saves ebagsQVPrice text in global scope under name qvPrice
And [1101-1181] the user saves ebagsQVName text in global scope under name qvName
Then [1101-1100] ebagsQVName text should equal to `pdpName`
And [8006-0002] User compare between `pdpPrice` and `qvPrice`