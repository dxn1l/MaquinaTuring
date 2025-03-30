package builder;


import common.Program;

public interface ProgramBuilder {
    void buildName();
    void buildRunLogic();
    Program getProgram();
}