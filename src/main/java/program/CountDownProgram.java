package program;

public class CountDownProgram implements Program {

    @Override
    public String getName() {
        return "CountDown";
    }

    @Override
    public void run(String input) {
        int num = Integer.parseInt(input);
        while (num > 0) {
            System.out.println(num);
            num--;
        }
        System.out.println("¡Programa CountDown ha terminado!");
    }
}