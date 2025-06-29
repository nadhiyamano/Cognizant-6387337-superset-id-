import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {
    @Test @Order(1) void testA() { assertTrue(true); }
    @Test @Order(2) void testB() { assertTrue(true); }
}