package TasksCycles;

public class Tasks09 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        int a;
        while (x <= 100) {
            System.out.print(x + " ");
            a = (int) Math.pow(x, 2);
            sum += a;
            x++;
        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}
