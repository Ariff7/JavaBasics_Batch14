package com.syntax.class12_09_24_2022;

import java.util.Arrays;

public class ClassDemo_7_toCharArray___String_to_chars {

	public static void main(String[] args) {

String str="I love java programming";

// toCharArray will convert a String to an array of chars

char[]charArray=str.toCharArray();

System.out.println(charArray[5]);

System.out.println(Arrays.toString(charArray));

int counter=0;

for(char c:charArray) {
	
	if(c=='a') {
		counter++;
	}
}System.out.println("Letter A has appeared " +counter+ " times");

	}

}
