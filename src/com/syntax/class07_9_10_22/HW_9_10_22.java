package com.syntax.class07_9_10_22;

import java.util.Scanner;

public class HW_9_10_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);

        double price=5.99;
        double user=0.0;

        do {

            Scanner in=new Scanner(System.in);
            System.out.println("Please pay for the coffee");
            user=in.nextDouble();
            if(user>price) {
                System.out.println("Please give less than price");
                user=in.nextDouble();
            } else if(user<price) {
                System.out.println("Please give more than price");
                user=in.nextDouble();
            }
        }while(user!=price);

        System.out.println("Please enjoy your coffee");


    }

		
		
		
	}


