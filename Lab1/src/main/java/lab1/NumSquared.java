package lab1;

import java.util.Scanner;

public class NumSquared {
	public static void main(String[] args) {
	
		Scanner scnr = new Scanner(System.in);
		int userNum;
		int userNumSquared;
      
		System.out.println("Enter a number:");
		userNum = scnr.nextInt();
      
		userNumSquared = userNum + userNum;   // Bug here; fix it when instructed in the handout
      
		System.out.println("You entered " + userNum);
		System.out.print("The square is " + userNumSquared);   
		
		scnr.close();
	}
}
