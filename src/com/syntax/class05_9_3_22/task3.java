package com.syntax.class05_9_3_22;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args ) {
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Please enter a number from 1-1000");
		
		int number=scan.nextInt();
		
		if(number>=0 && number<11) {
			System.out.println("Number is small");
	}
	else if(number>=10 && number<101) 
	{
		System.out.println("Number is medium");
	} else if(number>=100 && number<1001) {
		System.out.println("Number is large");
		
		
		
		
	}
	
	
	
}
}


