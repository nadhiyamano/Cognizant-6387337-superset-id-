import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class Exercise6_VerifyInteractionOrderTest {

    interface Service {
        void start();
        void process();
        void finish();
    }

    @Test
    public void testMethodCallOrder() {
        Service mockService = mock(Service.class);

        mockService.start();
        mockService.process();
        mockService.finish();

        InOrder inOrder = inOrder(mockService);
        inOrder.verify(mockService).start();
        inOrder.verify(mockService).process();
        inOrder.verify(mockService).finish();
    }
}
