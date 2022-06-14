package TasksCycles;

public class Tasks10 {
    public static void main(String[] args) {
        long x = 1;
        long z = 1;
        long a;
        while (x <= 200) {
            System.out.print(x + " ");
            a = (long) Math.pow(x, 2);
            z = z * a;
            x++;
        }
        System.out.println();
        System.out.println("произведения квадратов первых двухсот чисел = " + z);
    }
}
