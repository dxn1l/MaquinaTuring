package org.MaquinaTuring.builder;

import org.MaquinaTuring.program.Program;

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
