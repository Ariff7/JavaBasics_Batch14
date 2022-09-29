package Some.Interview.questions;

public class task_3 {

	public static void main(String[] args) {
		
		
		 int[][] numbers = {
				 { 25, 10, 7, 21 }, 
				 { 13, 1, 4, 0 },
				 { 50, 45, -2, 19 }, 
				 };
		 
	        int sum = 0;

	        for (int[] num:numbers) {
	            for (int n:num) {
	                sum+=n;
	            }
	        }
	            System.out.println(sum);
	        }

	    
	
}
		

	


