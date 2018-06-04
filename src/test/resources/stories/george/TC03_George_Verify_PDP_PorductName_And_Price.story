Meta:
@ReportName George

Scenario: TC03_George_Verify_PDP_PorductName_And_Price

Given [1101-1080] georgePDP should be displayed
!-- When [1101-1140] georgePdpName text should contain `georgeProductsName`
!-- And [1101-1140] georgePdpPrice text should contain `georgeProductsPrice`
!-- And [8009-0009] user search for georgeValidPdp
When [1100-1581] the user saves georgePdpImage attribute of style in global scope under name georgePdpImage
Then [8032-0002] user compare between `georgeProductsImage` and `georgePdpImage`