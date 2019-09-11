package com.acti.genericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * This generic method is used to read the value of a key from property file 
	 * @param propPath
	 * @param key
	 * @return String
	 * @throws Throwable
	 */
	
	public String getKeyPropertyValue(String propPath,String key) throws Throwable
	{
		FileInputStream readProp = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(readProp);
		return prop.getProperty(key, "The Mentioned Key is not Present in proprty file");
		
	}
	
	/**
	 * This is a generic method used to read the data from excel sheet
	 * @param excelPath
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return String
	 * @throws Throwable
	 */
	public String getExcelData(String excelPath,String sheet,int row,int cell) throws Throwable
	{
		
		FileInputStream readExcel = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(readExcel);
		String excelData = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return excelData;
	
	}
	
	/**
	 * This generic method is used to write data into excel sheet
	 * @param excelPath
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 * @throws Throwable
	 */
	public void setExcelData(String excelPath,String sheet,int row,int cell,String value) throws Throwable 
	{
		FileInputStream readExcel = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(readExcel);
		wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);
		
		FileOutputStream writeExcel = new FileOutputStream(excelPath);
		wb.write(writeExcel);
		wb.close();
		
	}
	
	/**
	 * This generic method is used to count the no of rows
	 * @param excelPath
	 * @param sheet
	 * @return
	 * @throws Throwable
	 */
	public int getRowCount(String excelPath,String sheet) throws Throwable
	{
		FileInputStream readExcel = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(readExcel);
		return wb.getSheet(sheet).getLastRowNum();
		
	}
	


}
