package TasksCycles;

public class Tasks08 {
    public static void main(String[] args) {
        double a = 3;
        double b = 5;
        double h = 0.5;
        int c = 2;
        for (double x = a; x <= b; x = x + h) {
            if (x == 15) {
                System.out.println((x + c) * 2);
            } else {
                System.out.println((x - c) + 6);
            }
        }
    }
}
