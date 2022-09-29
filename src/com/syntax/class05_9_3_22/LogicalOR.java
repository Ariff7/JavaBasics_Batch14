package com.syntax.class05_9_3_22;

public class LogicalOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Logical or ||
		
	/* true || true --> True
	 * true || false --> True
	 * false || true --> True
	 * false || false --> False
	 */
		
		String day="Sunday";
		
		if (day.equals("Saturday") || day.equals("Sunday"))
		{
			System.out.println("I have java class at Syntax");
		}
		
	}

}
