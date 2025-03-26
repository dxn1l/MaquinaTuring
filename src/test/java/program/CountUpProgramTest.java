package program;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class CountUpProgramTest {

    @Test
    void testRunCountsUpLimitedSteps() throws InterruptedException {
        CountUpProgram program = new CountUpProgram();

        Thread t = new Thread(() -> program.run("1"));
        t.start();

        Thread.sleep(200);
        program.stop();

        t.join(500);

        assertFalse(t.isAlive(), "El hilo debería haber terminado después de llamar a stop().");
    }
}