package com.syntax.class12_09_24_2022;

public class StringDemo5_Equals_And_IgnoreCase {

	public static void main(String[] args) {

  String str="Arif";
  
  String str2="Arif";
  
  String str3=new String("Arif");
  
  //equlas check if two String are exactly the same with exact same case
  // equalsIgnoreCase checks if two Strings aare exactly the same but does not care about the
  // case of letters
  
  if(str.equals("arif")) {
	  System.out.println("I found it");
  }

  if(str.equalsIgnoreCase("arif")) {
	  System.out.println("I found it with equalsIgnoreCase");
  }
  
  
	}

}
