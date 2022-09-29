package com.syntax.class05_9_3_22;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name=scan.next();
		
		System.out.println("Please enter your age");
		
		int age=scan.nextInt();
		
		System.out.println("How much money you have boss");
		
		double money=scan.nextDouble();
		
		System.out.println("What is your grade my brother");
		
		char grade=scan.next().charAt(0);
		
		System.out.println(name+ " is " +age+ "years old and has $"  +money+ " And your grade is an " +grade);
		
		
		
	}

}
