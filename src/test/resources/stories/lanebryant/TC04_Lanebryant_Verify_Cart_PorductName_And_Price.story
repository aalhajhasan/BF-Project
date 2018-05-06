Meta:
@ReportName Lane Bryant Brands

Scenario:  TC04_Lanebryant_Verify_Cart_PorductName_And_Price

Given [1101-1080] lanebryantPdp should be displayed
When [8016-0003] user randomly select an available lanebryantColor
!-- And [8016-0003] user randomly select an available lanebryantSizeGroup
And [8016-0003] user randomly select an available lanebryantSize
And [1100-1300] User clicks on the lanebryantAddToBag
And [1111-1080] lanebryantBagDialog should be displayed, Within 120 seconds
Then [1101-1140] lanebryantBagName text should contain `lanebryantProductName`
And [1101-1140] lanebryantBagPrice text should contain `lanebryantProductPrice`