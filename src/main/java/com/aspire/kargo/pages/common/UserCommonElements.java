package com.aspire.kargo.pages.common;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "userCommonElements", url = "")
public interface UserCommonElements extends SiteCommonElements {

	@CssSelector("${pages.kargo.user.addUserButton}")
	public AspireWebElement addUserButton();

	@CssSelector("${pages.kargo.user.specificUserName}")
	public AspireWebElement specificUserName();

	@CssSelector("${pages.kargo.user.userEmailLeftRail}")
	public AspireWebElement userEmailLeftRail();

	@CssSelector("${pages.kargo.user.specificUserGroup}")
	public AspireWebElement specificUserGroup();

	@CssSelector("${pages.kargo.user.specificUserRole}")
	public AspireWebElement specificUserRole();

	@CssSelector("${pages.kargo.user.specificUserCompany}")
	public AspireWebElement specificUserCompany();

	@CssSelector("${pages.kargo.user.createdUser}")
	public AspireWebElement createdUser();

	@CssSelector("${pages.kargo.user.userCompanyValue}")
	public AspireWebElement userCompanyValue();

	@CssSelector("${pages.kargo.user.userEmailValue}")
	public AspireWebElement userEmailValue();

	@CssSelector("${pages.kargo.user.userAvatar}")
	public AspireWebElement userAvatar();

	@CssSelector("${pages.kargo.user.userLastLogin}")
	public AspireWebElement userLastLogin();

	@CssSelector("${pages.kargo.user.userPhoneNumber}")
	public AspireWebElement userPhoneNumber();

	@CssSelector("${pages.kargo.user.impersonateuserFromActionbutton}")
	public AspireWebElement impersonateuserFromActionbutton();

	@CssSelector("${pages.kargo.user.userIMG}")
	public AspireWebElement userIMG();

	@CssSelector("${pages.kargo.user.userPhoneNumberValue}")
	public AspireWebElement userPhoneNumberValue();

	@CssSelector("${pages.kargo.user.userInformationEmail}")
	public AspireWebElement userInformationEmail();

	@CssSelector("${pages.kargo.user.userInformationPhoneNumber}")
	public AspireWebElement userInformationPhoneNumber();

	@CssSelector("${pages.kargo.user.userInformationGroups}")
	public AspireWebElement userInformationGroups();

	@CssSelector("${pages.kargo.user.userInformationRole}")
	public AspireWebElement userInformationRole();

	@CssSelector("${pages.kargo.user.removeUserIMGButton}")
	public AspireWebElement removeUserIMGButton();

	@CssSelector("${pages.kargo.user.sendOffersCheckbox}")
	public AspireWebElement sendOffersCheckbox();

	@CssSelector("${pages.kargo.user.usersKargoTab}")
	public AspireWebElement usersKargoTab();

	@CssSelector("${pages.kargo.user.kargoTab}")
	public AspireWebElement kargoTab();

	@CssSelector("${pages.kargo.user.addusersButton}")
	public AspireWebElement addusersButton();

	@CssSelector("${pages.kargo.user.userFirstName}")
	public AspireWebElement userFirstName();

	@CssSelector("${pages.kargo.user.userLastName}")
	public AspireWebElement userLastName();

	@CssSelector("${pages.kargo.user.userEmail}")
	public AspireWebElement userEmail();

	@CssSelector("${pages.kargo.user.userCompany}")
	public AspireWebElement userCompany();

	@CssSelector("${pages.kargo.user.userFirstCompany}")
	public AspireWebElement userFirstCompany();

	@CssSelector("${pages.kargo.user.userGroup}")
	public AspireWebElement userGroup();

	@CssSelector("${pages.kargo.user.userGroupFirstOption}")
	public AspireWebElement userGroupFirstOption();

	@CssSelector("${pages.kargo.user.dataAtUserGroup}")
	public AspireWebElements dataAtUserGroup();

	@CssSelector("${pages.kargo.user.userRole}")
	public AspireWebElement userRole();

	@CssSelector("${pages.kargo.user.dataAtUserRole}")
	public AspireWebElements dataAtUserRole();

	@CssSelector("${pages.kargo.user.user1Group}")
	public AspireWebElement user1Group();

	@CssSelector("${pages.kargo.user.user1Role}")
	public AspireWebElement user1Role();

	@CssSelector("${pages.kargo.user.deleteUserFromActionButton}")
	public AspireWebElement deleteUserFromActionButton();

	@CssSelector("${pages.kargo.user.deleteBrandFromActionButton}")
	public AspireWebElement deleteBrandFromActionButton();

	@CssSelector("${pages.kargo.user.specificUser}")
	public AspireWebElement specificUser();

	@CssSelector("${pages.kargo.user.deleteUserButton}")
	public AspireWebElement deleteUserButton();

	@CssSelector("${pages.kargo.user.userInformationSection}")
	public AspireWebElement userInformationSection();

	@CssSelector("${pages.kargo.user.userNameLink}")
	public AspireWebElement userNameLink();

	@CssSelector("${pages.kargo.user.addBrandButton}")
	public AspireWebElement addBrandButton();

	@CssSelector("${pages.kargo.user.userName}")
	public AspireWebElement userName();

	@CssSelector("${pages.kargo.user.salesTeam}")
	public AspireWebElement salesTeam();

	@CssSelector("${pages.kargo.user.impersonatorName}")
	public AspireWebElement impersonatorName();

	@CssSelector("${pages.kargo.user.stopButton}")
	public AspireWebElement stopButton();

	@CssSelector("${pages.kargo.user.specificUserBrandName}")
	public AspireWebElement specificUserBrandName();

	@CssSelector("${pages.kargo.user.firstBrandName}")
	public AspireWebElement firstBrandName();

	@CssSelector("${pages.kargo.user.specificUserBrandNameValue}")
	public AspireWebElement specificUserBrandNameValue();

	@CssSelector("${pages.kargo.user.theBrandTab}")
	public AspireWebElement theBrandTab();

	@CssSelector("${pages.kargo.user.brandTab}")
	public AspireWebElement brandTab();

	@CssSelector("${pages.kargo.user.editUserIMGSection}")
	public AspireWebElement editUserIMGSection();

	@CssSelector("${pages.kargo.user.editUserIMGButton}")
	public AspireWebElement editUserIMGButton();

	@CssSelector("${pages.kargo.user.editUserInformationButton}")
	public AspireWebElement editUserInformationButton();

	@CssSelector("${pages.kargo.user.editUserInformationSection}")
	public AspireWebElement editUserInformationSection();

}
