package com.syntax.class12_09_24_2022;

public class StringDemo_6_charAt_ {

	public static void main(String[] args) {

 String str="I love java programming";
 
 //charAt returns the character at a specific index
 
 System.out.println(str.charAt(0));
 
 System.out.println("-----");
 
 
 
 for(int i=0; i<str.length(); i++) {
	 System.out.println(str.charAt(i));
	
 }
 
 System.out.println("------");
 
 System.out.println(str.charAt(2));
 
 System.out.println("------");
 
 String str2="Youre awesome";
char letter=str2.charAt(6);
System.out.println(letter);
	}

}
