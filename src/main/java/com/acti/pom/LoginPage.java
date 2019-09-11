package com.acti.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@name='j_username']") private WebElement unTB;	
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	@FindBy(id="passWord") private WebElement pwTB;
	public void setPassWord(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@title='Sign In']") private WebElement singinBtn;
	public void clickOnSinginBtn()
	{
		singinBtn.click();
	}
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}


}
