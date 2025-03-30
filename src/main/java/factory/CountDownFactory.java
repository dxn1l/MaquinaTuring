package factory;


import common.Program;

public class CountDownFactory implements ProgramFactory {
    @Override
    public Program createProgram() {
        return new CountDownProgram();
    }

}

