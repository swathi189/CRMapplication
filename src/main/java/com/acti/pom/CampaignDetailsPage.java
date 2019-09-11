package com.acti.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailsPage {
	@FindBy(id="value_Campaign Name") private WebElement campaignName;
	public WebElement campaignName()
	{
		return campaignName;
		
	}
	
	
	@FindBy(xpath="//a[.='Leads']") private WebElement leadsTab;
	public WebElement leadsTab()
	{
		return leadsTab;
		
	}
	
	
	
	
	public CampaignDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}



}
