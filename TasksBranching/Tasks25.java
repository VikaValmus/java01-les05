package TasksBranching;

import java.util.Scanner;

public class Tasks25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в вашем помещении: ");
        double t = sc.nextDouble();
        if (t > 60) {
            System.out.println("Пожароопасная ситуация!");
        }
    }
}
