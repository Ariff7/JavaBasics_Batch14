package review_Loops_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Scanner_Loop_All_in_One {

	public static void main(String[] args) {

  Scanner scan= new Scanner(System.in);
  System.out.println("Please enter the number of dresses you want to buy");
  int number=scan.nextInt();
  
   double[] prices=new double[number];
		
   for(int i=0; i<number; i++)  {
	   System.out.println("Please enter the price of the dress "+ (i+1));
	   prices[i]=scan.nextDouble();
   } 
   System.out.println(Arrays.toString(prices));
   
   double sum=0;
   for(double price:prices) {
	   sum+=price; //or sum=sum+price
   }System.out.println("Total for all the dresses = " +sum);
   
	}

}
