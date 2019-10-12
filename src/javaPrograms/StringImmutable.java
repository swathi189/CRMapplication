package javaPrograms;

public class StringImmutable {
	public static void main(String[] args) {
		String s1="welcome to banglore";
		String s2="welcome to banglore";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1==(s1.concat(s2)));

	}

}
