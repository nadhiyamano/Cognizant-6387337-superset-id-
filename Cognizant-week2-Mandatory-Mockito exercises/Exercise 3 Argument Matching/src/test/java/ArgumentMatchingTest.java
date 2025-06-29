import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;
import org.junit.jupiter.api.Test;

public class Exercise3_ArgumentMatchingTest {

    interface Service {
        void performAction(String name, int count);
    }

    @Test
    public void testArgumentMatching() {
        Service mockService = mock(Service.class);

        mockService.performAction("example", 5);

        verify(mockService).performAction("example", 5);

        verify(mockService).performAction(anyString(), eq(5));
    }
}
