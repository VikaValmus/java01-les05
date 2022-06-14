package TasksBranching;

public class Tasks07 {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 1.0;
        double c = 2.0;
        double x = 4.0;

        double vyrazheniya = a * x * x + b * x + c;

        double module = Math.abs(vyrazheniya);
        System.out.println("Модуль выражения = " + module);

    }
}
