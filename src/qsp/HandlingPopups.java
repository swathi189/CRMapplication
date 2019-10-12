package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPopups {
	public static void main(String[] args) throws InterruptedException, AWTException {
//		//To Handle Alert Popup
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://ireps.gov.in/epsn/jsp/admin/home/logon.jsp");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(2000);
//		Alert al = driver.switchTo().alert();
//		String popupText = al.getText();
//		System.out.println(popupText);
//		//al.accept();
//		//or we can use dismiss() method of Alert Interface
//		al.dismiss();
		
//		//To Handle Confirmation Popup
//		
//		//NOT ABLE FIND THIS WEBSITE LINK. HAVE TO CHECK THIS PROGRAM 
//		
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://ireps.gov.in/epsn/jsp/admin/home/logon.jsp");
//		driver.findElement(By.name("submit")).click();
//		Thread.sleep(2000);
//		Alert al = driver.switchTo().alert();
//		//to get message  on the Popup
//		System.out.println(al.getText());
//		//to click on OK button
//		al.accept();
//		//to click on Cancel button
//		al.dismiss();
		
		
		
//		//Handling Hidden Division Popup
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.cleartrip.com/");
//		driver.findElement(By.id("DepartDate")).click();
//		//driver.findElement(By.xpath("(//a[.='20'])[2]")).click();
//		//or
//		driver.findElement(By.xpath("//td[@data-month='8' and .='20']")).click();
		
		
//		//Handle Browser Notification Popup
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");		
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--disable-notifications");
//		WebDriver driver=new ChromeDriver(co);
//		driver.get("https://www.cleartrip.com/");
		
		
//		//Handling Window Based Popup
//		//Handling File Upload Popup
//		
//		//hAVE TO CHECK THIS PROGRAM. NOT GETTING IN MY APPLICATION
//		
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://user-pc/login.do");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(6000);
//		driver.findElement(By.xpath("//div[@class='popup-memu-icon']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("uploadNewLogoOption")).click();
//		Thread.sleep(2000);
//		WebElement browseButton = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
//		browseButton.sendKeys("C:\\Users\\BTM");
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}
	

}
