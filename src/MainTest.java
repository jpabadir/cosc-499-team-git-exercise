// some code found and adapted from: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
// and from https://stackoverflow.com/questions/6415728/junit-testing-with-simulated-user-input

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class MainTest {
    // Keep a backup of the default input and output streams
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    // Prepare our own output stream
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        // Set output stream to our own stream so we can track what is printed by program
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        // Set the input and output streams back to the default ones
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
    
    @Test
    public void testMainDriverInvalid() {
        // Simulate user input by using an input stream
        final ByteArrayInputStream inContent = new ByteArrayInputStream("random string".getBytes());
        System.setIn(inContent);

        MainDriver.main(new String[0]);
        // Check that the right string was printed at the end of the system output
        assertEquals("Sorry, I didn't get that. Re-run the program to try again!", outContent.toString().split("or 'Multiplyby100': ")[1]);
    }

    //junit test for the convert method (USD -> CAD) in MainDriver
    @Test
    public void testConvert(){
        double actual = MainDriver.convert(1);
        double expectedValue = 1.32;
        
        assertEquals(expectedValue, actual, 0);
    }

    //junit test for double method:
    @Test
    public void testDouble(){
        double answer = MainDriver.doubled(5);
        double expectedAnswer = 25;
        assertEquals(expectedAnswer,answer,0);
    }

    //junit test for triple method:
    @Test
    public void testTriple(){
        double answer = MainDriver.tripled(10);
        double expectedAnswer = 1000;
        assertEquals(expectedAnswer,answer,0);
    }
    
    //junit test for multiplied method
    @Test
    public void testMultiplyby100() {
    	double answer = MainDriver.multiplied(15);
    	double expectedAnswer = 1500;
    	assertEquals(expectedAnswer,answer,0);
    }
}

