package TasksBranching;

import java.util.Scanner;

public class Tasks24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Давай погадаем!");
        System.out.println("Введи количество лепестков твоей ромашки");
        System.out.print(">");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("любит");
        } else {
            System.out.println("не любит");
        }
    }
}
