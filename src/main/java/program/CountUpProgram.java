package program;

public class CountUpProgram implements Program {

    private volatile boolean running = true;

    public void stop() {
        running = false;
    }


    @Override
    public String getName() {
        return "CountUp";
    }

    @Override
    public void run(String input) {
        int num = Integer.parseInt(input);
        while (running) {
            System.out.println(num);
            num++;

            try {
                Thread.sleep(10); // ✅ Le da oportunidad a detenerse
            } catch (InterruptedException ignored) {}
        }
        System.out.println("Programa CountUp terminado (detenido externamente).");
        }

}