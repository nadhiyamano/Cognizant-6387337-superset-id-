import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    @Test
    void testAdd() {
        CalculatorService service = new CalculatorService();
        assertEquals(5, service.add(2, 3));
    }
}