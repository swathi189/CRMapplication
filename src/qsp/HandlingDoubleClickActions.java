package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClickActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://user-pc/login.do");
		WebElement unTB = driver.findElement(By.name("username"));
		unTB.sendKeys("admin");
		Thread.sleep(2000);
		Actions akki = new Actions(driver);
		akki.doubleClick(unTB).perform();
		
	}

}

