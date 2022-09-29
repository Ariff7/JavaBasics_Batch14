package com.syntax.class06_9_4_2022;

public class LogicalOperatot_Not_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean boo=!true;
		System.out.println(boo);    //false
		
		boolean boo1=!false;
		System.out.println(boo1);    //true
		
		boolean rain=false;
		
		if(!rain) 
		{
			System.out.println("I will go for a walk");
		}
		
		String day="Sunday";
		
		if(!day.equals("Sunday"))
		{
			System.out.println("Not Sunday Buddy");
		}
		
		
	}

}
