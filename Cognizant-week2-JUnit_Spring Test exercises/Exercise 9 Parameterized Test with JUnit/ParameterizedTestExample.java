import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedTestExample {
    @ParameterizedTest
    @CsvSource({
        "2, 3, 5",
        "10, 15, 25",
        "-1, 1, 0"
    })
    void testAdd(int a, int b, int expected) {
        CalculatorService calc = new CalculatorService();
        assertEquals(expected, calc.add(a, b));
    }
}