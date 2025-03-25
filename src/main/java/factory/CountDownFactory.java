package factory;


import program.CountDownProgram;
import program.Program;

public class CountDownFactory implements ProgramFactory {
    @Override
    public Program createProgram() {
        return new CountDownProgram();
    }

}

