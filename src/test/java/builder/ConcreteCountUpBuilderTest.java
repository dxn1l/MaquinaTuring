package builder;

import common.Program;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConcreteCountUpBuilderTest {

    @Test
    void testBuildsCountUpProgram() {
        ProgramBuilder builder = new ConcreteCountUpBuilder();
        builder.buildName();
        builder.buildRunLogic();
        Program program = builder.getProgram();

        assertNotNull(program);
        assertEquals("CountUp", program.getName());
    }
}
