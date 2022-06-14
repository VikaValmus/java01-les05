package TasksLinearPrograms;

public class Tasks09 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;

        a = 4;
        b = 6;
        c = 2;
        d = 3;

        double result = a / c * b / d - (a * b - c) / c * d;
        System.out.println("result = " + result);
    }
}
