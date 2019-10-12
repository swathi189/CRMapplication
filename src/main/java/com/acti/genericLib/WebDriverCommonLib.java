package com.acti.genericLib;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest {
	/**
	 * This method is used to wait until the Element is loaded
	 * by giving time in seconds
	 * @param sec
	 */
	public void waitForElementLoad(int sec)
	{
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	/**
	 * This method is used to wait until the Element is loaded
	 * by giving time in seconds and condition(Locator arg)
	 * @param sec
	 * @param locator
	 */
	public void waitForElementLoad(int sec,By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, sec);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * This method is used to MouseHover on any element
	 * By passing the address of the element
	 * @param element
	 */
	public void mouseHover(WebElement element)
	{
		Actions ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	
	/**
	 * This method is used to select an option from the DropDown
	 * By providing the index of the option
	 * @param element
	 * @param index
	 */
	public void select(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	}
	
	/**
	 * This method is used to select an option from the DropDown
	 * By providing the visible text of the option
	 * @param element
	 * @param text
	 */
	public void select(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
		
	}
	
	
	public void verifyTitle(String expectedTitle)
	{
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log(actualTitle+" Title is MATCHED ====> Passed",true);
		
	}
	
	
	public void verify(String message,String actual,String expected)
	{
		Assert.assertEquals(actual, expected);
		Reporter.log(message+" Verification is MATCHED===>PASSED ", true);
		
	}
	
	public void switchToChildBrowser(String expectedTitle) throws Throwable
	{
//		String parentWindow = driver.getWindowHandle();
		
		Set<String> allwhs = driver.getWindowHandles();
		
		for(String wh : allwhs)
		{
			String actualTitle = driver.switchTo().window(wh).getTitle();
			if(actualTitle.equals(expectedTitle))
			{
				Reporter.log(actualTitle+" Browser Title verification is Matched : passed", true);
				Thread.sleep(1000);
			}
			
			
			
//			//how to use assertEquals() of Assret class in for loop.
//			Assert.assertEquals(actualTitle, expectedTitle);
//			Reporter.log(actualTitle+" Browser Title verification is Matched : passed", true);
			
		}
	}
	


}
