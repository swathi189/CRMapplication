package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopupUsingAutoIT {
	public static void main(String[] args) throws AWTException, IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://user-pc/login.do");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		Runtime.getRuntime().exec("D:\\AutoITFiles\\print1.exe");
		
	}

}
