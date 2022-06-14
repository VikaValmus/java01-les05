package TasksCycles;

public class Tasks22 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double h = 0.1;
        double f;

        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "f");
        System.out.println("-------------------------");

        for (double x = a; x <= b; x = x + h) {
            f = Math.pow(Math.sin(x), 2);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, f);
        }
        System.out.println("-------------------------");
    }
}
