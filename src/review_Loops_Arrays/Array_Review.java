package review_Loops_Arrays;

public class Array_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1st way of creating arrays
		   //- not used in real life most of times
		
		String[] names=new String[] {"Arif", "Maga", "Mohammed", "Yusuf", "Yunus"};
		
		
		
		System.out.println(names.length);
	
		
		//mostly this is how we use arrays
		for(int i=0; i<names.length; i++) {
			
			System.out.println("The name is " +names[i]);
			
			System.out.println("------------");
			
		//Enhanced loop
			
			for(String n:names) {
				System.out.println(n);
			}
			
		}
		
		
	}

}
