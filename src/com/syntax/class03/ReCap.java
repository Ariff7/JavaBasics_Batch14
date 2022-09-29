package com.syntax.class03;

public class ReCap {

	public static void main(String[] args) {
		
		// String concatenation helps us combine a String with any primitive data type together
		// We can
		
		
		
		String firstName="Arif";
		String lastName="Aliyev";
		String fullName=firstName+ " " +lastName;
		System.out.println(fullName);
		
		int houseNo=10;
		int apartmentNo=5;
		String streetName="That street";
		String city="NewYork";
		String country="USA";
		String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country;
		System.out.println(fullAddress);
		
		String incompleteAddress= houseNo+city;
		
		String step1="if we subtract 10 from 5 we get=" +10;
		 //undefined, java does not know what to do when we ask her to subtract a String from number it complains
		//String step2= step1 - 5;
		
	
		System.out.println("if we subtract 10 from 5 we get =" +(10-5));
		
		/*
		 * Addition=>+
		 * Subtraction=>-
		 * Multiplication=>*
		 * Division=> /
		 * Modulus=>%
		 */
		
		int number1=10;
		int number2=5;
	
		
		

	}

}
