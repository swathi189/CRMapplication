package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass1 implements AutoConstants{
	public static void main(String[] args) throws Throwable {
		
				FileLibrary fl = new FileLibrary();

				WebDriver driver = null;
				
				if (fl.getkeyPropertyValue("browser").equals("chrome"))
				{
					System.setProperty(CHROME_KEY,CHROME_VALUE);
					driver = new ChromeDriver();
				} 
				else if (fl.getkeyPropertyValue("browser").equals("firefox")) 
				{
					driver = new FirefoxDriver();
				}
					
				driver.get(fl.getkeyPropertyValue("url"));
				//driver.get("http://user-pc/login.do");
				// System.out.println(fl.getKeyPropertyValue("username"));

				 driver.findElement(By.name("username")).sendKeys(fl.getkeyPropertyValue("username"));
				 driver.findElement(By.name("pwd")).sendKeys(fl.getkeyPropertyValue("password"));
				 driver.findElement(By.id("loginButton")).click();
				 
				 

			}

}


