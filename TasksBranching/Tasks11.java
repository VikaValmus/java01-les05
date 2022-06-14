package TasksBranching;

public class Tasks11 {
    public static void main(String[] args) {
        double a1 = 2.3;
        double b1 = 3.0;

        double a2 = 1.3;
        double b2 = 3.0;

        double S1 = a1 * b1 / 2;
        double S2 = a2 * b2 / 2;

        if (S1 > S2) {
            System.out.println("площадь второго круга меньше");
        } else {
            System.out.println("площадь первого круга меньше");
        }
    }
}
