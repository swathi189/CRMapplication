package javaPrograms;

public class ReverseTheNumber {
	public static void main(String[] args) {
		int i=1234;
		int x=0;
		while(i>0)
		{
			x=(x*10)+i%10;
			i=i/10;
		}
		System.out.println(x);
		
	}

}
