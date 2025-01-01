package lab1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringTokenizer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicOutputTest {

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
	public void testOutput() {
		String ls = System.getProperty( "line.separator");
		String[] correctOutput = new String[3];
		
		String test = "Test output: ";

		correctOutput[0] = new String("Hello world!");
		correctOutput[1] = new String("How are you?");
		correctOutput[2] = new String("   (I'm fine).");
		
		
		String[] args = new String[1];
		BasicOutput.main(args);

		int totalLines = correctOutput.length;
		String output = outContent.toString();
		String studentOutput;

		StringTokenizer st = new StringTokenizer(output,ls);
		int i = 0;
		int linesChecked = 0;
		while(st.hasMoreTokens())
		{
			studentOutput = st.nextToken();
			assertEquals(test + ls + "Line " + (i+1) + " should be:" + ls + correctOutput[i] + ls + "but was:" + ls + studentOutput + ls, correctOutput[i], studentOutput);
			linesChecked++;
			i++;				
		}
		if(linesChecked < totalLines)
			fail(test + "There are not enough output lines for this test. There should be " + totalLines + " lines. Check AsciiArt for correct output.");

	}

}
