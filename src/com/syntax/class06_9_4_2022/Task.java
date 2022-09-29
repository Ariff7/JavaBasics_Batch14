package com.syntax.class06_9_4_2022;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan= new Scanner(System.in);
		
		
		
		Scanner scan1= new Scanner(System.in);
		System.out.println("Please enter your grade");
		
		char grade=scan1.next().charAt(0);
		
		String x;
		
		switch(grade) {
		
		case 'A':
			x="Excellent";
			break;
		case 'B':
			x="Good";
			break;
		case 'C':
			x="Average";
			break;
		case 'D':
			x="Bad";
			break;
			default:
				x="Not acceptable";
		}
		
  System.out.println("Your grade is " +grade+ " and it means " +x);
	}

}
