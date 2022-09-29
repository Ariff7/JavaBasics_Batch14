package com.syntax.class13__9_25_2022;

import java.util.Arrays;

public class Split_Demo {

	public static void main(String[] args) {

String str=("Batch 14 is really good");
		
String[]arr =str.split("");
System.out.println(Arrays.toString(arr));

//System.out.println(arr[4]);


String str2=("Today is Sunday. Sunday is good. But Java is not good.");
String[]arr2=str2.split("[.]");
System.out.println(Arrays.toString(arr2));

	}

}
