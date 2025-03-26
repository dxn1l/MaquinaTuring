package org.MaquinaTuring.program;

public class Reverser implements Program {

    private final HaltChecker haltChecker = new HaltChecker();
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    @Override
    public String getName() {
        return "Reverser";
    }

    @Override
    public void run(String input) {
        boolean result = haltChecker.willHalt(this, input);

        if (result) {
            System.out.println("HaltChecker predice que se detiene, así que Reverser entra en bucle:");
            while (running) {
                System.out.println("Reverser ejecutándose indefinidamente...");
            }
            System.out.println("Reverser fue detenido manualmente.");
        } else {
            System.out.println("HaltChecker predice que no se detiene, así que Reverser termina inmediatamente.");
        }
    }
}
