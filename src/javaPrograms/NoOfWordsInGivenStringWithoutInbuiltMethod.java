package javaPrograms;

public class NoOfWordsInGivenStringWithoutInbuiltMethod {
	public static void main(String[] args) {
		String s1="  WELCOME  TO  GOA  ";
		char ch[]=s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if((i==ch.length-1 && ch[i]!=' ') || (ch[i]!=' ' && ch[i+1]==' '))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
