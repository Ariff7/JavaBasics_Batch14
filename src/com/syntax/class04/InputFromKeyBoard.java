package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard {

	public static void main(String[] args) {
		//Scanner- a class that helps us take the input from the keyboard 
		//it contains many different smaller modules called methods that can help us take Strings booleans basically all types of data from the keyboard
		
		
		

  Scanner input= new Scanner (System.in);
  System.out.println("Please enter your name bruh");
  String name=input.next();
  
  System.out.println("Hello " +name+  " dont be confused");

	}

}
