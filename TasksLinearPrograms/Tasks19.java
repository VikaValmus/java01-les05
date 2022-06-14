package TasksLinearPrograms;

public class Tasks19 {
    public static void main(String[] args) {
        double a = 3;

        double s = Math.pow(a, 3) * Math.sqrt(3) / 4;
        double h = a * Math.sqrt(3) / 2;
        double R = a / Math.sqrt(3);
        double r = a / (2 * Math.sqrt(3));

        System.out.println("площадь треугольника = " + s);
        System.out.println("высота треугольника = " + h);
        System.out.println("радиус описанной окружности = " + R);
        System.out.println("радиус вписанной окружности = " + r);

    }
}
