package GROUP_Project_;

public class task__4 {

	public static void main(String[] args) {
		
		//create a 2d array where you will store odd and even numbers
		//Develop a program which will print the even number only

		int[][] arr= {
				{10, 11, 10, 20},
				{25, 33, 54},
				{20,30}
		};
		
		
		//enchanced loop
		
		for(int[] a:arr) {
			for(int num:a) {
				if(num%2==0) {
					System.out.println(num);
				}
			}
		
		}
	}
}


