package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import framework.FileLibrary;

public class ActiLoginTest {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://user-pc/login.do");
		FileLibrary fLib=new FileLibrary();
		ActiLoginPage alp=new ActiLoginPage(driver);
		alp.countLinks();
		alp.setUsername(fLib.getkeyPropertyValue("username"));
		alp.setPassword(fLib.getkeyPropertyValue("password"));
		alp.clickLoginBtn();
	}


}
