Scenario:  tetst
Given [1000-9100] User navigate to https://www.saksfifthavenue.com/main/ProductDetail.jsp?FOLDER%3C%3Efolder_id=2534374306646142&PRODUCT%3C%3Eprd_id=845524447201022&R=8432902522823&P_name=Loewe&N=306646142&bmUID=m8sJ3lR URL
When [1200-1302-S] For any element from availableColor
And [1100-0300-S] User click on it
And [1200-1302-S] For any element from availableSKU
And [1100-0300-S] User click on it
And [1101-1181] the user saves pdpProductPrice text in global scope under name pdpPrice
And [1101-1181] the user saves pdpProductName text in global scope under name pdpProductName
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] shoppingBag should be displayed, Within 120 seconds
And [1100-1581] the user saves bagQTY attribute of innerText in global scope under name bagQTY
And [8002-0004] user check `bagQTY` with 2
And [1101-1181] the user saves bagProductPrice text in global scope under name bagPrice
Then [8002-0002] User compare between `bagPrice` and `pdpPrice`