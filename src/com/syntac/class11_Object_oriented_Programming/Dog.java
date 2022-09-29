package com.syntac.class11_Object_oriented_Programming;

public class Dog {

	//  State/Attributes/properties/fields
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	
	//These are the behaviors(Methods)(Functions) of a dog
	void bark() {
		System.out.println(" Dog is barking..");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping....");
	}
	
	void walking() {
		System.out.println("Dog is running");
	}
	
	public static void main(String[] args ) {
		
		// Creating objects from a class
		Dog dog1= new Dog();
		
		// calling a behavior on an object
		dog1.bark();
		dog1.sleep();
	}
	
	
}
