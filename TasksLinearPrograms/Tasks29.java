package TasksLinearPrograms;

public class Tasks29 {
    public static void main(String[] args) {

        int a = 4;
        int b = 6;
        int c = 3;
        double alpha;
        double beta;
        double gamma;

        if (a + b > c || b + c > a || a + c > a) {
            alpha = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c));
            System.out.println("Угол  alpha = " + alpha + " радиан");
            System.out.println("Угол  alpha " + alpha + " радиан = " + alpha * 180 / Math.PI + " градусов");
            System.out.println();

            beta = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
            System.out.println("Угол  beta = " + beta + " радиан");
            System.out.println("Угол  beta = " + beta + " радиан = " + beta * 180 / Math.PI + " градусов");
            System.out.println();

            gamma = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c));
            System.out.println("Угол  gamma = " + gamma + " радиан");
            System.out.println("Угол  gamma = " + gamma + " радиан = " + gamma * 180 / Math.PI + " градусов");

        } else {
            System.out.println("треугольник является  не треугольником");
        }
    }
}
