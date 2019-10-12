package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndCloseBrowser {
    public static void main(String[] args) {
		//set the system property
    	//key ----> type of the browser
    	String key="webdriver.chrome.driver";
    	//Value -----> Path of the driver executable file
    	String value="D:\\SSSM14\\Automation\\Drivers\\chromedriver.exe"; //if we use backward slash then use two backward slashes
    	// String value="D:/SSSM14/Automation/Drivers/chromedriver.exe"; // if we use forward slash
    	System.setProperty(key, value);
    	
    	//Open the Chrome Browser
    	ChromeDriver driver=new ChromeDriver();
    	
    	//Enter the URL
    	driver.get("https://www.google.com/");
    	
    	//Close the Browser
    	driver.close();
    	
	}
}
