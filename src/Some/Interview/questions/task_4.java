package Some.Interview.questions;

public class task_4 {

	public static void main(String[] args) {
	
		 int[][] arr= {
	                {10, 20, 30, 40, 47, 67}, 
	                {100, 200, 300, 400, 437, 607}, 
	                {1, 2, 3, 4, 5, 7} 
	        };

	        for(int i=0; i<arr.length; i=i+1) { 

	            for(int j=0; j<arr[i].length; j=j+1) {

	                if(arr[i][j] % 2 == 0)
	                    System.out.println(arr[i][j]);
	            }
	        }
	    }
	}
	
	


