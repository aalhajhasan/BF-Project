package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "neimanmarcus", url = "${pages.neimanmarcus.neimanmarcusUrl}")
public interface NeimanMarcusPage {

	
	@CssSelector("${pages.neimanmarcus.neimanmarcusWelcomeMat}")
	public AspireWebElement neimanmarcusWelcomeMat();
	
	
}
