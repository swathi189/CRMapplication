package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginUsingExplicitlyWait {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://accounts.google.com/ServiceLogin?service=lso&sacu=1&rip=1#identifier");
			driver.findElement(By.id("Email")).sendKeys("raghukalashetti");
			driver.findElement(By.id("next")).click();
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Passwd")));
			
			driver.findElement(By.id("Passwd")).sendKeys("agsvs1");
			driver.findElement(By.id("signIn")).click();
	}

}
