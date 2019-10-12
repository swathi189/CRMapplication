package qsp;

import java.util.Scanner; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {
	public static void main(String[] args) {
		System.out.println("Please enter the required browser: Chrome/Firefox???");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//String str = sc.nextLine();
		System.out.println("Please wait.....");
		WebDriver driver=null;
		
		if(str.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(str.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Please enter Browser properly");
		}
		
	   driver.get("https://www.seleniumhq.org/download/");
	   driver.close();
		sc.close();
		
		
	}

}
