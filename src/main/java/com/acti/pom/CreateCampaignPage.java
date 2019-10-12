package com.acti.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	@FindBy(name="property(Campaign Name)") private WebElement campaignNameTB;
	public WebElement campaignNameTB()
	{
		return campaignNameTB;
		
	}
	
	@FindBy(xpath="//input[@value='Save']") private WebElement saveBtn;
	public WebElement saveBtn()
	{
		return saveBtn;
		
	}
	
	
	@FindBy(xpath="//img[@onclick=\"showCal('property(Start Date)')\"]") private WebElement startDateTF;
	public WebElement startDateTF()
	{
		return startDateTF;
		
	}
	
	@FindBy(xpath="//a[text()=\"20\"]") private WebElement selectStartDate;
	public WebElement selectStartDate()
	{
		return selectStartDate;
		
	}
	

	@FindBy(xpath="//img[@onclick=\"showCal('property(End Date)')\"]") private WebElement endDateTF;
	public WebElement endDateTF()
	{
		return endDateTF;
		
	}
	
	@FindBy(xpath="//a[text()='30']") private WebElement selectEndDate;
	public WebElement selectEndDate()
	{
		return selectEndDate;
		
	}
	
	@FindBy(name="property(Type)") private WebElement customerTypeDropDownList;
	public WebElement customerTypeDropDownList()
	{
		return customerTypeDropDownList;
		
	}
	
	@FindBy(name="property(Status)") private WebElement customerStatusDropDownList;
	public WebElement customerStatusDropDownList()
	{
		return customerStatusDropDownList;
		
	}
	
	@FindBy(name="property(Description)") private WebElement descriptionInformation;
	public WebElement descriptionInformation()
	{
		return descriptionInformation;
		
	}
	
	@FindBy(name="property(Expected Revenue)") private WebElement expectedRevenue;
	public WebElement expectedRevenue()
	{
		return expectedRevenue;
		
	}
	
	
	
	
	
	
	
	
	public CreateCampaignPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	

}
