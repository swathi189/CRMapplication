package framework;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLibToGetValueByGivingKey {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("username"); //give the key from property file (ex: commonData.properties) 
		                    /* to getProperty() method of Properties Class then it will give the value from the property file */
		System.out.println(value);
		
		
	}

}

