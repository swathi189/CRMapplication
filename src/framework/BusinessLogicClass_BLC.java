package framework;

public class BusinessLogicClass_BLC {
	
	// Declaration
	private double acBal;

	// Initialization
	public BusinessLogicClass_BLC(double acBal)
		{
			this.acBal=acBal;
		}

	// Utilization
	public void getAcBal() {
		System.out.println(acBal + 100);
	}

}
