import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Exercise4_HandlingVoidMethodsTest {

    interface Service {
        void clearCache();
    }

    @Test
    public void testVoidMethod() {
        Service mockService = mock(Service.class);

        doNothing().when(mockService).clearCache();

        mockService.clearCache();

        verify(mockService, times(1)).clearCache();
    }
}
