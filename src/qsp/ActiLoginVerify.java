package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiLoginVerify {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://user-pc/login.do");
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		if(loginPageTitle.equals("actiTIME - Login"))
		{
			System.out.println("Login Page is Displayed: "+loginPageTitle+" ====>PASSED");
		}
		else
		{
			System.out.println("Login Page is not Displayed: "+loginPageTitle+" ====>FAILED");
		}
		
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 
		  
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.titleContains("Enter"));
		 
		 String homePageTitle = driver.getTitle();
		 System.out.println(homePageTitle);
		 if(homePageTitle.equals("actiTIME - Enter Time-Track"))
		 {
				System.out.println("Home Page is Displayed: "+homePageTitle+" ====>PASSED"); 
		 }
		 else
		 {
				System.out.println("Home Page is not Displayed: "+homePageTitle+" ====>FAILED"); 
		 }
			 
		
	}

}
