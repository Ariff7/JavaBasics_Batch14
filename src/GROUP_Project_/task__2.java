package GROUP_Project_;

import java.util.Arrays;
import java.util.Scanner;

public class task__2 {

	public static void main(String[] args) {

		/*
         * Using Scanner create an array of countries. When an array is created,
         * retrieve all values from it and while retrieving those values print capital
         * for each country. (use 2 different loops)
         */
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter how many countries you want to store");
		int size=scan.nextInt();
		
		//two oneD array, one for country , one for capita;
		String[]countries= new String[size];
		String[] capital= new String[size];
		
		//This is just to consume that extra enter that we will get from line num 19
		scan.nextLine();
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter the country name");
			countries[i]=scan.nextLine();
			
			System.out.println("Please enter the capital for the "+countries[i]);
			countries[i]=scan.nextLine();
			
		}
		//printing the arrays in a good format
		System.out.println(Arrays.toString(countries));
		System.out.println(Arrays.toString(capital));
		
		
		
		}
	}


