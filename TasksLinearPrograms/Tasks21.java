package TasksLinearPrograms;

public class Tasks21 {
    public static void main(String[] args) {
        double a = 123.456;
        double a1 = a * 1000;
        int a2 = (int) a1;
        int a3 = a2 / 1000;
        int a4 = a2 % 1000;
        double result = a4 + a3 * 0.001;
        System.out.println("Исходное число " + a);
        System.out.println("Полученное число " + result);
    }
}
