package com.acti.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage {
	@FindBy(xpath="//select[@name='property(saltName)']") private WebElement firstNameDropDown;
	public WebElement firstNameDropDown()
	{
		return firstNameDropDown;
		
	}
	
	@FindBy(xpath="//input[@name='property(First Name)']") private WebElement firstNameTB;
	public WebElement firstNameTB()
	{
		return firstNameTB;
		
	}
	
	
	
	
	
	
	public CreateLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

}
