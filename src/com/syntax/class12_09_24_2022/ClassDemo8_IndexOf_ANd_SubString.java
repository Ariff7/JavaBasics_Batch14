package com.syntax.class12_09_24_2022;

public class ClassDemo8_IndexOf_ANd_SubString {

	public static void main(String[] args) {

		String str="I am always confused";
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("s"));
		System.out.println(str.indexOf(" "));
		
		System.out.println(str.substring(5));
		
		System.out.println("----");
		
		System.out.println(str.substring(5,11));
		
		System.out.println("------");
		
		String str2="Today is Sunday Funday ";
		String day=str2.substring(6,8);
		System.out.println(day);
		



	}

}
