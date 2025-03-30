package selectors;

import common.Program;

public class ProgramSelector {

    public static Program getProgram(String patron, String tipo) {
        return switch (patron) {
            case "Abstract Factory" -> AbstractFactorySelector.create(tipo);
            case "Builder" -> BuilderSelector.create(tipo);
            case "Prototype" -> PrototypeSelector.create(tipo);
            default -> null;
        };
    }
}