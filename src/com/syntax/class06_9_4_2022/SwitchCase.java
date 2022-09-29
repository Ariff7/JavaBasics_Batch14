package com.syntax.class06_9_4_2022;

import java.util.Scanner;

public class SwitchCase {

	
	public static void main(String[] args) {

		int number=19;
		if(number!=18) {
			System.out.println("this number is not 18");
		}
		
		int day=10;
		
		if (day==1) {
			System.out.println("Monday");
		} else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
		 System.out.println("Friday");
		}else if (day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Please enter a valid day number (1-7)");
		
			System.out.println("Please enter a valid day " + "Sunday" +"-"+ "Sunday");
	Scanner scan= new Scanner(System.in);
String DayOfWeek=nextLine();
 String name=null;
	
	switch (day) {
	case 1:
		name="Monday";
		break;
	case 2:
		name="Tuesday";
		break;
	case 3:
		name="Wednesday";
		break;
	case 4:
		name="Thursday";
		break;
	case 5:
		name="Friday";
		break;
	case 6:
		name="Saturday";
		break;
	case 7:
		name="Sunday";
		break;
		
	}
	
		}
	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
}
