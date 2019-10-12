package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public abstract class Annotations {

	@BeforeSuite
	public void a()
	{
		Reporter.log("Before Suite", true);
	}
	
	
	@AfterSuite
	public void b()
	{
		Reporter.log("After Suite", true);
	}
	
	
	@BeforeTest
	public void c()
	{
		Reporter.log("Before Test", true);
	}
	
	
	@AfterTest
	public void d()
	{
		Reporter.log("After Test", true);
	}
	
	
	@BeforeClass
	public void e()
	{
		Reporter.log("Before Class", true);
	}
	
	
	@AfterClass
	public void f()
	{
		Reporter.log("After Class", true);
	}
	
	@BeforeMethod
	public void g()
	{
		Reporter.log("Before Method", true);
	}
	
	@AfterMethod
	public void h()
	{
		Reporter.log("After Method", true);
	}
}
