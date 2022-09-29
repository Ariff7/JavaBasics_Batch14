package com.syntax.class08_9_11_2022;

public class regw {

	public static void main(String[] args) {


		
		 for (int i=0; i<=10; i++){
			 if (i==5 || i==6){
			   continue;
			 }
			     System.out.println(i+ " ");
			    
			    
			  }
			  
		 
		  int[][] multidimensionalArray = { {1,2},{2,3}, {3,4} };
	      
	      for(int i = 0 ; i < 3 ; i++){
	         //row
	         for(int j = 0 ; j < 2; j++){
	            System.out.print(multidimensionalArray[i][j] + " ");
	         }
	         System.out.println(); 
		 
	}

}
}