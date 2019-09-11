package com.acti.tasksLib;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acti.genericLib.BaseTest;
import com.acti.genericLib.FileLib;
import com.acti.genericLib.WebDriverCommonLib;
import com.acti.pom.HomePage;

@Listeners(com.acti.genericLib.MyListener.class)
public class CampaignsTabTest extends BaseTest {
	@Test
	public void campaignsTab() throws Throwable
	{
		FileLib flib = new FileLib();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "HomePageTitle"));
		
		Thread.sleep(3000);
		
		HomePage hp=new HomePage(driver);
		if(hp.campaignTab().isDisplayed())
		{
			Reporter.log("Campaign Tab is displayed",true);
			hp.campaignTab().click();
			
		}
		else 
		{
			Reporter.log("Campaign Tab is not displayed",true);
		}
		
			
	}


}
