package TasksBranching;

import java.util.Scanner;

public class Tasks23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("day >");
        int day = sc.nextInt();

        System.out.println("month >");
        int month = sc.nextInt();

        if (day > 1 && day < 31 && month > 1 && month < 12) {
            System.out.println("данные введены правильно");
        } else {
            System.out.println("данные введены некорректно");
        }


    }
}
