package com.syntax.class12_09_24_2022;

public class StringDemo_FindLength {

	public static void main(String[] args) {

		
//proper way of creating an object
		
String str=new String("Java");

//simpler and shorter way provided by JAva creator to make our life a lil easier

String name=("Arif The Beast !"); //only works for String and Wrapper classes

//counts the number of character in a string including spaces

System.out.println(str.length()); 
System.out.println(name.length());

if(name.length()>15) {
	System.out.println("Name can't be more than 15 characters");
}

	}

}
