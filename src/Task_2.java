import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" Enter the mortage rate please ");
		
		int rate=input.nextInt();
		if(rate>4.5)
		{
			System.out.println("No house for you :( ");
		}
		{
		}
 System.out.println(" I will buy  a house");
 System.out.println(" What is the price of the house ");
		int price=input.nextInt();
		if (price>200000)
		{
			System.out.println("Taking loan would be better for you");
			System.out.println("How much money would you like like to take as a loan");
			
			int MorgPrice=input.nextInt();
			if(MorgPrice<=200000)
		
			{
				System.out.println("I have the money to afford this house");
			}
		}
	}

}
