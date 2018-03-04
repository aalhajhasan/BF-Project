   package com.aspire.kargo.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.kargo.pages.AdvertiserUserCompanyPage;
import com.aspire.kargo.pages.RolesPage;

@Component
@Steps
public class userCompanySteps {

	@Browser("advertiserUserCompany")
	AspireBrowser<AdvertiserUserCompanyPage> AdvertiserUserCompanyPage;

	@Then("[8003-0007] I add the Company if it's not exist at company")
	public void checkAddingNewAdvertiserCompa() {
		// checkAddingNewAdvertiserCompany(value,element_Name);
		System.out.println("hello");
		// AspireBrowser lastPage = AspireBrowser.getLastAccessedPage();

		String[] numberOfResults = AdvertiserUserCompanyPage.elements().paginationModule().within(2).toBeVisible()
				.text().get().split("entries");
		numberOfResults = numberOfResults[0].split("of");
		int numberOfResults3 = Integer.parseInt(numberOfResults[1].replace(" ", ""));
		if (numberOfResults3 != 0) {

			String x = AdvertiserUserCompanyPage.elements().keyword().within(50).toBeVisible().text().get();
			AdvertiserUserCompanyPage.storeStoryScopeValue("MyFirstCompany", x);

			AdvertiserUserCompanyPage.elements().addUserCompanyButton().click();

			AdvertiserUserCompanyPage.elements().companyName().sendKeys(x);

			AdvertiserUserCompanyPage.elements().firstOption().click();

			AdvertiserUserCompanyPage.elements().submitCompanyButton().click();

			String y = AdvertiserUserCompanyPage.elements().errorAddingCompanyMSG().text().get();

			if (y.contains("Error adding user company")) {
				AdvertiserUserCompanyPage.elements().contCompanyButton().click();
				AdvertiserUserCompanyPage.elements().canselCompanyButton().click();
				AdvertiserUserCompanyPage.elements().actionButton().click();
				AdvertiserUserCompanyPage.elements().deleteCompanyButton().click();
				AdvertiserUserCompanyPage.elements().contCompanyButton().click();
				AdvertiserUserCompanyPage.elements().addUserCompanyButton().click();
				AdvertiserUserCompanyPage.elements().companyName().sendKeys(x);
				AdvertiserUserCompanyPage.elements().firstOption().click();
				AdvertiserUserCompanyPage.elements().submitCompanyButton().click();

				if (AspireBrowser.storedStoryValue(x) != null) {
					System.out.print(x);
				}

				else {
					System.out.print("The company does not exist!");
				}
			}

		}

		else {
			AdvertiserUserCompanyPage.elements().addUserCompanyButton().click();
			AdvertiserUserCompanyPage.elements().firstOption().click();
			AdvertiserUserCompanyPage.elements().submitCompanyButton().click();

		}

	}

}
