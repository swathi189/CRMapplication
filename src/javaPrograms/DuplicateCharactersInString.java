package javaPrograms;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		String str="Qspiders Student";
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate characters are ==>  "+ch[j]);
				}
			}
		}
		

	}
	
	
	

}
