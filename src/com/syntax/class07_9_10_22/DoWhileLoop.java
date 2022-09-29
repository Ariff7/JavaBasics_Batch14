package com.syntax.class07_9_10_22;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		
		do {
			
			System.out.println("I am do while loop");
			num++;
		}while(num<=3);
		
		
		
		/*
		 * 
		 */
		
		Scanner scan= new Scanner (System.in);
		String answer;
		

   
        do {
            System.out.println("Did you get a job?");
            answer = scan.nextLine();

        } while (!answer.equals("yes"));

        System.out.println("Congrats");
        
        
        //while loop would be useful when you dont know how many loops you need
        
        
    }

	}


