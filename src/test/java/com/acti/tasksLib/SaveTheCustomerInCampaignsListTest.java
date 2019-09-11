package com.acti.tasksLib;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acti.genericLib.BaseTest;
import com.acti.genericLib.FileLib;
import com.acti.genericLib.WebDriverCommonLib;
import com.acti.pom.CampaignDetailsPage;
import com.acti.pom.CreateCampaignPage;
import com.acti.pom.CreateLeadPage;
import com.acti.pom.DisplayingCustomViewDetailsPage;
import com.acti.pom.HomePage;

@Listeners(com.acti.genericLib.MyListener.class)
public class SaveTheCustomerInCampaignsListTest extends BaseTest {
	FileLib flib;
	WebDriverCommonLib wdlib;
	HomePage hp;
	DisplayingCustomViewDetailsPage dcvp;
	CreateCampaignPage ccp;
	CampaignDetailsPage cdp;
	Select sel;
	CreateLeadPage clp;
	
	
	@Test
	public void SaveCustomerInCampaignList() throws Throwable
	{
		String parentWindow = driver.getWindowHandle();
		
		flib = new FileLib();
		wdlib = new WebDriverCommonLib();
		hp = new HomePage(driver);
		dcvp=new DisplayingCustomViewDetailsPage(driver);
		ccp=new CreateCampaignPage(driver);
		cdp=new CampaignDetailsPage(driver);
		clp=new CreateLeadPage(driver);
		
		
		wdlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "HomePageTitle"));
		
		hp.campaignTab().click();
		
		wdlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "DisplayingCustomerPageTitle"));
		
		dcvp.newCampaignBtn().click();
		wdlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "CreateCampaignPage"));
		
		Thread.sleep(2000);
		
		ccp.campaignNameTB().sendKeys(flib.getExcelData(EXCEL_PATH_CAMPAIGN, "createCampaign",1,0));
		
		ccp.startDateTF().click();
		wdlib.switchToChildBrowser(flib.getKeyPropertyValue(PROP_PATH, "StartDateChildBrowserTitle"));
		ccp.selectStartDate().click();
		
		driver.switchTo().window(parentWindow);
		
		ccp.expectedRevenue().sendKeys(flib.getExcelData(EXCEL_PATH_CAMPAIGN, "createCampaign", 1, 2));
	
		wdlib.select(ccp.customerTypeDropDownList(), flib.getKeyPropertyValue(PROP_PATH, "CustomerType"));

		wdlib.select(ccp.customerStatusDropDownList(),flib.getKeyPropertyValue(PROP_PATH, "CustomerStatus"));

		ccp.endDateTF().click();
		wdlib.switchToChildBrowser(flib.getKeyPropertyValue(PROP_PATH, "EndDateChildBrowserTitle"));
		ccp.selectEndDate().click();
		
		driver.switchTo().window(parentWindow);
		
		ccp.descriptionInformation().sendKeys(flib.getExcelData(EXCEL_PATH_CAMPAIGN, "createCampaign", 1, 3));
	
		ccp.saveBtn().click();
		
		Thread.sleep(2000);
		String actualName = cdp.campaignName().getText();
		wdlib.verify(actualName+" CampaignName ", actualName, flib.getExcelData(EXCEL_PATH_CAMPAIGN, "createCampaign", 1, 0));
			
		hp.campaignTab().click();
		
		String actualCampNameInList = dcvp.campaignNameInCampaignList().getText();
		wdlib.verify("Actual Campaign Name in Campaign List", actualCampNameInList, flib.getExcelData(EXCEL_PATH_CAMPAIGN, "createCampaign", 1, 0));
		
		
	//	wdlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "CampaignDetailsPage"));
		
		
		cdp.leadsTab().click();
		
		wdlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "DisplayingCustomerPageTitle"));
		
		dcvp.newLeadBtn().click();
		
		wdlib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "CreateLeadPageTitle"));
		
		Thread.sleep(2000);
		
		wdlib.select(clp.firstNameDropDown(), "Ms.");
		clp.firstNameTB().sendKeys(flib.getExcelData(EXCEL_PATH_CAMPAIGN, "createLead", 1, 0));
		
			
		
	}


}
