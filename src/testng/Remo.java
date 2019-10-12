package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo extends Annotations{
	
	@Test
	public void sun()
	{
		Reporter.log("I am sun meth of Remo Class",true);
	}
	
	@Test
	public void bun()
	{
		Reporter.log("I am bun meth of Remo Class",true);
	}

}



/** @Test(priority=2)
	public void bun()
	{
		Reporter.log("I am bun method of Remo class", true);
	}
	
	@Test(priority=1, enabled=false)
	public void sun()
	{
		Reporter.log("I am sun method of Remo class", true);
	}    */
