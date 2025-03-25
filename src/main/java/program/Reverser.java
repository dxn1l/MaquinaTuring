package program;

import checker.HaltChecker;

public class Reverser implements Program {

    private final HaltChecker haltChecker = new HaltChecker();

    @Override
    public String getName() {
        return "Reverser";
    }

    @Override
    public void run(String input) {
        boolean result = haltChecker.willHalt(this, input);

        if (result) {
            System.out.println("HaltChecker predice que se detiene, así que Reverser entra en bucle:");
            while (true) {
                System.out.println("Reverser ejecutándose indefinidamente...");
            }
        } else {
            System.out.println("HaltChecker predice que no se detiene, así que Reverser termina inmediatamente.");
        }
    }
}
