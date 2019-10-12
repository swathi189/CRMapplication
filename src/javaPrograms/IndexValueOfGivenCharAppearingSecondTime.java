package javaPrograms;

public class IndexValueOfGivenCharAppearingSecondTime {
	public static void main(String[] args) {
		String s1="adbssaabbefghthht";
		char ch[]=s1.toCharArray();
		
		//With using inbuilt method
		System.out.println("With using inbuilt method");
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', s1.indexOf('a')+1));
		
		
		//Without using inbuilt method
		System.out.println("Without using inbuilt method");
		int count=0;
		for(int i=0;i<ch.length;i++)
		{	
			if('a'==ch[i])
			{
				count++;
				if(count==2)
				{
					System.out.println(ch[i]+"="+i);	
				}
						
			}
						
		}			
			
		
	}
	

	

}
