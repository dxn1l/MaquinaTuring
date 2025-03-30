package selectors;

import builder.*;
import common.Program;
import common.Reverser;

public class BuilderSelector {

    public static Program create(String type) {
        if ("Reverser".equalsIgnoreCase(type)) {
            return new Reverser();
        }

        ProgramBuilder builder = switch (type) {
            case "CountDown" -> new ConcreteCountDownBuilder();
            case "CountUp" -> new ConcreteCountUpBuilder();
            default -> null;
        };

        if (builder == null) return null;

        Director director = new Director();
        director.setBuilder(builder);
        return director.constructProgram();
    }
}

