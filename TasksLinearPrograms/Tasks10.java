package TasksLinearPrograms;

public class Tasks10 {
    public static void main(String[] args) {
        double x;
        double y;

        x = 1;
        y = 2;

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println("result = " + result);

    }
}
