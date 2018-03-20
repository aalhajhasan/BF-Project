package com.aspire.bf.steps;

import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.bf.pages.EbagsPage;


@Steps
@Component

public class EbagsSteps {

	@Browser("ebags")
	AspireBrowser<EbagsPage> ebagsPage;
	
}
