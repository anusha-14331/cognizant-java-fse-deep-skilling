package Module4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    int num;

    @Before
    public void setUp() {
        num = 10;
        System.out.println("Setup");
    }

    @After
    public void tearDown() {
        System.out.println("Teardown");
    }

    @Test
    public void testAddition() {
        int result = num + 5;
        assertEquals(15, result);
    }
}

/*
Output:
Setup
Teardown
*/
