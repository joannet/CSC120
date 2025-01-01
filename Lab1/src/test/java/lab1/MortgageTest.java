package lab1;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MortgageTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	PrintStream originalPrintStream = System.out;

	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(originalPrintStream);
	}
	@Test
	public void testOutput1() {
		int cur = 200000;
		int prev = 210000;

		int change = cur - prev;
		double mortgage = ((cur * 0.045) / 12);	
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[4];
		int[] positions = new int[4];
	
		String test = "Test output 1: ";
		System.setIn(new ByteArrayInputStream("200000\n210000".getBytes()));

		correctOutput[0] = new String("Enter the current home price:");
		correctOutput[1] = new String("Enter last month's home price:");
		correctOutput[2] = new String("This house is $" + cur + ". The change is $" + change + " since last month.");
		correctOutput[3] = new String("The estimated monthly mortgage is $" + mortgage + ".");
				
		String[] args = new String[1];
		Mortgage.main(args);

		int totalLines = correctOutput.length;
		String output = outContent.toString();
		String studentOutput;
		
		for(int i = 0; i<totalLines; i++)
		{
			if(i>0)
			{
				positions[i] = output.indexOf("\n", positions[i-1] + 1);
				if(positions[i - 1] + 1 == positions[i])
					studentOutput = "\n";
				else
					studentOutput = output.substring(positions[i-1] + 1, positions[i]);
			}
			else
			{
				positions[i] = output.indexOf("\n");
				studentOutput = output.substring(0, positions[i]);
			}
			
			assertEquals(test + ls + "Line " + (i+1) + " should be:" + ls + correctOutput[i] + ls + "but was:" + ls + studentOutput + ls, correctOutput[i], studentOutput);
		}
		System.setIn(null);
		
	}
	public void testOutput2() {
		int cur = 625000;
		int prev = 639000;

		int change = cur - prev;
		double mortgage = ((cur * 0.045) / 12);	
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[4];
		int[] positions = new int[4];
	
		String test = "Test output 2: ";
		System.setIn(new ByteArrayInputStream("625000\n639000".getBytes()));

		correctOutput[0] = new String("Enter the current home price:");
		correctOutput[1] = new String("Enter last month's home price:");
		correctOutput[2] = new String("This house is $" + cur + ". The change is $" + change + " since last month.");
		correctOutput[3] = new String("The estimated monthly mortgage is $" + mortgage + ".");
				
		String[] args = new String[1];
		Mortgage.main(args);

		int totalLines = correctOutput.length;
		String output = outContent.toString();
		String studentOutput;
		
		for(int i = 0; i<totalLines; i++)
		{
			if(i>0)
			{
				positions[i] = output.indexOf("\n", positions[i-1] + 1);
				if(positions[i - 1] + 1 == positions[i])
					studentOutput = "\n";
				else
					studentOutput = output.substring(positions[i-1] + 1, positions[i]);
			}
			else
			{
				positions[i] = output.indexOf("\n");
				studentOutput = output.substring(0, positions[i]);
			}
			
			assertEquals(test + ls + "Line " + (i+1) + " should be:" + ls + correctOutput[i] + ls + "but was:" + ls + studentOutput + ls, correctOutput[i], studentOutput);
		}
		System.setIn(null);
		
	}
	public void testOutput3() {
		int cur = 515000;
		int prev = 535000;

		int change = cur - prev;
		double mortgage = ((cur * 0.045) / 12);	
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[4];
		int[] positions = new int[4];
	
		String test = "Test output 3: ";
		System.setIn(new ByteArrayInputStream("515000\n535000".getBytes()));

		correctOutput[0] = new String("Enter the current home price:");
		correctOutput[1] = new String("Enter last month's home price:");
		correctOutput[2] = new String("This house is $" + cur + ". The change is $" + change + " since last month.");
		correctOutput[3] = new String("The estimated monthly mortgage is $" + mortgage + ".");
				
		String[] args = new String[1];
		Mortgage.main(args);

		int totalLines = correctOutput.length;
		String output = outContent.toString();
		String studentOutput;
		
		for(int i = 0; i<totalLines; i++)
		{
			if(i>0)
			{
				positions[i] = output.indexOf("\n", positions[i-1] + 1);
				if(positions[i - 1] + 1 == positions[i])
					studentOutput = "\n";
				else
					studentOutput = output.substring(positions[i-1] + 1, positions[i]);
			}
			else
			{
				positions[i] = output.indexOf("\n");
				studentOutput = output.substring(0, positions[i]);
			}
			
			assertEquals(test + ls + "Line " + (i+1) + " should be:" + ls + correctOutput[i] + ls + "but was:" + ls + studentOutput + ls, correctOutput[i], studentOutput);
		}
		System.setIn(null);
		
	}
}
