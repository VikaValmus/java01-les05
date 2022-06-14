package TasksCycles;

public class Tasks07 {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double h = 0.5;

        for (double x = a; x <= b; x = x + h) {
            if (x <= 2) {
                System.out.println(-x);
            } else if (x > 2) {
                System.out.println(x);
            }
        }
    }
}
