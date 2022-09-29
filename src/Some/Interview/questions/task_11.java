package Some.Interview.questions;

public class task_11 {

	public static void main(String[] args) {
	
		
		String [] arr = new String [] {"Bob", "John", "Billy", "Bob", "Billy", "Arif"};   
        
        System.out.println("Duplicate elements in given array: ");  
       
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);
                
                
            }  
        }  
    }   

	}


