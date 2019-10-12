package javaPrograms;

public class ReverseTheStringWithEachWordOfLetters {
	public static void main(String[] args) {
		String s="wellcome to qspiders btm ";
		

//		int count = s.length();
		
//		//Reverse the String 
//		for(int i=count-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//			
//		}
		
		//Reverse the each word of letter in given String
		String []words=s.split(" ");
		String reverseString="";
		
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String reverseLetter = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseLetter=reverseLetter+word.charAt(j);
			}
			reverseString=reverseString+reverseLetter+" ";
		}
		
		System.out.println(reverseString);
		
	}

}
