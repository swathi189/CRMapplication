package framework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("D:\\SSSM14\\Automation\\data\\inputdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("validData");
		Row r = sh.getRow(1);
		Cell c = r.getCell(0);
		String val = c.getStringCellValue();
		System.out.println(val);
		
		
	}

}
