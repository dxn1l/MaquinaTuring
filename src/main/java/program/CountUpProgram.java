package program;

public class CountUpProgram implements Program {

    @Override
    public String getName() {
        return "CountUp";
    }

    @Override
    public void run(String input) {
        int num = Integer.parseInt(input);
        while (true) {
            System.out.println(num);
            num++;
        }
    }
}