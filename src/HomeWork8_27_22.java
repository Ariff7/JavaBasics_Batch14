
public class HomeWork8_27_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Please solve them before tomorrow's class.
	//	Create a Java program and name it Double Comparison. Declare 2 double values and if value of first variable is higher then the second, print “Double value  is larger than  .” Otherwise print...

	//	Create a Java program and name it Temperature Check. Create variable to store temperature. Your program should check if temperature is below 32 then it should print “Water will freeze with temperature ”, otherwise “Water will NOT freeze with temperature ”.
		
	// a Java program and declare int variable that will hold a month. Based on the value of the variable your program should print the name of the month.
	//	Write a program to check whether number is positive or negative.
	//	Interview Question
	//	Write a Java Program to check whether number is Even or Odd.
		
		double a=100.1;
		double b=10;
		
		if(a>b)
		{ System.out.println("Double value " +a +" is greater than " + "double value "+ b +".");
		
		}
		else 
		{System.out.println("Double value" +a + "is smaller " + "double value " +b +"." );
		
		}
		
		//task2
		double temp=55;

        if (temp<32) 
        {
            System.out.println("Water will freeze with temperature "+temp+"F");

        } 
        else 
        {
            System.out.println("Water will not freeze at this temperature");
            
        }
		
		//task3

        int month=13;
        
        if(month==1)
        {	
        	System.out.println("January");
        }
        else if (month==2)
        {	
        	System.out.println("Febuary ");
        }
        else if(month==3)
        {
        	System.out.println("March");
        }
        else if(month==4)
        {
        	System.out.println("April");
        }
        else if (month==5)
        {
        	System.out.println("May");
        }
        else if (month==6)
        {
        	System.out.println("June");
        }
        else if (month==7)
        {
        	System.out.println("July");
        }
        else if (month==8)
        {
        	System.out.println("August");
        }
        else if (month==9)
        {
        	System.out.println("September");
        }
        else if (month==10)
        {
        	System.out.println("October");
        }
        else if (month==11)
        {
        	System.out.println("November");
        }
        else if (month==12)
        {
        	System.out.println("December");
        }
        else if (month==13)
        {
        	System.out.println("Incorrect month Please enter month1-12");
        }
        	
        
        //task4
        
        int number=5;
        System.out.println(5%2);
        
        if (number%2==0) 
        {
        	System.out.println(("number is even"));
        }
        else 
        {
        	System.out.println("number is odd");
        }
        
        //task5
        
        int numberr=0;
         
        if (number>0)
        {
        System.out.println(("Number is positive"));
        }
        else if (number<0)
        {
        	System.out.println("Number is negative");
        }
        else 
        {
        	System.out.println("Number is neither negative nor positive");
        }
        
	}

}
