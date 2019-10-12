package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups="Smoke")
	public void runSmoke1()
	{
		Reporter.log("smoke test 1",true);
	}
	
	@Test(groups="Smoke")
	public void runSmoke2()
	{
		Reporter.log("smoke test 2",true);
	}
	
	@Test(groups="Regression")
	public void runRT()
	{
		Reporter.log("Regression",true);
	}
	
	
	@Test(groups="FT")
	public void runFT()
	{
		Reporter.log("Functional Test",true);
	}
	
	@Test(groups="IT")
	public void runIT1()
	{
		Reporter.log("Integration Test 1",true);
	}
	
	@Test(groups="IT")
	public void runIT2()
	{
		Reporter.log("Integration Test 2",true);
	}
	
	@Test(groups="ST")
	public void runST()
	{
		Reporter.log("System Test",true);
	}
	
	@Test(groups={"Smoke,Regression"})
	public void runSTandRT()
	{
		Reporter.log("Both Smoke and Regression test",true);
	}
	
	@Test(groups= {"IT,ST"})
	public void runITandST()
	{
		Reporter.log("Both Integration and System Test",true);
	}
	

	@Test(groups={"FT","ST"})
	public void runITorST()
	{
		Reporter.log("Either Integration and System Test",true);
	}
	
	

}
