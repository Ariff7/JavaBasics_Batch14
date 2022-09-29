package com.syntax.class12_09_24_2022;

public class StringDemo4_Starts_Contains_Ends {

	public static void main(String[] args) {
	
		String str2="Java is very easy";
		
		
		
	      System.out.println(str2.startsWith("j"));
	      
	      System.out.println(str2.endsWith("easy"));
		
	      System.out.println(str2.contains("very"));
	      
	      System.out.println("----------");
	      
	      System.out.println(str2.contains("Very"));
	      
	      System.out.println(str2.toLowerCase().contains("very"));
	      
	}

}
