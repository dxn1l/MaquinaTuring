package builder;

import common.Program;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DirectorTest {

    @Test
    void testDirectorConstructsCountDown() {
        Director director = new Director();
        ProgramBuilder builder = new ConcreteCountDownBuilder();
        director.setBuilder(builder);

        Program program = director.constructProgram();

        assertEquals("CountDown", program.getName());
    }

    @Test
    void testDirectorConstructsCountUp() {
        Director director = new Director();
        ProgramBuilder builder = new ConcreteCountUpBuilder();
        director.setBuilder(builder);

        Program program = director.constructProgram();

        assertEquals("CountUp", program.getName());
    }
}
