package javaPrograms;
import java.lang.StringBuffer;

public class StringBufferIsMutable {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("abcd");
		StringBuffer s3 = new StringBuffer("abcd");
		StringBuffer s2 = new StringBuffer(8);
		 System.out.println(s1);
		 System.out.println(s1.capacity());
		 System.out.println(s2);
		 System.out.println(s1.hashCode());
		 System.out.println(s1);
		 System.out.println(s3.hashCode());
		 System.out.println(s1.append(s3));
		 System.out.println(s1.hashCode());
		 System.out.println(s1);
		 
		
		
		
	}

}
