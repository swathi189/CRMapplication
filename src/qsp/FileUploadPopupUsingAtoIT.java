package qsp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopupUsingAtoIT {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Handling FileUploadPopup in FireFox Browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='uploadBtnCont' and @class='uploadBtnCont']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\AutoITFiles\\chromeFileUploadPopup.exe");
			
		
		
//		//Handling FileUploadPopup in FireFox Browser
//		
//		WebDriver driver=new FirefoxDriver();
//		driver.get("https://www.naukri.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@id='uploadBtnCont' and @class='uploadBtnCont']")).click();
//		//driver.findElement(By.id("input_resumeParser")).submit();
//		
//		//driver.findElement(By.xpath("//input[@value='Upload CV']/..")).click();
//		Thread.sleep(2000);
//		//Runtime.getRuntime().exec("D:\\AutoITFiles\\fileupload.exe");
//		Runtime.getRuntime().exec("D:\\AutoITFiles\\fileupload.exe");
	
	}
	

}
