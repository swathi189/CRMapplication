package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginImplicitlyWait {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin?service=lso&sacu=1&rip=1#identifier");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("Email")).sendKeys("raghukalashetti@gmail.com");
		driver.findElement(By.id("next")).click();
		
		driver.findElement(By.id("Passwd")).sendKeys("raghukalashetti");
		
		driver.findElement(By.id("signIn")).click();
		
 }
}
 
 