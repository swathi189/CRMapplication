package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		String seleniumDownloadPage = driver.getTitle();
		System.out.println(seleniumDownloadPage);
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		Dimension d = new Dimension(150, 300);
		driver.manage().window().setSize(d);
		
		Point p = new Point(600, 400);
		driver.manage().window().setPosition(p);
		
		
	}

}
