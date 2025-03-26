package org.MaquinaTuring.program;

public class HaltChecker {

    public boolean willHalt(Program program, String input) {
        String name = program.getName();

        if (name.equalsIgnoreCase("CountDown")) {
            return true;
        } else if (name.equalsIgnoreCase("CountUp")) {
            return false;
        } else if (name.equalsIgnoreCase("Reverser")) {
            System.out.println("⚠️ Paradoja detectada al analizar Reverser con sí mismo.");
            return false;
        }

        return true;
    }
}
