package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class HandlingActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		// 	To perform Mouse Hover actions
		WebElement target = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		

	}

}
