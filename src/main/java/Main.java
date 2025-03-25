import factory.CountDownFactory;
import factory.CountUpFactory;
import factory.ProgramFactory;
import program.Program;
import program.Reverser;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String[] options = {"CountDown", "CountUp", "Reverser"};
        String choice = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona un programa para ejecutar:",
                "Problema de Parar - Simulación",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        Program program;

        if (choice == null) {
            System.out.println("Operación cancelada.");
            return;
        }

        switch (choice) {
            case "CountDown" -> {
                String input = JOptionPane.showInputDialog("Ingresa el número inicial (ej: 10):");
                ProgramFactory countDownFactory = new CountDownFactory();
                program = countDownFactory.createProgram();
                program.run(input);
            }
            case "CountUp" -> {
                String input = JOptionPane.showInputDialog("Ingresa el número inicial (ej: 1):");
                ProgramFactory countUpFactory = new CountUpFactory();
                program = countUpFactory.createProgram();
                program.run(input);
            }
            case "Reverser" -> {
                program = new Reverser();
                program.run("Reverser"); // Se pasa a sí mismo como entrada
            }
            default -> {
                System.out.println("Selección no válida.");
                return;
            }
        }
    }
}
