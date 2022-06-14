package TasksBranching;

public class Tasks38 {
    public static void main(String[] args) {
        double x = 2;
        double f;
        if (x >= 0 && x <= 3) {
            f = Math.pow(x, 2);
            System.out.println("Значение функции f = " + f);
        } else if (x > 3 || x < 0) {
            System.out.println("4");
        }
    }
}
