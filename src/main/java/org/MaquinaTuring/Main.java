package org.MaquinaTuring;

import org.MaquinaTuring.builder.ConcreteCountDownBuilder;
import org.MaquinaTuring.builder.ConcreteCountUpBuilder;
import org.MaquinaTuring.builder.Director;
import org.MaquinaTuring.builder.ProgramBuilder;
import org.MaquinaTuring.program.Program;
import org.MaquinaTuring.program.Reverser;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] options = {"CountDown", "CountUp", "Reverser"};
        String choice = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona el programa (Builder):",
                "Simulación de Parada",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        Program program;

        if ("Reverser".equals(choice)) {
            program = new Reverser();
        } else {
            ProgramBuilder builder = "CountDown".equals(choice)
                    ? new ConcreteCountDownBuilder()
                    : new ConcreteCountUpBuilder();

            Director director = new Director();
            director.setBuilder(builder);
            program = director.constructProgram();
        }

        String input = JOptionPane.showInputDialog("Ingresa un número inicial:");
        program.run(input);
    }
}