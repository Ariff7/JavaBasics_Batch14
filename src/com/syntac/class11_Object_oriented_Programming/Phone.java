package com.syntac.class11_Object_oriented_Programming;

public class Phone {

 String make;
 String model;
 String color;
 int storage;
 double size;
 boolean cheap;
 
 void Call() {
	 System.out.println("Calling...");
 }
 
 void TakePicture() {
	 System.out.println("Taking pictures");
 }

 public static void main(String[] args) {
	 
	 //name of class variable = new Name of class();
	Phone iphone=new Phone();
	 iphone.make="Apple";
	 iphone.model="Iphone 14";
	 iphone.color="Black";
	 iphone.storage=128;
	 iphone.size=5.5;
	 
	 System.out.println("Make of phone is "+iphone.make+ " and model is "+iphone.model);
	 
	 iphone.Call();
	 iphone.TakePicture();
	 
	 System.out.println("\n");
	 
	 Phone samsungPhone=new Phone();
	  samsungPhone.make="Samsung";
	  samsungPhone.model="S22 Ultra";
	  samsungPhone.color="Grey";
	  samsungPhone.storage=256;
	  samsungPhone.size=6.7;
	  samsungPhone.cheap=false;
	  
	  System.out.println("Make of phone is "+ samsungPhone.make + " and model is " +samsungPhone.model );
	  
	  samsungPhone.Call();
	 
	 
 }
 

		

	

}
