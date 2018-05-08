Meta:
@ReportName Sephora

Scenario:  TC03_Sephora_Verify_Cart_PorductName_And_Price

Given [1101-1080] sephoraPdp should be displayed
When [1100-1400] Execute `click` javascript on sephoraAddToBasket
And [1111-1080] sephoraBasketDialog should be displayed, Within 120 seconds
Then [1101-1140] sephoraBasketName text should contain `sephoraProductName`
And [1101-1181] the user saves sephoraBasketPrice text in global scope under name sephoraBasketPrice
And [8022-0002] User compare between `sephoraProductPrice` and `sephoraBasketPrice`