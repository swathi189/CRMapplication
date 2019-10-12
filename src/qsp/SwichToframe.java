package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwichToframe {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.firstcry.com/");
		driver.switchTo().frame(0);
		
		
		
		//popupAdd="//div[@class='_pop_close _pop_reg_bg']"
	}

}
