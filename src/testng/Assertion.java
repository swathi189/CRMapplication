package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(loginPageTitle, "actiTIME - Logi");
		
		//Assert.assertEquals(loginPageTitle, "actiTIME - Login");
		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//		driver.findElement(By.id("keepLoggedInCheckBo")).click();
//		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
	}
}
