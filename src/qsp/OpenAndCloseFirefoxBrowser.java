package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAndCloseFirefoxBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "D:\\SSSM14\\Automation\\Drivers\\geckodriver.exe");
	
	    FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com");
	    driver.close();
}
}
