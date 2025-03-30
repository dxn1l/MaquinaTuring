import common.Program;
import selectors.AbstractFactorySelector;
import selectors.BuilderSelector;
import selectors.PrototypeSelector;


import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String[] patrones = {"Abstract Factory", "Builder", "Prototype" , "Comparar los tres"};
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
            case "Comparar los tres" -> comparePatterns();
        }

        if (program != null) {
            program.run(input);
        } else {
            System.out.println("Programa no válido o error al construir.");
        }
    }

    public static void comparePatterns() {
        String tipo = "CountDown";

        long startAF = System.nanoTime();
        Program af = AbstractFactorySelector.create(tipo);
        long endAF = System.nanoTime();

        long startBuilder = System.nanoTime();
        Program builder = BuilderSelector.create(tipo);
        long endBuilder = System.nanoTime();

        long startPrototype = System.nanoTime();
        Program proto = PrototypeSelector.create(tipo);
        long endPrototype = System.nanoTime();

        long afTime = endAF - startAF;
        long builderTime = endBuilder - startBuilder;
        long protoTime = endPrototype - startPrototype;

        System.out.println("🔍 Comparación de patrones usando '" + tipo + "'");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-20s | %15s%n", "Patrón", "Tiempo de construcción");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-20s | %15d ns%n", "Abstract Factory", afTime);
        System.out.printf("%-20s | %15d ns%n", "Builder", builderTime);
        System.out.printf("%-20s | %15d ns%n", "Prototype", protoTime);
        System.out.println("----------------------------------------------------");

        System.out.println("\n🗣 Comentarios:");
        System.out.println("- Abstract Factory: Muy estructurado, ideal para familias de objetos.");
        System.out.println("- Builder: Flexible para construir objetos paso a paso.");
        System.out.println("- Prototype: Rápido cuando ya tienes prototipos definidos.");

        String recomendado;
        if (afTime <= builderTime && afTime <= protoTime) {
            recomendado = "Abstract Factory";
        } else if (builderTime <= afTime && builderTime <= protoTime) {
            recomendado = "Builder";
        } else {
            recomendado = "Prototype";
        }

        System.out.println("\n✅ Recomendación basada en rapidez de construcción: " + recomendado);
    }

}
