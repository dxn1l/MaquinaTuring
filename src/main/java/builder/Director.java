package builder;

import common.Program;

public class Director {

    private ProgramBuilder builder;

    public void setBuilder(ProgramBuilder builder) {
        this.builder = builder;
    }

    public Program constructProgram() {
        builder.buildName();
        builder.buildRunLogic();
        return builder.getProgram();
    }
}
