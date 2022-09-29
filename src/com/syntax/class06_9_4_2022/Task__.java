package com.syntax.class06_9_4_2022;

import java.util.Scanner;

public class Task__ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter your country");
		Scanner scan=new Scanner(System.in);
		String country=scan.nextLine();
		String language;
		
	switch (country) {
			
	case "USA":
		 language="English";
	     break;
	case "Russia":
		language="Russian";
		  break;
	case "Turkey":
		language="Turkish";
		  break;
	case "Saudia Arabia":
		language="Arabic";
		break;
	case "Germany":
		language="German";
		break;
		default:
		language="Unkown";
		break;
		
	}
		System.out.println("You are from " +country+ " and you speak " +language);
				
	}	
		
	

}

