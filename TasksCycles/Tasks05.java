package TasksCycles;

public class Tasks05 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a <= 99) {
            sum = sum + a;
            a = a + 2;
        }
        System.out.print(sum);
    }
}

