package TasksCycles;

import java.util.Random;
import java.util.Scanner;

public class Tasks31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a;
        int b;
        for (int i = 1; i <= 5; i++) {
            a = random.nextInt(1, 15);
            System.out.println("Угадайте число от 1 до 15");
            b = scanner.nextInt();
            if (a == b) {
                System.out.println(a + "=" + b);
                System.out.println("вы угадали число");
            } else {
                System.out.println(a);
                System.out.println(b);
                System.out.println("Не верное число");
            }
        }
    }
}
