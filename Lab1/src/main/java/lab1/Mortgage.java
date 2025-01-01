package lab1;
import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int currentPrice; 
		int lastMonthsPrice; 
		
		System.out.println("Enter the current home price:");
		currentPrice = scnr.nextInt(); 
		
		System.out.println("Enter last month's home price:");
		lastMonthsPrice = scnr.nextInt();
	    
		/* Type your code here. */

		scnr.close();
	}

}
