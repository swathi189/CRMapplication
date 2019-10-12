package javaPrograms;

public class PrintEachWordOfGivenString {
	public static void main(String[] args) {
//		String s1="abc xyz uvw ADE";
		String s1="THE LOVE";
		char ch[]=s1.toCharArray();
		
		int start=0, last=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				start=i;
				
				for(int j=i+1;j<ch.length;j++)
				{
					if((j==ch.length-1 && ch[j]!=' ')|| (ch[j]!=' ' && ch[j+1]==' '))
					{
						last=j;
						break;
					}
				}
				
				//printing each word
				
//				for(int k=start;k<=last;k++)
//				{
//					System.out.print(ch[k]);
//				}
				
				//printing each word in reverse
				for(int k=last;k>=start;k--)
				{
					System.out.print(ch[k]);
				}
				
				System.out.println();
				
				i=last;
			}
		}
		
	}

}
