package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo extends Annotations {

	@Test
	public void run() {
		Reporter.log("I am run meth of Demo Class", true);
	}
	
	
	// @Test(priority = 2)
	// public void register()
	// {
	// Assert.fail();
	// Reporter.log("Successfully Registered",true);
	// }
	//
	// @Test(priority = 1,dependsOnMethods = "register")
	// public void delete()
	// {
	// Reporter.log("Successfully Deleted ",true);
	// }

	// @Test(invocationCount = 3)
	// public void run()
	// {
	// Reporter.log("run",true);
	// }
	//
	// @Test(priority = 3,enabled = true)
	// public void bun()
	// {
	// Reporter.log("bun",true);
	// }
	//
	// @Test(priority = 1, enabled = true)
	// public void sun()
	// {
	// Reporter.log("sun",true);
	// }
		

}


	/**
	// below programs are written for practice purpose.

	// //if the method have Test Annotation(@Test) then the method called as Test
	// method.
	// @Test(priority=1)
	// public void run()
	// {
	//
	// //to print only in console
	// System.out.println("I am sop statement");
	//
	 
//	 //to print only in report
//	 Reporter.log("I am reporter statement");
//	
//	 // to print in Report as well as console
//	 Reporter.log("I am reporter statement of run method in Demo class", true);
//	
//	 }
//	
//	 @Test(priority=2)
//	 public void bun()
//	 {
//	 Reporter.log("I am bun method of Demo class", true);
//	 }
//	
//	
//	 @Test(invocationCount=3) // walk method is executes 3 times
//	 public void walk()
//	 {
//	 Reporter.log("I am walk method of Demo class", true);
//	 }		
	  
	 		*/
	 
