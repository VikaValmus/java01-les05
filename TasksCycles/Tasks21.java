package TasksCycles;

public class Tasks21 {
    public static void main(String[] args) {
        double a = 1;
        double b = 5;
        double h = 0.5;
        double f;

        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "f");
        System.out.println("-------------------------");

        for (double x = a; x <= b; x = x + h) {
            f = x - Math.sin(x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, f);
        }
        System.out.println("-------------------------");
    }
}
