

import builder.*;
import common.Program;
import selectors.AbstractFactorySelector;
import selectors.BuilderSelector;
import selectors.PrototypeSelector;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String[] patrones = {"Abstract Factory", "Builder", "Prototype"};
        String patron = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona un patrón de diseño:",
                "Comparador de Patrones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                patrones,
                patrones[0]
        );

        String[] programas = {"CountDown", "CountUp", "Reverser"};
        String eleccion = (String) JOptionPane.showInputDialog(
                null,
                "Selecciona el programa:",
                "Simulación",
                JOptionPane.QUESTION_MESSAGE,
                null,
                programas,
                programas[0]
        );

        String input = JOptionPane.showInputDialog("Ingresa el número inicial (por ej. 10):");

        Program program = null;

        switch (patron) {
            case "Abstract Factory" -> {
                program = AbstractFactorySelector.create(eleccion);
            }
            case "Builder" -> {
                program = BuilderSelector.create(eleccion);
            }
            case "Prototype" -> {
                program = PrototypeSelector.create(eleccion);
            }
        }

        if (program != null) {
            program.run(input);
        } else {
            System.out.println("Programa no válido o error al construir.");
        }
    }
}
