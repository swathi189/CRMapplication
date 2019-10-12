package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GaanaLoginPage {
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "./Drivers/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gaana.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//a[@class=\"play\" and @href=\"/album/jabariya-jodi\"])[1]")));
		driver.findElement(By.xpath("(//a[@class=\"play\" and @href=\"/album/jabariya-jodi\"])[1]")).click();
		
		
	}

}
