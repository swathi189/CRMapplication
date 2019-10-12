package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleRightClickOptions {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//To Handle RightClick options
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("file:///D:/HTML/link.html");  
				WebElement target = driver.findElement(By.id("i1"));
				Actions ac = new Actions(driver);
				ac.contextClick(target).perform();
				Thread.sleep(2000);
				Robot r=new Robot();
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_T);
						
				
				
	}

	
}
