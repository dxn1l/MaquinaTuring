package checker;

import org.junit.jupiter.api.Test;
import program.CountDownProgram;
import program.CountUpProgram;
import program.Program;
import program.Reverser;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HaltCheckerTest {

    @Test
    void testCountDownHalts() {
        HaltChecker checker = new HaltChecker();
        Program program = new CountDownProgram();
        assertTrue(checker.willHalt(program, "5"));
    }

    @Test
    void testCountUpDoesNotHalt() {
        HaltChecker checker = new HaltChecker();
        Program program = new CountUpProgram();
        assertFalse(checker.willHalt(program, "1"));
    }

    @Test
    void testReverserReturnsFalseToSimulateParadox() {
        HaltChecker checker = new HaltChecker();
        Program program = new Reverser();
        assertFalse(checker.willHalt(program, "Reverser"));
    }
}
