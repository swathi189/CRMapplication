package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowsers {
	public static void main(String[] args) throws InterruptedException {
		
//		// To close only the parent Browser window
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.naukri.com/");
//		driver.close();
		
//		// To close all browser windows (the parent Browser window + child browser window)
//				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//				WebDriver driver=new ChromeDriver();
//				driver.get("https://www.naukri.com/");
//				driver.quit();;

//		// To close all the Browser windows without using quit() method
//				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//				WebDriver driver=new ChromeDriver();
//				driver.get("https://www.naukri.com/");
//				Set<String> allwhs = driver.getWindowHandles();
//				int count = allwhs.size();
//				System.out.println(count);
//				
//				for(String wh:allwhs)
//				{
//					driver.switchTo().window(wh).close();
//					Thread.sleep(2000);
//				}
					
		
//		// Switch to a particular Browser and perform the action on it
//				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//				WebDriver driver=new ChromeDriver();
//				driver.get("https://www.naukri.com/");
//				Set<String> allwhs = driver.getWindowHandles();
//				
//				for(String wh:allwhs)
//				{
//					String title = driver.switchTo().window(wh).getTitle();
//					if(title.equals("VMWare"))
//					{
//						driver.manage().window().maximize();
//						Thread.sleep(2000);
//						driver.close();
//					}
//				}
		

		// To close all the child Browser windows only
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.naukri.com/");
				String parentTitle = driver.getTitle();
				Set<String> allwhs = driver.getWindowHandles();
				for(String wh:allwhs)
				{
					String title = driver.switchTo().window(wh).getTitle();
					if(!title.equals(parentTitle))
					{
						driver.close();
					}
				}
		
			
		
	}

}
