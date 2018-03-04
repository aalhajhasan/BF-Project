package com.aspire.kargo.steps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.kargo.pages.KargoUserPage;
import com.aspire.kargo.pages.LoginPage;
import com.aspire.kargo.pages.common.UserCommonElements;

import junit.framework.Assert;
import lombok.extern.slf4j.Slf4j;

@Component
@Steps
@Slf4j
public class UserSteps {

	@Value("${user.dir}")
	private String refPath;

	{

	}

	@Browser("kargoUser")
	AspireBrowser<KargoUserPage> kargoUserPage;
	
}
