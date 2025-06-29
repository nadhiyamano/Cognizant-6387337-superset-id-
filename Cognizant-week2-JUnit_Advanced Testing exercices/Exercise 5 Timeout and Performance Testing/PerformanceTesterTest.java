import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTesterTest {
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void testPerformTask() throws InterruptedException {
        PerformanceTester pt = new PerformanceTester();
        pt.performTask();
    }
}