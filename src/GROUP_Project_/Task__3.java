package GROUP_Project_;

public class Task__3 {

	public static void main(String[] args) {
		// create a 2d array of integer values. Print the sum of all numbers
		
		
		int[][] arr= {
				{10, 10, 10, 20},
				{25, 30, 54},
				{20,30}
		};
		
		//enchanced loop
		
		int sum=0;
		for(int[] a:arr) {
			for(int num:a) {
				sum+=num;
			}
		}
		System.out.println(sum);


	}
}
