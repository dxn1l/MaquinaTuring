package selectors;

import common.Program;
import factory.CountDownFactory;
import factory.CountUpFactory;
import factory.ProgramFactory;
import  common.Reverser;

public class AbstractFactorySelector {
    public static Program create(String type) {
        ProgramFactory factory = switch (type) {
            case "CountDown" -> new CountDownFactory();
            case "CountUp" -> new CountUpFactory();
            default -> null;
        };
        if (type.equals("Reverser")) return new Reverser();
        return (factory != null) ? factory.createProgram() : null;
    }
}
