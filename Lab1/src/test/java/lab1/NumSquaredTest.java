package lab1;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class NumSquaredTest {

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
		int in = 2;
		int squared = in * in;
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[3];
		int[] positions = new int[3];
	
		String test = "Test output 1: ";
		System.setIn(new ByteArrayInputStream("2".getBytes()));

		correctOutput[0] = new String("Enter a number:");
		correctOutput[1] = new String("You entered " + in);
		correctOutput[2] = new String("The square is " + squared);
		
		String[] args = new String[1];
		NumSquared.main(args);

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

	@Test
	public void testOutput2() {
		
		int in = 7;
		int squared = in * in;
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[3];
		int[] positions = new int[3];
	
		String test = "Test output 2: ";
		System.setIn(new ByteArrayInputStream("7".getBytes()));

		correctOutput[0] = new String("Enter a number:");
		correctOutput[1] = new String("You entered " + in);
		correctOutput[2] = new String("The square is " + squared);
		
		String[] args = new String[1];
		NumSquared.main(args);

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
	@Test
	public void testOutput3() {
		
		int in = 13;
		int squared = in * in;
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[3];
		int[] positions = new int[3];
	
		String test = "Test output 3: ";
		System.setIn(new ByteArrayInputStream("13".getBytes()));

		correctOutput[0] = new String("Enter a number:");
		correctOutput[1] = new String("You entered " + in);
		correctOutput[2] = new String("The square is " + squared);
		
		String[] args = new String[1];
		NumSquared.main(args);

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
