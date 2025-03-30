package selectors;

import Prototype.cache.BundledShapeCache;
import Prototype.shapes.Shape;
import common.Program;
import common.Reverser;

public class PrototypeSelector {

    public static Program create(String type) {
        if ("Reverser".equalsIgnoreCase(type)) {
            return new Reverser(); // reutilizamos Reverser
        }

        BundledShapeCache cache = new BundledShapeCache();

        // Adaptamos Shape a Program con una clase anónima
        Shape shape = switch (type) {
            case "CountDown" -> cache.get("Big green circle");         // puedes mapear libremente
            case "CountUp" -> cache.get("Medium blue rectangle");
            default -> null;
        };

        if (shape == null) return null;

        return new Program() {
            @Override
            public String getName() {
                return type + " (clonado)";
            }

            @Override
            public void run(String input) {
                System.out.println("Clonado usando Prototype: " + shape.getClass().getSimpleName());
                System.out.println("Posición: (" + shape.x + ", " + shape.y + ")");
                System.out.println("Color: " + shape.color);
            }
        };
    }
}
