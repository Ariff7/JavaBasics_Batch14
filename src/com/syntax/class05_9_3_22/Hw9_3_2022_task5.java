package com.syntax.class05_9_3_22;

import java.util.Scanner;

public class Hw9_3_2022_task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter your birthday month");
		String bday=scan.nextLine();
		
		String Season=null;
		
		if(bday.equals("December") || bday.equals("January") || bday.equals("Febuary")) {
			 Season="Winter";
		}else if(bday.equals("March") || bday.equals("April") || bday.equals ("May")) {
			 Season="Spring";
		}else if(bday.equals("June") || bday.equals("July") || bday.equals ("August")) {
			 Season="Summer";
	}else if(bday.equals("September") || bday.equals("October") || bday.equals ("November")) {
		     Season="Fall";
	}else
	
	{Season="Invalid Month";
	}
		System.out.println("You were born in " +Season);
	
	
	 
		{	

	}
		
	}
	}


