package GROUP_Project_;

import java.util.Arrays;
import java.util.Scanner;

public class task1__ {

	public static void main(String[] args) {

// Using Scanner create an array of integer values. After
//the array is created, calculate the sum of all stored
//elements in that array.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		
	//asks user for a number
		int size=scan.nextInt();
		int[] arr= new int[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter an Int number");
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));	

int sum=0;
for(int num:arr) {
	sum+=num;
}

System.out.println("Sum of all the number from the array is " +sum);
	}

}
