package belajar.java.unit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

/*mencoba menjalankan unit test secara paralel, menjalankan semua test secara langsung.
namun khusus untuk test yg independen*/
@Execution(value = ExecutionMode.CONCURRENT)
public class TimeoutTest {

    @Test
    //lebih dari 5 detik, test dianggap gagal
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSlow1() throws InterruptedException{
        Thread.sleep(4_000);
    }

    @Test
    //lebih dari 5 detik, test dianggap gagal
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSlow2() throws InterruptedException{
        Thread.sleep(4_000);
    }

    @Test
    //lebih dari 5 detik, test dianggap gagal
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void testSlow3() throws InterruptedException{
        Thread.sleep(4_000);
    }
}
