import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		Boolean Credit;
		
		System.out.println(" Do you have a credit card? ( Say True or False)");
		Credit=scan.nextBoolean();
		if(Credit)
		{
			System.out.println("Enter the balance in your card");
			int balance=scan.nextInt();
			if(balance<1000)
			{
				System.out.println("Please pay off immediately! ");
			}
			else
			{
				System.out.println("Keep spending, you got the cash for it");
			}
		}

	}

}
