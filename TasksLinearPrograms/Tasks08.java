package TasksLinearPrograms;

public class Tasks08 {
    public static void main(String[] args) {
        double a = 2;
        double b = 5;
        double c = 3;

        double result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * b)) / (2 * a) + (Math.pow(a, -3) * c) + Math.pow(b, -2);

        System.out.println("result = " + result);
    }
}
