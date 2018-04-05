Meta:
@ReportName Ebags

Scenario:  TC03_Ebags_Verify_Cart_PorductName_And_Price

Given [1101-1080] ebagsPdpProductPage should be displayed
When [8006-0009] user randomly select an available ebagsColor
And [1101-1181] the user saves ebagsPdpPrice text in global scope under name ebagsPdpPrice
And [1101-1181] the user saves ebagsPdpName text in global scope under name ebagsPdpName
And [1100-1300] User clicks on the ebagsAddToCartButton
And [1111-1080] ebagsQuickView should be displayed, Within 120 seconds
And [1101-1181] the user saves ebagsQVPrice text in global scope under name ebagsQVPrice
And [1101-1181] the user saves ebagsQVName text in global scope under name ebagsQVName
Then [1101-1100] `ebagsQVName` text should equal to `ebagsPdpName`
And [8006-0002] User compare between `ebagsPdpPrice` and `ebagsQVPrice`