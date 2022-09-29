package com.syntax.class06_9_4_2022;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * we need to ask a user where he or she is from
		 *based on the country and define favorite food
		 */
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Where are you from?");
		
		String country=scan.nextLine();
		
		String language;
		
		
		switch(country) {
		
		case "USA":
			language="English";
			break;
		case ("Japan"):
			language="Japanese";
		    break;
		case "Turkey" :
			language="Turkish";
		    break;
		case "Saudia Arabia":
			language="Arabic" ;
		    break;
		case "Russia" :
			language ="Russian";
			break;
		default:
			language= "Unknown";
		    break;
		    
		}
		
		System.out.println("You are from " +country+ " and you speak " +language);
		  
		
			
			
			
		}
		
		
		
		
	}


