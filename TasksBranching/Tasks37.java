package TasksBranching;

public class Tasks37 {
    public static void main(String[] args) {
        double x = 4;
        double f;

        if (x >= 3) {
            f = Math.pow(-x, 2) + (3 * x) + 9;
            System.out.println("Значение функции f = " + f);
        } else if (x < 3) {
            f = 1 / (Math.pow(x, 3) - 6);
            System.out.println("Значение функции f = " + f);
        }
    }
}
