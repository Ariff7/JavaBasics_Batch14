package review_Loops_Arrays;

import java.util.Arrays;

public class Two_D_Array__ {

	public static void main(String[] args) {

int[][]arr=new int[][] {
	
	{10,20,30},
	{1,2,3}
};

System.out.println(Arrays.toString(arr[0]));
System.out.println(arr[1][2]);


//get smallest

int smallest=arr[0][0];
for(int i=0; i<arr.length; i++) {
	for(int j=0; j<arr[i].length; j++) {
		if(arr[i][j]<smallest) {
			smallest=arr[i][j];
		}
	}
}
	}

}
