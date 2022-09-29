package GROUP_Project_;

public class task__5 {

	public static void main(String[] args) {

// Create a 2D array of integers. Develop a program
//which will calculate the sum of even and odd numbers for that array
		

		int[][] arr= {
				{10, 11, 10, 20},
				{25, 33, 54},
				{20,30}
		};
		
		
		//enchanced loop
		
	int evenSum=0;
	int oddSum=0;
		
		
		for(int[] a:arr) {
			for(int num:a) {
				if(num%2==0) {
					evenSum+=num;
				}else {
					oddSum+=num;
				}
			}
		
		}
		System.out.println("Odd Sum "+ oddSum);
		System.out.println("Even Sum " + evenSum);

	}

}
