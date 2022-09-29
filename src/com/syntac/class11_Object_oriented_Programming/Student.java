package com.syntac.class11_Object_oriented_Programming;

public class Student {

	String name;
	String id;
	int age;
	double weight;
	char gender;
	
	
	void study() {
		System.out.println("Student is studying ");
	}

	void sleeping() {
		System.out.println("Student is sleeping");
	}
	
	void eat(){
	System.out.println("Eating pizza");
	}
	
    public static void main(String[] args) {
    	
    	Student build=new Student();
    	
    	build.name="Arif";
    	build.id="123";
    	build.age=22;
    	build.weight=190;
    	build.gender='M';
    	
    	System.out.println(build.name);
    	System.out.println(build.age);
    	
    	
    	build.sleeping();
    	build.eat();
    	
    	System.out.println("\n");
    	
    	Student build2=new Student();
    	build2.name="Maga";
    	build2.age=6;
    	build2.weight=55;
    	build2.gender='M';
    	
    	System.out.println(build2.name);
    	System.out.println(build2.age);
    	
    	build2.eat();
   
    	
    	
    }


		
	}
	
		
		
	


