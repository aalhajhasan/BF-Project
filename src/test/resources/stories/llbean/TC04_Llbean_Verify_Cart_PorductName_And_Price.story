Meta:
@ReportName L.L.Bean

Scenario: TC04_Llbean_Verify_Cart_PorductName_And_Price

Given [1101-1080] llbeanPdp should be displayed
When [8013-0003] user randomly select an available llbeanSizeGroup
And [8013-0003] user randomly select an available llbeanSize
And [8013-0003] user randomly select an available llbeanColor
And [1101-1181] the user saves llbeanPdpPrice text in global scope under name llbeanPdpNewPrice
And [1100-1400] Execute `click` javascript on llbeanAddToBag
And [1111-1080] llbeanBagDialog should be displayed, Within 120 seconds
And [1100-1360] User move mouse to llbeanShoppingBag
Then [1101-1140] llbeanBagName text should contain `llbeanProductName`
And [1101-1140] llbeanBagPrice text should contain `llbeanPdpNewPrice`