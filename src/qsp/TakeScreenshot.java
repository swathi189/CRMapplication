package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//through DownCasting taking screenshot
		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\screenshots\\google.png");
		Files.copy(src, dest);
		
		// through TypeCasting taking screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\screenshots\\googly.png");
		Files.copy(source, destination);
		
		
	}
}
