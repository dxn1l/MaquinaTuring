package factory;

import common.Program;

public class CountUpFactory implements ProgramFactory {
    @Override
    public Program createProgram() {
        return new CountUpProgram();
    }
}
