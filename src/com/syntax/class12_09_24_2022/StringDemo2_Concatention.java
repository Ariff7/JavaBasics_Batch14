package com.syntax.class12_09_24_2022;

public class StringDemo2_Concatention {

	public static void main(String[] args) {

   String firstName="Arif";
   String lastName="Aliyev";
		
   System.out.println(firstName+lastName);
   
   System.out.println("-----");
   
   //Concatenation
   
   System.out.println(firstName.concat(lastName));
   System.out.println("-----");
   
   //Concatenation with space
   
   System.out.println(firstName.concat(" ").concat(lastName));
   
   String str=" ";
   
   //
   
   System.out.println(str.isEmpty());

   
		
	}

}
