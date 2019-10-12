package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestClass {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://user-pc/login.do");
		PomClass pc=new PomClass(driver);
		PageFactory.initElements(driver, pc);
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
		pc.clickLoginBtn();
		
    }

}
