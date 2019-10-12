package framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This generic class is used to read and write data from excel sheet and
 * property file
 * 
 * @author User
 *
 */
public class FileLibrary implements AutoConstants {

	/**
	 * This generic method is used to get value from the property file
	 * 
	 * @param key
	 * @return value
	 * @throws Throwable
	 */
	public String getkeyPropertyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(PROP_PATH);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

	/**
	 * This generic method is used to read the data from the Excel sheet
	 * 
	 * @param path
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return val
	 * @throws Throwable
	 */
	public String getCellData(String path, String sheet, int row, int cell) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row r = sh.getRow(row);
		Cell c = r.getCell(cell);
		String val = c.toString();
		return val;

	}
	
	
	/**
	 * This generic method is used to get the number of rows from the Excel sheet
	 * 
	 * @param path
	 * @param sheet
	 * @return rc
	 * @throws Throwable
	 */
	public int getRowCount(String path, String sheet) throws Throwable {
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rc = wb.getSheet(sheet).getLastRowNum();
		return rc;
	}
	

	/**
	 * This generic method is used to write the data into the Excel sheet
	 * 
	 * @param excelPath
	 * @param sheet
	 * @param r
	 * @param c
	 * @param data
	 * @throws Throwable
	 */
	public void setCellData(String excelPath, String sheet, int r, int c, String data) throws Throwable {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(r).getCell(c).setCellValue(data);
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();

	}

	

}
