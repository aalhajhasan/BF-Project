@DependOn |plp|0|

@namedItAs pdp1

Scenario: TC03_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the viewMoreDetails
When [1111-1080] pdpPage should be displayed, Within 120 seconds
Then [1101-1100] pdpProductPrice text should equal to `productPrice`
And [1101-1100] pdpProductName text should equal to `productName`