import java.util.Scanner;

public class task5__ {

	public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
System.out.println("Enter number of years of service");
int years=scan.nextInt();

if (years>=5)
{
	System.out.println("You are eligible for a bonus!");
}

System.out.println("Enter your annual salary");
int salary=scan.nextInt();
if (salary>50000) {
	System.out.println("You will receive a bonus of 5000! ");
} else {
	System.out.println("You will receive a bonus of only 3000 sorry :( ");
}

	
	 System.out.println("you are not eligible for a bonus");
 
 
 }
 

}	


