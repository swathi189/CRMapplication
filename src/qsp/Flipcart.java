package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	String str;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		
		driver.findElement(By.className("LM6RPg")).sendKeys("laptops");
		
		
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		
		List<WebElement> allLapCosts = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		int count = allLapCosts.size();
		System.out.println(count);
		
//		for(int i=0;i<count;i++)
//		{
//		
//			WebElement eachLapCost = allLapCosts.get(i);
//			System.out.println(eachLapCost.getText());
//		
//		}
//			
		 
	
		// printing all laptops cost without printing rupee symbol.
		for(int i=0;i<count;i++)
		{
			String eachLapCost = allLapCosts.get(i).getText();
			int length = eachLapCost.length();	
			for(int j=1;j<length;j++)
			{
			System.out.print(eachLapCost.charAt(j));
			}
			System.out.println();
			
		}
			
		
		
	  }		

		
	}

