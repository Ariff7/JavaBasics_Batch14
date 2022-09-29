package com.syntax.class07_9_10_22;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		//10 8 6 4 2 0
		
		//can be i-=2 or i=1-2
		
for(int i=10; i>=0; i-=2) {
	System.out.print(i+ " ");
}
System.out.println("\n");		

//9 5 1

for(int i=9; i>=1; i-=4) {
	System.out.print(i);
}

System.out.println("\n");		

// 1 3 7 9 
// using break or continue


for(int b=1; b<=9; b+=2) {
	if(b==5) {
		continue;
	}
	System.out.print(b);
}
//while loop would be useful when you dont know how many loops you need

	}

}
