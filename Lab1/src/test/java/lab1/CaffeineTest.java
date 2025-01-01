package lab1;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CaffeineTest {

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
		double in = 100.0;
		double firstAns = in / 2;
		double secondAns = firstAns / 2;
		double thirdAns = secondAns / 2;
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[4];
		int[] positions = new int[4];
	
		String test = "Test output 1: ";
		System.setIn(new ByteArrayInputStream("100".getBytes()));

		correctOutput[0] = new String("Enter the amount of caffeine in mg.");
		correctOutput[1] = new String("After 6 hours: " + firstAns + " mg");
		correctOutput[2] = new String("After 12 hours: " + secondAns + " mg");
		correctOutput[3] = new String("After 18 hours: " + thirdAns + " mg");		
		
		String[] args = new String[1];
		Caffeine.main(args);

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
		
		double in = 50.0;
		double firstAns = in / 2;
		double secondAns = firstAns / 2;
		double thirdAns = secondAns / 2;
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[4];
		int[] positions = new int[4];
	
		String test = "Test output 2: ";
		System.setIn(new ByteArrayInputStream("50.0".getBytes()));

		correctOutput[0] = new String("Enter the amount of caffeine in mg.");
		correctOutput[1] = new String("After 6 hours: " + firstAns + " mg");
		correctOutput[2] = new String("After 12 hours: " + secondAns + " mg");
		correctOutput[3] = new String("After 18 hours: " + thirdAns + " mg");		
		
		String[] args = new String[1];
		Caffeine.main(args);

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
		
		double in = 40.0;
		double firstAns = in / 2;
		double secondAns = firstAns / 2;
		double thirdAns = secondAns / 2;
		
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[4];
		int[] positions = new int[4];
	
		String test = "Test output 3: ";
		System.setIn(new ByteArrayInputStream("40.0".getBytes()));

		correctOutput[0] = new String("Enter the amount of caffeine in mg.");
		correctOutput[1] = new String("After 6 hours: " + firstAns + " mg");
		correctOutput[2] = new String("After 12 hours: " + secondAns + " mg");
		correctOutput[3] = new String("After 18 hours: " + thirdAns + " mg");		
		
		String[] args = new String[1];
		Caffeine.main(args);

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
