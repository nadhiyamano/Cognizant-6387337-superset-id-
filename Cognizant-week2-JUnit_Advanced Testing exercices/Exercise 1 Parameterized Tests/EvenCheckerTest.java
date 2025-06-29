import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, -2, 0})
    void testIsEven(int number) {
        EvenChecker checker = new EvenChecker();
        assertTrue(checker.isEven(number));
    }
}