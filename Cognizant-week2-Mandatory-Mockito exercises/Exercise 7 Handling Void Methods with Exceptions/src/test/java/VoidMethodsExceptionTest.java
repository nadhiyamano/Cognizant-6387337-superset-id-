import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Exercise7_VoidMethodsExceptionTest {

    interface Service {
        void riskyOperation() throws Exception;
    }

    @Test
    public void testVoidMethodThrowsException() throws Exception {
        Service mockService = mock(Service.class);

        doThrow(new Exception("Operation failed")).when(mockService).riskyOperation();

        try {
            mockService.riskyOperation();
        } catch (Exception e) {
            assert e.getMessage().equals("Operation failed");
        }

        verify(mockService).riskyOperation();
    }
}
