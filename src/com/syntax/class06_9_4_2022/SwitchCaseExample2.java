package com.syntax.class06_9_4_2022;

import java.util.Scanner;

public class SwitchCaseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan= new Scanner(System.in);
		
		
		
		
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
				
		case 'N':
			answer= "No";
			break;
		case 'M':
			answer= "Maybe";
			break;
			
		default:
			answer="Unkown";
			break;
		}
		
		System.out.println(answer);
		
	}

}
