package com.syntax.class06_9_4_2022;

import java.util.Scanner;

public class task_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter 1st number");
		double num1=scan.nextDouble();
		
		System.out.println("Please enter 2nd number");
		double num2=scan.nextDouble();
		
		System.out.println("Provide the operator you want to use");
		char operator=scan.next().charAt(0);
		double result=0;
				
		if (operator=='+');
		{
			result=num1+num2;
		} if (operator=='-') {
			result=num1-num2;
		}else if (operator=='*') {
			result=num1*num2;
		} else if(operator=='/') {
			result=num1/num2;
		} else {
			System.out.println("Please enter  a valid operator");
		}
	System.out.println(result);
		
	switch (operator) {
	case '+':
		result=(num1+num2);
		break;
	case '-':
		result=(num1-num2);
		break;
	case '*':
		result=(num1*num2);
		break;
	case '/':
		result=(num1/num2);
		break;
		default:
			System.out.println("Please enter a valid operator");
		
	}
	
	System.out.println("The result is " + result);
}
	
		
	

}


