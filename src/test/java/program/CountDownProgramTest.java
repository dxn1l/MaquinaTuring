package program;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CountDownProgramTest {

    @Test
    void testRunStopsAtZero() {
        CountDownProgram program = new CountDownProgram();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        program.run("3");

        String output = out.toString();
        assertTrue(output.contains("¡Programa CountDown ha terminado!"));
        assertTrue(output.contains("3"));
        assertTrue(output.contains("2"));
        assertTrue(output.contains("1"));
    }
}
