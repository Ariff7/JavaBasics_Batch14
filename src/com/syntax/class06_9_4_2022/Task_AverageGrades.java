package com.syntax.class06_9_4_2022;

import java.util.Scanner;

public class Task_AverageGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Quiz Score?");
        double quiz = input.nextDouble();
        System.out.println("Please Enter your mid term Score?");
        double midterm = input.nextDouble();
        System.out.println("Please Enter your Final Score?");
        double Final = input.nextDouble();
        double average;
        String grade = "null";

        average = (quiz+midterm+Final)/3;

        if(average>=90 && average<=100) {
            grade = "A";
        }else if(average>=70 && average<90) {
            grade = "B";
        }else if(average>=50 && average<70) {
            grade = "C";
        }else if(average<50) {
            grade = "F";
        }else {
            System.out.println("Please enter valid score!");
            grade ="None";
        }
        System.out.println("Grade: "+grade);





    }


		
	}


