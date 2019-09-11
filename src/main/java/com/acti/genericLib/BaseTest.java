package com.acti.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.acti.pom.LoginPage;
import com.acti.pom.ZoHoCRMlogoutHomePage;

public class BaseTest implements AutoConstants {
public static WebDriver driver;
	
	
    FileLib fileb=new FileLib();
    
    @BeforeClass
	public void openBrowser() throws Throwable
	{
		
		String browser = fileb.getKeyPropertyValue(PROP_PATH, "browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
		String url = fileb.getKeyPropertyValue(PROP_PATH, "url");
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	}
	
	@BeforeMethod
	public void loginToApp() throws Throwable
	{
		FileLib flib = new FileLib();
		WebDriverCommonLib wblib = new WebDriverCommonLib();
		wblib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "LoginTitle"));
		Thread.sleep(1000);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(fileb.getKeyPropertyValue(PROP_PATH, "username"));
		lp.setPassWord(fileb.getKeyPropertyValue(PROP_PATH, "password"));
		lp.clickOnSinginBtn();
		Thread.sleep(3000);
		
	}
	
	
	@AfterMethod(enabled=false)
	public void LogoutFromApp()
	{
		ZoHoCRMlogoutHomePage zhf = new ZoHoCRMlogoutHomePage(driver);
		zhf.clickOnlogoutLink();

	}
	
	
	@AfterClass(enabled=false)
	public void closeBrowser()
	{
		driver.quit();
	}
	



	
}
