package TasksBranching;

public class Tasks10 {
    public static void main(String[] args) {
        double r1 = 3.0;
        double r2 = 5.0;

        double S1 = Math.PI * Math.pow(r1, 2);
        double S2 = Math.PI * Math.pow(r2, 2);

        if (S1 > S2) {
            System.out.println("Площадь второго круга меньше");
        } else {
            System.out.println("Площадь первого круга меньше");
        }
    }
}
