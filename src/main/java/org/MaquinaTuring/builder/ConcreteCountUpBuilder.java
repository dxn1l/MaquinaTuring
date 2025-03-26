package org.MaquinaTuring.builder;

import org.MaquinaTuring.program.Program;

public class ConcreteCountUpBuilder implements ProgramBuilder {

    private Program program;

    @Override
    public void buildName() {
        program = new Program() {
            @Override
            public String getName() {
                return "CountUp";
            }

            @Override
            public void run(String input) {
                int num = Integer.parseInt(input);
                while (true) {
                    System.out.println(num);
                    num++;
                }
            }
        };
    }

    @Override
    public void buildRunLogic() {
    }

    @Override
    public Program getProgram() {
        return program;
    }
}
