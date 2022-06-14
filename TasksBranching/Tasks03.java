package TasksBranching;

import java.util.Scanner;

public class Tasks03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число а: ");
        int a = sc.nextInt();
        System.out.println("Вы ввели " + a);

        int b = 3;

        if (a < b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
