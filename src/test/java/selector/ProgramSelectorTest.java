package selector;

import common.Program;
import org.junit.jupiter.api.Test;
import selectors.ProgramSelector;

import static org.junit.jupiter.api.Assertions.*;

class ProgramSelectorTest {

    @Test
    void testAbstractFactoryReturnsValidProgram() {
        Program program = ProgramSelector.getProgram("Abstract Factory", "CountDown");
        assertNotNull(program);
        assertEquals("CountDown", program.getName());
    }

    @Test
    void testBuilderReturnsValidProgram() {
        Program program = ProgramSelector.getProgram("Builder", "CountUp");
        assertNotNull(program);
        assertEquals("CountUp", program.getName());
    }

    @Test
    void testPrototypeReturnsValidProgram() {
        Program program = ProgramSelector.getProgram("Prototype", "CountDown");
        assertNotNull(program);
        assertTrue(program.getName().contains("clonado"));
    }

    @Test
    void testReverserWorksInAllPatterns() {
        for (String patron : new String[]{"Abstract Factory", "Builder", "Prototype"}) {
            Program program = ProgramSelector.getProgram(patron, "Reverser");
            assertNotNull(program);
            assertEquals("Reverser", program.getName());
        }
    }

    @Test
    void testInvalidPatternReturnsNull() {
        Program program = ProgramSelector.getProgram("PatronInexistente", "CountDown");
        assertNull(program);
    }
}
