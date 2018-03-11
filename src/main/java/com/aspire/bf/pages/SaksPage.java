package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "saks", url = "${pages.saks.saksurl}")

public interface SaksPage {

	@CssSelector("${pages.saks.registerLink}")
	public AspireWebElement registerLink();
	
	@CssSelector("${pages.saks.registerEmailSection}")
	public AspireWebElements registerEmailSection();
	
}
