package TasksCycles;

public class Tasks11 {
    public static void main(String[] args) {
        int x = 1;
        int z = 1;
        while (x <= 200) {
            z = (int) (z - Math.pow(x, 3));
            x++;
        }
        System.out.println();
        System.out.println("разность кубов первых двухсот чисел = " + z);
    }
}
