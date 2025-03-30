package builder;

import common.Program;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConcreteCountDownBuilderTest {
    @Test
    void testBuildsCountDownProgram() {
        ProgramBuilder builder = new ConcreteCountDownBuilder();
        builder.buildName();
        builder.buildRunLogic();
        Program program = builder.getProgram();

        assertNotNull(program);
        assertEquals("CountDown", program.getName());
    }
}
