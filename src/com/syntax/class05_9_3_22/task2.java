package com.syntax.class05_9_3_22;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the day");
Scanner scan=new Scanner(System.in);
	int day=scan.nextInt();
	if(day>=1 && day<=5)
		System.out.println("Its a weekday");
	else if((day==6 || day==7))
System.out.println("Its a weekend");
	 else {
		 System.out.println("Invalid");
	 }
		

}
}

