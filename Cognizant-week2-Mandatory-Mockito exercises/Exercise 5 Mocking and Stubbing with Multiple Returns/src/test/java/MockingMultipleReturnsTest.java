import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class Exercise5_MockingMultipleReturnsTest {

    interface ExternalApi {
        String getData();
    }

    @Test
    public void testMultipleReturnValues() {
        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData())
            .thenReturn("First")
            .thenReturn("Second")
            .thenReturn("Third");

        assert mockApi.getData().equals("First");
        assert mockApi.getData().equals("Second");
        assert mockApi.getData().equals("Third");
    }
}
