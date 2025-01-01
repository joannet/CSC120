package lab1;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class OutputWithVarsTest {

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
		int in = 6;
		int squared = in * in;
		int in2 = 9;
		int cubed = in * in * in;
		int sum = in + in2;
		int product = in * in2;
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[7];
		int[] positions = new int[7];
	
		String test = "Test output 1: ";
		System.setIn(new ByteArrayInputStream("6\n9".getBytes()));

		correctOutput[0] = new String("Enter an integer:");
		correctOutput[1] = new String("You entered: " + in);
		correctOutput[2] = new String(in + " squared is " + squared);
		correctOutput[3] = new String("And " + in + " cubed is " + cubed + "!!");
		correctOutput[4] = new String("Enter another integer:");
		correctOutput[5] = new String(in + " + " + in2 + " is " + sum);
		correctOutput[6] = new String(in + " * " + in2 + " is " + product);
		
		String[] args = new String[1];
		OutputWithVars.main(args);

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
