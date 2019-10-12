package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(4000);
		
		WebElement ddAddr = driver.findElement(By.name("q"));
		ddAddr.sendKeys("mobiles");
		
		Thread.sleep(4000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='_2kpuIQ']"));
		int count = allOptions.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println(allOptions.get(i).getText());
		}
		
//	    to click on 3rd option
//		ddAddr.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
//		ddAddr.sendKeys(Keys.ENTER);
	
		
		
		//to click on last option
		allOptions.get(count-1).click();		
		
	}

}
