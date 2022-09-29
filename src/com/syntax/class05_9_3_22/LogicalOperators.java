package com.syntax.class05_9_3_22;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Assignment operator:=
		//Arithmetic operators= +,-,/,*.%
		//relational: >,>=,<,<=,==,!=
		//Logical : &&, ||, !
		
		//Logical And &&
           	
	/*
	 * true && true --> True
	 * true &&  false--> False
	 * false && true --> False
	 * false && and false --> False
	 */
	    boolean understandJava=true;
        boolean enjoyJava=true;
        boolean practice=true;

        if(understandJava && enjoyJava && practice) {
            System.out.println("This is awesome");
        }

        System.out.println("  another example   ");

        int n1=100;
        int n2=200;
        int n3=300;

        if(n1>n2 && n1>n3) {
            System.out.println(n1 +"is the largest");

        } else if (n2>n3 && n2>n1) {
            System.out.println(n2+" is the largest");

        } else if (n3>n1 && n3>n2) {
            System.out.println(n3 +" is the largest");

        }


    


		
	}

}
