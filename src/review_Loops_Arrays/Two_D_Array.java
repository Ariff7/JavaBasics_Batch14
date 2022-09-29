package review_Loops_Arrays;

public class Two_D_Array {

	public static void main(String[] args) {
	
		
		String [] individualsInRoom1= new String[] {"Arif", "Billy", "John"};
		String [] individualsInRoom2= new String[] {"JAxon", "Sillyy", "David"};
		String [] individualsInRoom3= new String[] {"Euuuu",  "Max", " Steve"};
				
		String[][]rooms =new String[3][];
		
		rooms[0]=individualsInRoom1;
		rooms[1]=individualsInRoom2;
		rooms[2]=individualsInRoom3;
		

        System.out.println(rooms[2][2]);
        

		
		
		
		
	}

}
