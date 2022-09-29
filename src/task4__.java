import java.util.Scanner;

public class task4__ {

	public static void main(String[] args) {

Scanner scan=new Scanner (System.in);

System.out.println("How old are you Boss");
int old=scan.nextInt();
if (old>=18)
{
	System.out.println(" You will be issused a drivers license");
}
else {
	System.out.println("You can get a learner's permit instead");
}
	}

}
