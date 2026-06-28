import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaluculatorTest {

    private Caluculator caluculator;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        caluculator = new Caluculator();
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = caluculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
    }
}
