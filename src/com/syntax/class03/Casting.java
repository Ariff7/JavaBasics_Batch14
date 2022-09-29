package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		/* 
		 * Type casting=> converting one data type to another
		 * -  Why should I learn ?-so we can use the code written by someone else to make our life easier
		 * or when we will be working in teams we will be able to merge the code
		 * -  What is the syntax of casting? - converting small to large we dont do anything , it happens automatically we just assign the variables
		 * converting large to small -- long box=1234545;
		 *                              int box2=(int) box;
		 * 
		 */

		byte box1=127; //smallest box
		short box2=3333; //slightly larger
		int box3=45454545; // large box most commonly used
		long box4=45454545; //slightly large box
		float box5=414564545; //large box
		double box6=454545445; //largest
		
		int number=(int)15.2; //we cant store the decimal in a box of type double
		System.out.println(number);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);
		
		short biggerBox=box1;
		
		long box7=box1; // we can do this because box 7 is larger than box 1
		
		// as box6 is larger it is double we need type casting to assign the value
		float box8=(float)box6;
		
		char a=(char)67;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
		
		
		
		
	}

}
