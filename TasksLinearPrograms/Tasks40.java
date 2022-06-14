package TasksLinearPrograms;

public class Tasks40 {
    public static void main(String[] args) {
        double x = 1.2;
        double x1 = x * x;
        double result = x * (-2 + 3 * x - 4 * x1);
        double result2 = 1 + x * (2 + 3 * x + 4 * x1);
        System.out.println("result = " +result);
        System.out.println("result2 = " +result2);
    }
}
