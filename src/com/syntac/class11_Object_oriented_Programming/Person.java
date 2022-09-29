package com.syntac.class11_Object_oriented_Programming;

public class Person {

String name;
String age;
double weight;
boolean isFunny;
double height;
boolean losingHairs;

void study() {
	if(name.equals("Anna")) {
		System.out.println( "I Study hard");
	}else if(name.equals("Roman")) {
		System.out.println("I will keep on deleting the messages");
	}else {
		System.out.println("I try to study but things DO not Make sense");
	}
}

public static void main(String[]args) {
	
	Person person1=new Person();
	person1.name="Roman";
	person1.study();
	
	Person person2= new Person();
	person2.name="Yusuf";
	person2.study();
	
}
	

}
