package javaPrograms;

public class ReverseTheString {
	public static void main(String[] args) {
		
		String s1="WE LOVE BANGLORE";
		String[] words = s1.split(" ");
		String reverseString ="";
		
		for(int i=0;i<words.length;i++)
		{
			if(i==words.length-1)
			{
				reverseString=words[i]+reverseString;	
			}
			
			else
			{
				reverseString=" "+words[i]+reverseString;
			}
		}
		System.out.println(reverseString);
	}
	

}

