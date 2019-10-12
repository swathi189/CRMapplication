package javaPrograms;

public class ShiftTwoCharctersToRightPosition {
	
	public static void main(String[] args) {
		
		String s="abcdefg";
		
		char ch[]=s.toCharArray();
		
		int num=1;
		while(num<=2)
		{
			char temp=ch[ch.length-1];
			
			for(int i=ch.length-2;i>=0;i--)
			{
				ch[i+1]=ch[i];

			}
			ch[0]=temp;
			
			num++;
		}
		System.out.print(ch);

	}	
	
	
}
