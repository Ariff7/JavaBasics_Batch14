package com.syntax.class08_9_11_2022;

public class ClockNestedLoop {

	public static void main(String[] args) {


		 for (int h = 0; h <= 23; h++) {

	            for (int m = 0; m <= 59; m++) {

	                if (h <= 9 && m <= 9) {
	                    System.out.println("0" + h + ":" + "0" + m);

	                } else if (h <= 23 && m <= 9) {
	                    System.out.println(h + ":" + "0" + m);

	                } else if (h <= 9 && m >= 10) {
	                    System.out.println("0" + h + ":" + m);

	                } else {
	                    System.out.println(h + ":" + m);
	                }

	            }
	        }


}
}
