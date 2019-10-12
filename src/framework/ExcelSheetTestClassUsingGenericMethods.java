package framework;

public class ExcelSheetTestClassUsingGenericMethods implements AutoConstants {
	public static void main(String[] args) throws Throwable {
		FileLibrary fl=new FileLibrary();
		System.out.println(fl.getCellData(EXCEL_PATH, "validData", 1, 0));
		
	}

}
