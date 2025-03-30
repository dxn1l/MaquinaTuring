package common;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ReverserTest {

    @Test
    void testReverserTerminatesIfHaltCheckerSaysNo() throws InterruptedException {
        Reverser reverser = new Reverser();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Thread t = new Thread(() -> reverser.run("Reverser"));
        t.start();

        Thread.sleep(300);
        reverser.stop();
        t.join(1000);

        String output = out.toString();
        assertTrue(output.contains("termina inmediatamente") ||
                output.contains("Reverser fue detenido manualmente."));
    }
}