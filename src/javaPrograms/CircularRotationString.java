package javaPrograms;


public class CircularRotationString {
	public static void main(String[] args) {
		String s="I LOVE BANGLORE";
		String []words = s.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			int j=0;
			
			while(j<words.length)
			{
				int k=(j+i)%words.length;
				System.out.print(words[k]+" ");
				j++;
			}
				
			System.out.println();	
				
		}
		
	
		
	}
	

}
