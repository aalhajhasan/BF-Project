package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "public interface TargetingPositions", url = "")
public interface CachePage extends SiteCommonElements {

	@CssSelector("${pages.cache.apiClearButton}")
	public AspireWebElement apiClearButton();

	@CssSelector("${pages.cache.pulseClearButton}")
	public AspireWebElement pulseClearButton();

	@CssSelector("${pages.cache.publyticsClearButton}")
	public AspireWebElement publyticsClearButton();

	@CssSelector("${pages.cache.campaignListClearButton}")
	public AspireWebElement campaignListClearButton();

	@CssSelector("${pages.cache.cacheOption}")
	public AspireWebElement cacheOption();

	@CssSelector("${pages.cache.pages.cache}")
	public AspireWebElement cache();

	@CssSelector("${pages.cache.pages.cacheTextSection}")
	public AspireWebElements cacheTextSection();

	@CssSelector("${pages.cache.pages.clearButtons}")
	public AspireWebElement clearButtons();
	
	@CssSelector("${pages.cache.firstData}")
	public AspireWebElement firstData();
	
	@CssSelector("${pages.cache.secondData}")
	public AspireWebElement secondData();
	
	@CssSelector("${pages.cache.thirdData}")
	public AspireWebElement thirdData();
	
	@CssSelector("${pages.cache.forthData}")
	public AspireWebElement forthData();
	

}