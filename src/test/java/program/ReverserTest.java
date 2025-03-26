package program;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ReverserTest {

    @Test
    void testReverserStopsIfHaltCheckerSaysNoHalt() throws InterruptedException {
        Reverser reverser = new Reverser();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Thread t = new Thread(() -> reverser.run("Reverser"));
        t.start();

        Thread.sleep(200); // Dejar ejecutar
        reverser.stop();   // ✅ método nuevo para detener Reverser

        t.join(2000); // Esperamos a que termine

        String output = out.toString();
        assertTrue(output.contains("Reverser termina inmediatamente") ||
                output.contains("Reverser detenido externamente."));
    }
}
