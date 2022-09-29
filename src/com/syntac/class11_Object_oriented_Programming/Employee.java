package com.syntac.class11_Object_oriented_Programming;

public class Employee {

 String name;
 String id;
 String department;
 double salary;
String shift;
 
 void work() {
	 System.out.println(name+ " is wokring on shift "+shift);
 }
 
 void takeLeaves() {
	 System.out.println(name+ "is going on leaves");
 }

 public static void main(String[]args) {
	 Employee emp1=new Employee();
	 emp1.name="John";
	 emp1.id="123";
	 emp1.department="IT";
	 emp1.salary=20000;
	 emp1.shift="Evening";
	 
	 emp1.work();
	 
	 Employee emp2=new Employee();
	 emp2.name="Arif";
	 emp2.department="Sales";
	 emp2.id="456";
	 emp2.salary=100000;
	 emp2.shift="Morning";
	 
	 emp2.work();
 }
	

}
