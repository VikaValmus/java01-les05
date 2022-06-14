package TasksLinearPrograms;

public class Tasks16 {
    public static void main(String[] args) {
        int x = 1234;
        int x1 = x / 1000;
        int x2 = x % 1000 / 100;
        int x3 = x % 100 / 10;
        int x4 = x % 10;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);

        int result = x1 * x2 * x3 * x4;
        System.out.println("result = " + result);
    }
}
