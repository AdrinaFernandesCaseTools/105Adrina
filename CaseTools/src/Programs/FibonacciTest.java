package Programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {


	@Test
	 public void testFibonacci_With5Terms() {
        int[] expected = {0, 1, 1, 2, 3};
        int[] actual = Fibonacci.generateFibonacci(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testFibonacci_With8Terms() {
        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13};
        int[] actual = Fibonacci.generateFibonacci(8);
        assertArrayEquals(expected, actual);
    }
}



 


   

