package com.syntax.class04;

public class NestedIfCondition {

	public static void main(String[] args) {
		
		int time=5;
        String day="monday";
        if (day.equals("monday")) 
        {if (time>7) {System.out.println("lets go to office");}}
        
        if(time<6) {
        	System.out.println("lets sleep more");
        }
        
	
		}
}