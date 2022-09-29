package GROUP_Project_;

public class task_10 {

	public static void main(String[] args) {



		int arr[]= {4,6,9,12,-2,24};
		
		int max=0;
		int secMax=0;
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				secMax=max;
				 max=arr[i];
			}else if(arr[i]>secMax) {
				secMax=arr[i];
			}
		}
		System.out.println("2nd Largest number is " +secMax);
		
	}


	}


