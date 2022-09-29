package com.syntax.class08_9_11_2022;

import java.util.Scanner;

public class LastClassReview {

	public static void main(String[] args) {
		
		
		Scanner in  = new Scanner (System.in);
        //System.out.println("Please guess my number");
        int num;
        int myNum=8;
        System.out.println("Please gusess my number from 1 to 100");

        do {

            num= in .nextInt();
            if(num>myNum) {
                System.out.println("your # is higher than my number, please try again");
                //user= in.nextDouble();
                }else if(num<myNum){
                    System.out.println("your # is lower than my number, please try again");
                    //user= in.nextDouble();
                }
        }while(myNum !=num);

        System.out.println("you won !");



		
       
        int sumOdd = 0;
                int sumEven = 0;

                for (int i = 1; i <= 50; i++) {
                    if (i % 2 == 0) {
                        sumEven += i;
                    } else {
                        sumOdd += i;
                    }
                }
                System.out.println("SUM OF ODD NUMBERS = " + sumOdd);
                System.out.println("SUM OF EVEN NUMBERS = " + sumEven);
        
       

       }
    }
		
		
	

