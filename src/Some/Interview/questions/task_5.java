package Some.Interview.questions;

public class task_5 {

	public static void main(String[] args) {


		 int[][] OddEven = {
		            { 1, 3, 5, 7, 9, 11 },
		            { 2, 4, 6, 8, 10 }
		        };

		        int sumOdd = 0;
		        int sumEven = 0;

		        for(int[] even : OddEven) {
		            for(int num : even) {
		                if(num % 2 == 0) {
		                    sumEven = sumEven + num;
		                } 
		                else
		                {
		                    sumOdd = sumOdd + num;
		                }
		            }
		        }

		        System.out.println("The sum of the even numbers is: " + sumEven);
		        System.out.println("The sum of the odd numbers is: " + sumOdd);
		
		
	}

}
