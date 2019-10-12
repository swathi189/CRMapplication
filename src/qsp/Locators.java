package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/HTML/cssSelector.html");
	//	WebElement eleAddress = driver.findElement(By.tagName("a"));
	//	eleAddress.click();
		
	//	driver.findElement(By.id("i")).click();
	//	driver.findElement(By.className("n")).click();
	//	driver.findElement(By.linkText("Googly")).click();
		//driver.findElement(By.partialLinkText("Go")).click();
	//	driver.findElement(By.cssSelector("a[name=n]")).click();
	//	driver.findElement(By.cssSelector("a#i")).click();
	//	driver.findElement(By.xpath("html/body/a")).click();
		driver.findElement(By.xpath("html/body/div")).click(); //it will just open webpage 
                               // bcoz here Simple text is a text but not link to open browser
		
		
	}
	
	

}
