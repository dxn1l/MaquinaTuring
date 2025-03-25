package factory;

import program.CountUpProgram;
import program.Program;

public class CountUpFactory implements ProgramFactory {
    @Override
    public Program createProgram() {
        return new CountUpProgram();
    }
}
