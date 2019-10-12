package com.acti.tasksLib;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acti.genericLib.BaseTest;
import com.acti.genericLib.FileLib;
import com.acti.genericLib.WebDriverCommonLib;

@Listeners(com.acti.genericLib.MyListener.class)
public class CRMLoginTest extends BaseTest {
	@Test
	public void verifyCRMValidLoginTest() throws Throwable
	{
			
		FileLib flib = new FileLib();
		
		WebDriverCommonLib wblib = new WebDriverCommonLib();
		wblib.verifyTitle(flib.getKeyPropertyValue(PROP_PATH, "HomePageTitle"));
		
		
		
		
		
		
//		//this is the example for "Not Presented key in Property File"
//		//by using getProperty(String arg1,String arg2) of Property Class
//		Filelib fb = new Filelib();
//		System.out.println(fb.getKeyPropertyValue(PROP_PATH, "apple"));
	
		
	}

	

}
