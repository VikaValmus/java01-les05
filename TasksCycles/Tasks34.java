package TasksCycles;

public class Tasks34 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int sum;
        for (int i = 1000; i < 10000; i++) {
            a = (i % 100) % 10; // четвертая цифра
            b = (i % 100) / 10; // третья цифра
            c = (i % 1000) / 100; // вторая цифра
            d = i / 1000; // первая цифра
            sum = a + b + c + d;
            if (sum == 15) {
                System.out.print(i + " ");
            }

        }
    }
}
