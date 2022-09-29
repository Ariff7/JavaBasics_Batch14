package com.syntax.class07_9_10_22;

public class ForLoop {

	public static void main(String[] args) {
		// when to use which loop?
		
		 //FOR LOOP - when we known in advance how many times to repeat block of code
         // WHILE or DO-WHILE - when we do not know how many times to repeat block of code
		//
	for (int i=1; i<=5 ; i++) {
		System.out.println("Bmw the best");
	}
		
	
	
	//Print numbers from 1 to 20
	
	for (int i=1; i<=20; i++) {
		System.out.println(i+ " ");
	}
	
	//print numbers from 30 to 10
	
	for (int i=30; i>=10; i--) {
		System.out.print(i+ " ");
	}
	
	int sum=0;
	
	for(int i=1; i<=6; i++) {
		sum+=i;
	}System.out.print(sum);
	}

}
