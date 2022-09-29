package Some.Interview.questions;

public class task_8 {

	public static void main(String[] args) {
		
		int a=10, 
		FirstTerm=0;
		
		int SecondTerm =1;
		
		
		for(int i=0; i<=a; i++) {
			System.out.print(FirstTerm + " ");
			
			int NextTerm= FirstTerm+SecondTerm;
			FirstTerm= SecondTerm;
			SecondTerm=NextTerm;
			
		}

	}

}
