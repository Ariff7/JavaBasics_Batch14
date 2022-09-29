package com.syntax.class07_9_10_22;

public class WhileLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Print numbers from 100 to 1

Print even numbers from 20 to 100 

Print only odd numbers from 100 to 1
(2 different ways)
		 */
		
		
		int a=100;
		while(a>=1) {
			System.out.print(a+ " ");
			a--;
		}
		
		System.out.println("\n");
		
		int b=20;
		while(b<=100) {
			if(b%2==0) {
				System.out.print(b+ " ");
				b+=2;
			}
		}
		System.out.println("\n");
		  int c = 100;

	        while (c >= 1) {
	            if (c % 2 != 0) {
	                System.out.print(c + " ");
	            }
	            c--;
	        }

	        
	        System.out.println("\n");

	        int d = 99;
	        while (d >= 1) {
	            System.out.print(d + " ");
	            d -= 2;
	        }

	    }

	
		
		
		}
		
		
	


