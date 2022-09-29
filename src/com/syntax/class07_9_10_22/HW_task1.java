package com.syntax.class07_9_10_22;

import java.util.Scanner;

public class HW_task1 {

	public static void main(String[] args) {
		//task1
		for(int i=1;i<=100;i++) {
			System.out.print(i+ " ");
		}
		
		System.out.println("\n"); 
		//task2
		for (int i=100; i>=1;i--) {
			System.out.print(i+ " ");
		}
		
		System.out.println("\n");
		
		//task3 one way
		int i=20;
		while(i>=1) {
			if(i%2==0) {
				System.out.print(i+ " ");
			}i--;
		}
		
		System.out.print("\n");
		
		//task3 second way
		int I=20;
		while(I>=1) {
			System.out.print(I+ " ");
			I-=2;
		}
		System.out.print("\n");
		
		//TASK4
		 
		int z=20;
		while(z<=50) {
			if(!(z%2==0)) {
				System.out.println(i+ " ");
			}
			i++;
		}
		
		//task4 second way
		
		int k=21;
		while(k<=50) {
			System.out.println(k+" ");
			k++;
		}
		
		//task5
		
		for(int a=1; a<=3; a++ ) {
			System.out.println("What is your name?");
		}
			Scanner scann=new Scanner(System.in);
			String name=scann.nextLine();
			System.out.println("Good afternoon " + name);
	
		
		
	}

		
	}

