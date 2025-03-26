package org.MaquinaTuring.builder;

import org.MaquinaTuring.program.Program;

public class ConcreteCountDownBuilder implements ProgramBuilder {

    private Program program;

    @Override
    public void buildName() {
        program = new Program() {
            @Override
            public String getName() {
                return "CountDown";
            }

            @Override
            public void run(String input) {
                int num = Integer.parseInt(input);
                while (num > 0) {
                    System.out.println(num);
                    num--;
                }
                System.out.println("¡Programa CountDown ha terminado!");
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
