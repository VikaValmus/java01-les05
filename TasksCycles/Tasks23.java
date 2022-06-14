package TasksCycles;

public class Tasks23 {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double h = 0.2;
        double f;

        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "f");
        System.out.println("-------------------------");

        for (double x = a; x <= b; x = x + h) {
            f = 1/Math.tan(x/3) + 0.5 * Math.sin(x);
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, f);
        }
        System.out.println("-------------------------");
    }
}
