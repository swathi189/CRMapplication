package framework;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws Throwable   {
		
		String excelPath=
	             "D:\\SSSM14\\Automation\\data\\data.xlsx";
	FileInputStream fis=new FileInputStream(excelPath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(3);
		Cell c = r.getCell(1);
		c.setCellValue("Pass");
		
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();

		
		
		
		
/**		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://user-pc/login.do");
		
		String excelPath="D:\\SSSM14\\Automation\\data\\inputdata.xlsx";
		
		ReadExcelDataGenericClass red = new ReadExcelDataGenericClass();
		Thread.sleep(2000);
		
		int rc = red.getRowCount(excelPath, "invalidData");
		System.out.println(rc);
		
		for(int i=1;i<=rc;i++)
		{
			String username = red.getCellData(excelPath, "invalidData", i, 0);
			String password = red.getCellData(excelPath, "invalidData", i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			
			
			Thread.sleep(2000);
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_DELETE);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_DELETE);
			Thread.sleep(2000);
			
		}
		
		  */
		
		
	}

}
