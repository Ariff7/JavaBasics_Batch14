package Some.Interview.questions;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		
	
		int numbers[] = {20, 50, 14, 8, 32};

		Scanner scan=new Scanner(System.in);
	    int sum = 0;
        int[]num=new int[4];
        System.out.println("Please enter your 4 numbers");
	    
        for(int i:num) {
        	int a=scan.nextInt();
        	
        	sum+=a;
        }
        
	    System.out.println(sum);
		

	}

}
