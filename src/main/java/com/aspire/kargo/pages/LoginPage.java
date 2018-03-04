package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name="login",url="${pages.login.url}")
public interface LoginPage extends SiteCommonElements{

	@CssSelector("${pages.login.username}")
	public AspireWebElement userName(); 

	@CssSelector("${pages.login.password}")
	public AspireWebElement password(); 

	@CssSelector("${pages.login.loginButton}")
	public AspireWebElement loginButton(); 

	@CssSelector("${pages.login.loginButtonStatus}")
	public AspireWebElement loginButtonStatus(); 

	@CssSelector("${pages.login.errorMessage}")
	public AspireWebElement errorMessage(); 

	@CssSelector("${pages.login.forgetMypasswordButton}")
	public AspireWebElement forgetMypasswordButton(); 

	@CssSelector("${pages.login.email}")
	public AspireWebElement email(); 

	@CssSelector("${pages.login.resetPasswordButton}")
	public AspireWebElement resetPasswordButton(); 

	@CssSelector("${pages.login.invalidEmailMessage}")
	public AspireWebElement invalidEmailMessage(); 

	@CssSelector("${pages.login.signInButton}")
	public AspireWebElement signInButton(); 

	@CssSelector("${pages.login.forgetMypasswordUsername}")
	public AspireWebElement forgetMypasswordUsername(); 

	@CssSelector("${pages.login.userAvatar}")
	public AspireWebElement userAvatar(); 

	@CssSelector("${pages.login.logOutButton}")
	public AspireWebElement logOutButton(); 

	@CssSelector("${pages.login.emailSentMessage}")
	public AspireWebElement emailSentMessage(); 

	@CssSelector("${pages.login.loginLogo}")
	public AspireWebElement loginLogo(); 

	@CssSelector("${pages.login.clickHereToResetPW}")
	public AspireWebElement clickHereToResetPW(); 

	@CssSelector("${pages.login.returnToLoginLink}")
	public AspireWebElement returnToLoginLink(); 
	
	@CssSelector("${pages.login.blazeselect}")
	public AspireWebElement blazeselect();
	
}
