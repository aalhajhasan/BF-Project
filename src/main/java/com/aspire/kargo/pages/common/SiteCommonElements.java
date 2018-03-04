package com.aspire.kargo.pages.common;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "siteCommonElements", url = "")
public interface SiteCommonElements {

	@CssSelector("${pages.site.main.searchBox}")
	public AspireWebElement searchBox();

	@CssSelector("${pages.site.main.exportButton}")
	public AspireWebElement exportButton();

	@CssSelector("${pages.site.main.actionButton}")
	public AspireWebElement actionButton();

	@CssSelector("${pages.site.main.paginationModule}")
	public AspireWebElement paginationModule();

	@CssSelector("${pages.site.main.firstColumn}")
	public AspireWebElement firstColumn();

	@CssSelector("${pages.site.main.secondColumn}")
	public AspireWebElement secondColumn();

	@CssSelector("${pages.site.main.thirdColumn}")
	public AspireWebElement thirdColumn();

	@CssSelector("${pages.site.main.forthColumn}")
	public AspireWebElement forthColumn();

	@CssSelector("${pages.site.main.fifthColumn}")
	public AspireWebElement fifthColumn();

	@CssSelector("${pages.site.main.sixthColumn}")
	public AspireWebElement sixthColumn();

	@CssSelector("${pages.site.main.seventhColumn}")
	public AspireWebElement seventhColumn();

	@CssSelector("${pages.site.main.eightthColumn}")
	public AspireWebElement eightthColumn();

	@CssSelector("${pages.site.main.ninthColumn}")
	public AspireWebElement ninthColumn();

	@CssSelector("pages.site.main.tenthColumn${}")
	public AspireWebElement tenthColumn();

	@CssSelector("${pages.site.main.elevenColumn }")
	public AspireWebElement elevenColumn();

	@CssSelector("${pages.site.main.firstOption}")
	public AspireWebElement firstOption();

	@CssSelector("${pages.site.main.submitButton}")
	public AspireWebElement submitButton();

	@CssSelector("${pages.site.main.progressDialog}")
	public AspireWebElement progressDialog();

	@CssSelector("${pages.site.main.firstCell}")
	public AspireWebElement firstCell();

	@CssSelector("${pages.site.main.noDataFound}")
	public AspireWebElement noDataFound();

	@CssSelector("${pages.site.main.activeTab}")
	public AspireWebElement activeTab();

	@CssSelector("${pages.site.main.returnedRows}")
	public AspireWebElements returnedRows();

	@CssSelector("${pages.site.main.modalDialogAcceptButton}")
	public AspireWebElement modalDialogAcceptButton();

	@CssSelector("${pages.site.main.getItemsPerPage75Button}")
	public AspireWebElement getItemsPerPage75Button();

	@CssSelector("${pages.site.main.getItemsPerPage100Button}")
	public AspireWebElement getItemsPerPage100Button();
	
	@CssSelector("${pages.site.main.previousArrowButton}")
	public AspireWebElement previousArrowButton();
	
	@CssSelector("${pages.site.main.nextArrowButton}")
	public AspireWebElement nextArrowButton();
	
	@CssSelector("${pages.site.main.nextArrow}")
	public AspireWebElement nextArrow();
	
	@CssSelector("${pages.site.main.secondPageButton}")
	public AspireWebElements secondPageButton();
	
	@CssSelector("${pages.site.main.activeNumber}")
	public AspireWebElement activeNumber();
	
	@CssSelector("${pages.site.main.pageTitle}")
	public AspireWebElement pageTitle();
	
	@CssSelector("${pages.site.main.keyword}")
	public AspireWebElement keyword();
	
	@CssSelector("${pages.site.main.AllCompanies}")
	public AspireWebElement AllCompanies();
	
	@CssSelector("${pages.site.main.table}")
	public AspireWebElement table();
	
	
	@CssSelector("${pages.site.main.allDataForFirstCoulmn}")
	public AspireWebElements allDataForFirstCoulmn();
	
	@CssSelector("${pages.site.main.row75}")
	public AspireWebElement row75();
	
	
	@CssSelector("${pages.site.main.row100}")
	public AspireWebElement row100();
	
	@CssSelector("${pages.site.main.firstColumnData}")
	public AspireWebElements firstColumnData();
	
	@CssSelector("${pages.site.main.firstRow}")
	public AspireWebElement firstRow();
	
	@CssSelector("${pages.site.main.secondtRow}")
	public AspireWebElement secondtRow();
	
	@CssSelector("${pages.site.main.thirdRow}")
	public AspireWebElement thirdRow();
	
	@CssSelector("${pages.site.main.forthRow}")
	public AspireWebElement forthRow();
	
	@CssSelector("${pages.site.main.fifthtRow}")
	public AspireWebElement fifthtRow();
	
	@CssSelector("${pages.site.main.sixthRow}")
	public AspireWebElement sixthRow();
	
	@CssSelector("${pages.site.main.headerTitle}")
	public AspireWebElement headerTitle();

	
	@CssSelector("${pages.site.main.teamWidget}")
	public AspireWebElement teamWidget();
	
	@CssSelector("${pages.site.main.teamWidgetItems}")
	public AspireWebElements teamWidgetItems();
	
	@CssSelector("${pages.site.main.approvedForDirectCheckBox}")
	public AspireWebElement approvedForDirectCheckBox();
	
	@CssSelector("${pages.site.main.defaultOptionFromFilter}")
	public AspireWebElement defaultOptionFromFilter();
	
	
	@CssSelector("${pages.site.main.thirdCloumnData}")
	public AspireWebElements thirdCloumnData();
	
	
	
	
}