package javaPrograms;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int num=153, number, temp, sum=0;
		number=num;
		
		while(number!=0)
		{
			temp=number%10;
			sum=sum+temp*temp*temp;
			number=number/10;
		}
		
		if(sum==num)
		{
			System.out.println(num+" is Armstrong number");
		}
		else
		{
			System.out.println(num+" is not a Armstrong number");
		}
		
	}
	
	

}
