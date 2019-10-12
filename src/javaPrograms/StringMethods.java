package javaPrograms;

public class StringMethods {
	public static void main(String[] args) {
		String s1=new String("welcome to banglore");
		String s2 = new String(" welcome to bang ");
		System.out.println(s1.length());  //19
		System.out.println(s2.length());  //17
		
		System.out.println(s1.isEmpty()); //false
		System.out.println(s1.charAt(2));  //1
		System.out.println(s1.indexOf('o'));  //4
		System.out.println(s1.indexOf('o',5));  //9
		System.out.println(s1.indexOf("loc"));  //-1
		System.out.println(s1.indexOf("loc",6)); //-1
		System.out.println(s1.lastIndexOf('o'));  //16
		System.out.println(s1.lastIndexOf('o',3));  //-1
		System.out.println(s1.lastIndexOf("com")); //3
		
		System.out.println(s1.lastIndexOf("ban",14)); // 11
		System.out.println(s1.lastIndexOf("ban",10)); //-1

		
		System.out.println(s1.contains("o"));  //true
		System.out.println(s1.concat(s2)); // welcome to banglore welcome to bang
		System.out.println(s1.substring(3,6));  //com
		System.out.println(s1.substring(9)); // o banglore
		System.out.println(s2.trim());  //welcome to bang
		String s[]=s1.split(" ");  
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);  //welcome
										//to
										//banglore
		}










		
	}

}

