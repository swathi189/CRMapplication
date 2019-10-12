package framework;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataGenericClass {
	
	public String getCellData(String path,String sheet,int row,int cell) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		String val = c.toString(); // toString() method coverts any type of data to String.
		                           //here in cell we may have string or numeric or any type of data.
									// in order to use getStringCellValue() to get String data in cell and getNumericCellValue() to get
									// numeric data in cell, we use toString() method.
		return val;
		
	}
	
	public int getRowCount(String path,String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet(sheet).getLastRowNum();
		return rc;
		
	}


}
