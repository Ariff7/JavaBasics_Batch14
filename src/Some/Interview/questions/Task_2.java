package Some.Interview.questions;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);

	       System.out.println("What countries would you like to visit?");

	       String[] fivecounts= new String [5];

	       String [][] countries= {
	                    {"Mexico", "Australia", "Argentina", "Brazil", "France"},
	                    {"Mexico City","Canberra", "Buenos Aires", "Brasilia", "Paris"},
	            };

	       for(int i=0; i<fivecounts.length; i++ ) {
	        fivecounts[i]=scanner.next();

	        for (String[] country:countries) {
	         for(String c:country) {

	            if (c.equals(fivecounts[i]) && c.equals(countries[0][0])) {
	               System.out.println("The capital of "+countries[0][0]+" is "+countries [1][0]);
	           }
	            else if (c.equals(fivecounts[i]) && c.equals(countries[0][1])) {
	                     System.out.println("The capital of "+ countries[0][1]+" is "+countries [1][1]);
	           }
	            else if (c.equals(fivecounts[i]) && c.equals(countries[0][2])) {
	                     System.out.println("The capital of "+ countries[0][2]+" is "+countries [1][2]);
	           } 
	            else if (c.equals(fivecounts[i]) && c.equals(countries[0][3])) {
	                     System.out.println("The capital of "+ countries[0][3]+" is "+countries [1][3]);
	           } 
	            else if (c.equals(fivecounts[i]) && c.equals(countries[0][4])) {
	                     System.out.println("The capital "+countries[0][4]+" is "+countries [1][4]);
	            }
	            }
	         }
	        }
	       }
	}

	         
	        
	     
		

	


