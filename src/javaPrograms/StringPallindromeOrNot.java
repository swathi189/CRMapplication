package javaPrograms;

public class StringPallindromeOrNot {
	public static void main(String[] args) {
		//String s="MALAYALAM";
//		String s="MALAYALAM";
		
		String s="9102019";
		char[] ch = s.toCharArray();
		for(int i=0,j=ch.length-1;i<=ch.length/2;i++,j--)
		{
			if(ch[i]!=ch[j])
			{
				break;
			}
			if(i==ch.length/2)
			{
				System.out.println("given String "+s+" is pallindrome");
			}
			
			
		}
		
		
	}

}
