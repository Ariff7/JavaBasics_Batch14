package com.syntax.class12_09_24_2022;

import java.util.Arrays;

public class Demo7_more_Practice {

	public static void main(String[] args) {


		String str="You Rock Bro";

char []charArr=str.toCharArray();

System.out.println(Arrays.toString(charArr));
System.out.println(charArr);




String food= "Baklava";
for(int i=food.length()-1; i>=0; i--) {
    System.out.print(food.charAt(i));

	}

}
}