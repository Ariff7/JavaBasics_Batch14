import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter your city");
		String city=scan.next();
		System.out.println("Please enter the temperature");
		int temp=scan.nextInt();
		int celsius=(temp-32)*5/9;
		System.out.println(" The temperature of "+city+" in celsius is "+celsius);
		
		
		
	
	}

}
