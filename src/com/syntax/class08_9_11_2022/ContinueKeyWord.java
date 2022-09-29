package com.syntax.class08_9_11_2022;

public class ContinueKeyWord {

	public static void main(String[] args) {
		
		for(int i=1; i<5; i++) {
			if (i==3) {
			continue;
		}System.out.println(i);
	}

		//print number 1 to 20 except 3,7,11
		for(int a=1; a<=20; a++) {
			if(a==4 || a==7 || a==11){continue;}
			System.out.print(a+ " ");
		}
		
		
}
}
