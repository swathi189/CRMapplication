package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customer {
	
	@Test(groups="Smoke")
	public void register()
	{
		Reporter.log("registration is succcess ====> SmokeTest", true);
		
	}
	
	@Test(dependsOnMethods="register")
	public void delete()
	{
		Reporter.log("Delete the customer after successfully registered in new bank from old bank", true);
	}

}
