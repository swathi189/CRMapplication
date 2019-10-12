package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/HTML/multipleEle.html");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement oneLink = allLinks.get(i);
			String text = oneLink.getText();
			System.out.println(text);
		}
	}

}
