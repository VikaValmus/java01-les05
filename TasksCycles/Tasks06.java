package TasksCycles;

import java.util.Scanner;

public class Tasks06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int a = 1;

        do {
            System.out.print("> ");
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print("> ");
            }
            x = sc.nextInt();
            sc.nextLine();
        } while (x < 0);

        int sum = 0;
        for (int i = a; i < x; i++) {
            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("sum = " + sum);
    }
}

