package qsp;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenQspidersBtm {
	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			WebElement ddAddr = driver.findElement(By.name("q"));
			ddAddr.sendKeys("Qspiders");
			
			Thread.sleep(4000);
			
			List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='sbl1']"));
			int count = allOptions.size();
			System.out.println(count);
			
			for(int i=0;i<count;i++)
			{
				System.out.println(allOptions.get(i).getText());
			}
			
			
			for(int i=0;i<count;i++)
			{
				if(allOptions.get(i).getText().equalsIgnoreCase("qspiders btm"))
				{
					allOptions.get(i).click();
					break;
				}
				
			}
			
			
		//	ddAddr.findElement(By.xpath("//b[contains(.,' btm')]")).click();
			
			
			
	}

}

