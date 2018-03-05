@namedItAs login

Scenario: TC01_Login

Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens gilt page
And [1111-1000] signInLink should be clickable, Within 120 seconds
And [1100-0300] User click on it
And [1100-1340] User fills loginEmailSection with `validEmail`
And [1100-1340] User fills loginPasswordSection with `validPassword`
And [1100-1300] User clicks on the loginSubmitButton
Then [1111-1080] accountIcon should be displayed, Within 120 seconds