package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int t =numberToPrint;
        for (int i = 0; i <power -1; i++) {
            numberToPrint*=t;
        }
        System.out.println(numberToPrint);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
