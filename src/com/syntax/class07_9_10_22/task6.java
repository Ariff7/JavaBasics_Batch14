package com.syntax.class07_9_10_22;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
	
		double price=2.99;
		double user=0.0;
		
		do {
			Scanner scan=new Scanner(System.in);
			System.out.println("Please pay for the cofee");
			user=scan.nextDouble();
			
			if(user>price) {
				System.out.println("Please give less");
				user=scan.nextDouble();
			} else if (user<price) {
				System.out.println("Please give more buddy");
				user=scan.nextDouble();
			}
		}while (user!=price);
		System.out.println("Please enjoy your coffee");
				
				
		

	}

}
