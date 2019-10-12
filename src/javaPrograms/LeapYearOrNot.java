package javaPrograms;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = in.nextInt();
		
		if(((year%4==0) ||(year%400==0)) && (year%100!=0))
		{
			System.out.println(year+" is a Leap year");
		}
		else
		{
			System.out.println(year+" is not a Leap year");
		}
	}

}
