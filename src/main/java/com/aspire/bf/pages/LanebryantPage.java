package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "lanebryant", url = "${pages.lanebryant.lanebryantUrl}")
public interface LanebryantPage {

	@CssSelector("${pages.gilt.giltRegisterLink}")
	public AspireWebElement giltRegisterLink();
	
	
}
