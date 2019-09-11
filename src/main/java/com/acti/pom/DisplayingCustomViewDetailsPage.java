package com.acti.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomViewDetailsPage {
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement newCampaignBtn;

	public WebElement newCampaignBtn() {
		return newCampaignBtn;

	}
	

	@FindBy(xpath = "(//td[@class='tableData']/..)[1]/td[3]")
	private WebElement campaignNameInCampaignList;
	public WebElement campaignNameInCampaignList()
	{
		return campaignNameInCampaignList;
		
	}
	
	@FindBy(xpath = "//input[@value='New Lead' and @onclick='createAction()']")
	private WebElement newLeadBtn;

	public WebElement newLeadBtn() {
		return newLeadBtn;

	}
	
	
	

	public DisplayingCustomViewDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



}
