package com.acti.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZoHoCRMlogoutHomePage {
@FindBy(xpath="//a[.='Logout [rashmi@dell.com]']") private WebElement logOutBtn;
	
	public void clickOnlogoutLink()
	{
		logOutBtn.click();
	}
	
	public ZoHoCRMlogoutHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
