package com.syntax.class12_09_24_2022;

public class IndexOf {

	public static void main(String[] args) {

String str="Today is Sunday";

int index=str.indexOf("a");

System.out.println(index);
System.out.println(str.indexOf("a",6));

//13 because second a is on index 13


String str2="Kavkaz brat bro";
		for(int i=0; i<str2.length(); i++){
			if(str2.charAt(i)=='a') {
				System.out.println(i); //1,4,9 all index of A's
				
				System.out.println("-------");
				StringUtils str2Utils=new StringUtils();
				str2Utils.printAllIndexes(str2, 'o');
			}
		}
	}

}
