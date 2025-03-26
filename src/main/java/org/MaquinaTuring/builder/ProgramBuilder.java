package org.MaquinaTuring.builder;


import org.MaquinaTuring.program.Program;

public interface ProgramBuilder {
    void buildName();
    void buildRunLogic();
    Program getProgram();
}