package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestC {
	public static void main(String[] args) throws Throwable {
		// open the excel in Read mode
		String excelPath="D:\\SSSM14\\Automation\\data\\inputdata.xlsx";
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("validData").createRow(3).createCell(3).setCellValue("Pass");
		
		//Open the Excel in Write Mode
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		System.out.println("Done");
		wb.close();
		

		
		
		
	}

}
