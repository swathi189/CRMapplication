package javaPrograms;

public class ReverseOddIndexOfCharactersInGivenString {
	public static void main(String[] args) {
		String s1="aefghtug";
		char []ch=s1.toCharArray();
		int j;
		
		if(ch.length%2==0)
		{
			j=ch.length;
		}
		
		else
		{
			j=ch.length-1;
		}
		
		for(int i=0;i<ch.length/2;i++,j--)
		{
			if(i%2!=0 && j%2!=0)
			{
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
			
		}
		
		System.out.println(ch);
	}

}
