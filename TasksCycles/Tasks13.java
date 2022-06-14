package TasksCycles;

public class Tasks13 {
    public static void main(String[] args) {
        double a = -5;
        double b = 5;
        double h = 0.5;
        double y;

        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("-------------------------");

        for (double x = a; x <= b; x = x + h) {
            y = 5 - Math.pow(x, 2) / 2;
            System.out.printf("|\t%4.3f\t|\t%4.3f\t|\n", x, y);
        }
        System.out.println("-------------------------");
    }
}
