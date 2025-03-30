package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HaltCheckerTest {

    @Test
    void testCountDownHalts() {
        HaltChecker checker = new HaltChecker();
        Program program = new Program() {
            public String getName() { return "CountDown"; }
            public void run(String input) {}
        };
        assertTrue(checker.willHalt(program, "5"));
    }

    @Test
    void testCountUpDoesNotHalt() {
        HaltChecker checker = new HaltChecker();
        Program program = new Program() {
            public String getName() { return "CountUp"; }
            public void run(String input) {}
        };
        assertFalse(checker.willHalt(program, "1"));
    }

    @Test
    void testReverserSimulatesParadox() {
        HaltChecker checker = new HaltChecker();
        Program program = new Reverser();
        assertFalse(checker.willHalt(program, "Reverser"));
    }
}
