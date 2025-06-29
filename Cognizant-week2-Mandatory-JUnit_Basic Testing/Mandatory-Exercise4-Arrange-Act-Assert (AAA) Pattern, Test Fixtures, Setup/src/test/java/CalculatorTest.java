import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();  // Arrange
    }

    @After
    public void tearDown() {
        calculator = null;  // Teardown
    }

    @Test
    public void testAddition() {
        int result = calculator.add(10, 5);  // Act
        assertEquals(15, result);           // Assert
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
}