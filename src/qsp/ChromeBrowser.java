package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser  {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.seleniumhq.com");
		String title = driver.getTitle();
		if(title.equals("Selenium - Web Browser Automation"))
		{
			System.out.println("title matching: PASS");
		}
		else 
		{
			System.out.println("title not matching:FAIL");
		}
		
		String url = driver.getCurrentUrl();
	    if(url.equals("http://www.seleniumhq.com"))
		{
			System.out.println("URL matching: PASS");
		}
		
		else
		{
			System.out.println("URL not matching:FAIL");
		}
		
		
	}

}
