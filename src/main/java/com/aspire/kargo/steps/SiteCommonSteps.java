package com.aspire.kargo.steps;

import java.io.File;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.util.Iterator;
import java.util.stream.Stream;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.kargo.pages.common.SiteCommonElements;
import com.aspire.kargo.pages.common.UserCommonElements;

import lombok.extern.slf4j.Slf4j;

@Component
@Steps
@Slf4j
public class SiteCommonSteps {
	@Value("${user.dir}")
	private String refPath;

	{

	}
	@Browser("siteCommonElements")
	AspireBrowser<SiteCommonElements> siteCommonElements;

	@When("[8001-0001] I type $value at $element_Name")
	public void FillTextBox(@Named("value") String value, @Named("element_Name") String element_Name) {

		AspireBrowser lastPage = AspireBrowser.getLastAccessedPage();
		String numberOfResults = siteCommonElements.elements().paginationModule().within(50).toBeVisible().text().get()
				.split("entries")[0].split("of")[1].replace(" ", "");
		// store values
		lastPage.storeRestartScopeValue("numberOfResults", numberOfResults);

		if (!(siteCommonElements.storedValue("numberOfResults").toString().equals("0"))) {
			lastPage.storeRestartScopeValue("lastSearchedData", lastPage.getElementByPropertyName(value).text().get());
			lastPage.getElementByPropertyName(element_Name)
					.setValue(lastPage.getElementByPropertyName(value).text().get());
		}

	}

	@Then("[8001-0002] verify the $rows contains this $keyword")
	public void searchResult(@Named("rows") String rows, @Named("keyword") String keyword) {
		if (!(siteCommonElements.storedValue("numberOfResults").toString().equals("0"))) {
			siteCommonElements.elements().returnedRows().within(20).atMost(0, (aspireWebElement) -> {
				return aspireWebElement.text().get().contains(keyword) == false;
			}, "One Or More Element doesn’t have (" + keyword + ")");

		}
	}

	@When("[8001-0003] I upload $fileName at $inputField")
	public void uploadFile(@Named("fileName") String fileName, @Named("inputField") String inputField) {
		String filePath = refPath + File.separator + "src" + File.separator + fileName;
		AspireBrowser.getElementByPropertyNameGlobaly(inputField)
	//	AspireBrowser.getElementByPropertyName(inputField)
				.js("arguments[1].style.display=arguments[0];", null, "block").sendKeys(filePath);

	}

	@When("[8001-0004] calculate number of files at downloads directory")
	public void calculateNumOfFiles() {
		String downloadPath = refPath + File.separator + "Temp";
		File dir = new File(downloadPath);
		File[] files = dir.listFiles();
		siteCommonElements.storeRestartScopeValue("numberOfDownloadedFile", files.length);
	}

	@Then("[8001-0005] I the verify number of files at downloads directory is incremented, within $timeout")
	public void calculateNumOfFilesAfterDownload(@Named("timeout") long timeout) {

		File dir = new File(refPath + File.separator + "Temp");
		siteCommonElements.within(timeout, 2000).checkCondition((driver) -> {
			File[] files = dir.listFiles();

			boolean flag = false;

			if (files == null || files.length == 0) {
				flag = false;
			}
			int numOfFilesBefore = siteCommonElements.storedValue("numberOfDownloadedFile", Integer.class);
			int numOfFilesAfter = files.length;
			String ext = "xlsx";

			long numberOfExtFiles = Stream.of(files).filter(file -> file.getName().contains(ext)).count();

			return numOfFilesAfter > numOfFilesBefore && numberOfExtFiles != 0;
		});

	}

	@When("[8001-0006] User clears $data at $field using back space")
	public void clearUsingBackspace(@Named("data") String data, @Named("field") String field) {
		while (AspireBrowser.getElementsByPropertyNameGlobaly(data).size() != 0) {
			AspireBrowser.getElementByPropertyNameGlobaly(field).sendKeys(Keys.BACK_SPACE);
		}
	}

	@Then("[8001-0008] I verify the number of rows in the $rows equals $number")
	public boolean checkNumberOfRowsInthePage(@Named("rows") String rows, @Named("number") int number) {
		Boolean result = false;
		String[] numberOfResults = siteCommonElements.elements().paginationModule().within(50).toBeVisible().text()
				.get().split("entries");
		numberOfResults = numberOfResults[0].split("of");
		// save values
		int numberOfResults3 = Integer.parseInt(numberOfResults[1].replace(" ", ""));

		if (!(numberOfResults3 < 50 || numberOfResults3 == 50)) {
			int numberOfRows = siteCommonElements.getElementsByPropertyName(rows).size();
			if (number == 50) {
				if (numberOfRows <= 50) {
					result = true;
				}
			}
			if (number == 75) {
				if (numberOfRows > 50 && numberOfRows <= 75) {
					result = true;
				}
			}
			if (number == 100) {
				if (numberOfRows > 50 && numberOfRows <= 100) {
					result = true;
				}
			}
			return result;
		} else {
			return true;
		}

	}

	@When("[8001-0009] User presses on $elementName, if page contains pagination")
	public void checkNumberOfRowsInthePage(@Named("elementName") String elementName) {
		AspireBrowser.getElementsByPropertyNameGlobaly(elementName).stream()
				.filter((aspireWebElement) -> aspireWebElement.isDisplayed()).findFirst().get().click();
	}

	@Then("[8001-0010] User should be navigated to $NextOrPrevious Page")
	public void verifyNavigationUsingArrows(@Named("NextOrPrevious") String NextOrPrevious) {
		String numberOfResults = siteCommonElements.elements().paginationModule().within(50).toBeVisible().text().get()
				.split("entries")[0].split("of")[1].replace(" ", "");

		if (!(Integer.parseInt(numberOfResults) < 50 || Integer.parseInt(numberOfResults) == 50)) {
			switch (NextOrPrevious) {
			case "Next":
				siteCommonElements.elements().activeNumber().text().contains("2");
				break;

			case "Previous":
				siteCommonElements.elements().activeNumber().text().contains("1");
				break;
			}

		}
	}

	@Then("[8001-0011] verify image $element($fileName) were uploaded successfully")
	public void checkUpload(@Named("element") String element, @Named("fileName") String fileName) {
		String value = null;
		try {
			value = AspireBrowser.getElementByPropertyNameGlobaly(element).within(20).toBeVisible().attribute("src")
					.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (value == null) {
			value = AspireBrowser.getElementByPropertyNameGlobaly(element).within(20).toBeVisible().attribute("style")
					.get();
		}
		Assert.assertTrue(value.contains(fileName));
	}
	
	@Then("[8001-0012] filtering using $Option from approved for direct list return correct rows")
	
	public void checkfilter(@Named("Option") String Option)
	{
		
		
		System.out.println("Option is: " + Option);
		String[] numberOfResults = siteCommonElements.elements().paginationModule().within(50).toBeVisible().text().get()
				.split("entries");
		numberOfResults = numberOfResults[0].split("of");
		int numberOfResults3 = Integer.parseInt(numberOfResults[1].replace(" ", ""));
		if (numberOfResults3 != 0) {
			
			
			if (!Option.equalsIgnoreCase("All")) {
				siteCommonElements.elements().thirdCloumnData().within(50).
				atLeast(1, (aspireWebElement) -> {
					return aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
				}, "One row does not contains " + Option)
				.within(50)
				.atLeast(1, (aspireWebElement) -> {
					return !aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
				}, "One row does not contains " + Option);
			}
			
			
			
			else if 	 (!Option.equalsIgnoreCase("Yes")) {
				siteCommonElements.elements().thirdCloumnData().within(50).
				atLeast(1, (aspireWebElement) -> {
					return aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
				}, "One row does not contains " + Option);
				
				
			
			}
			
			else if 	 (!Option.equalsIgnoreCase("No")) {
				siteCommonElements.elements().thirdCloumnData().within(50).
				atLeast(1, (aspireWebElement) -> {
					return !aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
				}, "One row does not contains " + Option);
	
		}
	

	}
	}
		
		
		@Then("[8001-0013] filtering using $Option from approved for direct list return correct rows")
		
		public void checkfilterfunctionlaity(@Named("Option") String Option)
		{
			
			
			System.out.println("Option is: " + Option);
			String[] numberOfResults = siteCommonElements.elements().paginationModule().within(50).toBeVisible().text().get()
					.split("entries");
			numberOfResults = numberOfResults[0].split("of");
			int numberOfResults3 = Integer.parseInt(numberOfResults[1].replace(" ", ""));
			if (numberOfResults3 != 0) {
				
				
				if (!Option.equalsIgnoreCase("All")) {
					siteCommonElements.elements().thirdCloumnData().within(50).
					atLeast(1, (aspireWebElement) -> {
						return aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
					}, "One row does not contains " + Option)
					.within(50)
					.atLeast(1, (aspireWebElement) -> {
						return !aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
					}, "One row does not contains " + Option);
				}
				
				
				
				else if 	 (!Option.equalsIgnoreCase("Yes")) {
					siteCommonElements.elements().thirdCloumnData().within(50).
					atLeast(1, (aspireWebElement) -> {
						return aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
					}, "One row does not contains " + Option);
					
					
				
				}
				
				else if 	 (!Option.equalsIgnoreCase("No")) {
					siteCommonElements.elements().thirdCloumnData().within(50).
					atLeast(1, (aspireWebElement) -> {
						return !aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
					}, "One row does not contains " + Option);
		
			}
		

		}
			
		
		
	}
}


