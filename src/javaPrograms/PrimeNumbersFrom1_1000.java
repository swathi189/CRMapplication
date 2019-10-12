package javaPrograms;

public class PrimeNumbersFrom1_1000 {
	public static void main(String[] args) {
		int num=1;
		
		while(num<=1000)
		{
			int i=2;
			while(i<num)
			{
				if(num%i==0)
				{
					break;
				}
				i++;
			}
		
			if(i==num)
			{
				System.out.println("prime number : "+num);	
			}
			
		
//			else
//			{
//				System.out.println("not a prime number : "+num);
//			}
		
			num++;
		}
			
				
	}

}
