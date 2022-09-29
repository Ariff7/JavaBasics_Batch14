package com.syntax.class05_9_3_22;

import java.util.Scanner;

public class TaskHw9_3_2022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your height in inch");
		double height= scan.nextDouble();
		
		if(height<60) {
			System.out.println("you are short");
		} else if(height>=60 && height<-72)
			System.out.println("You are medium height");
		 else if(height>=72)
			System.out.println("you are tall");
	else
		System.out.println("Invalid");
	
	}

}
