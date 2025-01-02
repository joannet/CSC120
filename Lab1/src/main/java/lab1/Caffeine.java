package lab1;

import java.util.Scanner; 

public class Caffeine {
	

	public static void main(String[] args) {
	   
      
		Scanner scnr = new Scanner(System.in);      
		double caffeineMg; // "double" supports floating-point like 75.5, versus int for integers like 75.       
		double halfAmt;
      
      
		System.out.println("Enter the amount of caffeine in mg.");      
		caffeineMg = scnr.nextDouble(); 
      
		halfAmt = caffeineMg / 2;
		System.out.println("After 6 hours: " + halfAmt + " mg");
      
		halfAmt = halfAmt / 2;
		System.out.println("After 12 hours: " + halfAmt + " mg");
      
		halfAmt = halfAmt / 2;
		System.out.println("After 18 hours: " + halfAmt + " mg");
            
		/* Type your code here. */
      
		scnr.close();
   
	}
}
